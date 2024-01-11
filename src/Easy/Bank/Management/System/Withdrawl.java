package Easy.Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1, b2;

    Withdrawl(String pin) {

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1710, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 830);
        add(image);

        JLabel l1 = new JLabel("MAXIMUM WITHDRAWL IS Rs. 10,000");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.RED);
        l1.setBounds(400, 180, 600, 35);
        image.add(l1);

        JLabel l2 = new JLabel("PLEASE ENTER AMOUNT YOU WANT TO WITHDRAW");
        l2.setFont(new Font("System", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        l2.setBounds(360, 220, 500, 35);
        image.add(l2);

        textField = new TextField(10);
        textField.setFont(new Font("Raleway", Font.BOLD, 35));
        textField.setForeground(Color.WHITE);
        textField.setBackground(new Color(2, 34, 114, 255));
        textField.setBounds(380, 270, 320, 42);
        image.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(new Color(31, 107, 33));
        b1.setForeground(Color.WHITE);
        b1.setBounds(660, 360, 120, 35);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(new Color(96, 12, 12));
        b2.setForeground(Color.WHITE);
        b2.setBounds(660, 410, 120, 35);
        b2.addActionListener(this);
        add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Conn c = new Conn();
                    ResultSet resultSet =
                            c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', " +
                            "'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    new Main_Class(pin);
                    setVisible(false);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            new Main_Class(pin);
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Withdrawl("");
    }

}
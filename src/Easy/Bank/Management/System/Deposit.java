package Easy.Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    TextField textField;

    JButton b1, b2;

    Deposit(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1710, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 830);
        add(image);

        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSITE");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(400, 180, 400, 35);
        image.add(l1);

        textField = new TextField(10);
        textField.setFont(new Font("Raleway", Font.BOLD, 35));
        textField.setForeground(Color.WHITE);
        textField.setBackground(new Color(2, 34, 114, 255));
        textField.setBounds(400, 230, 320, 42);
        image.add(textField);

        b1 = new JButton("DEPOSIT");
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
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount to be deposited");
                    return;
                } else {
                    Conn conn = new Conn();
                    conn.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "'," + "'Deposit', " + "'" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposited Successfully");
                    new Main_Class(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == b2) {
                new Main_Class(pin);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}


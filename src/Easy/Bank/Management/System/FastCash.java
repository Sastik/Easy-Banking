package Easy.Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1710, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 830);
        add(image);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setFont(new Font("System", Font.BOLD, 23));
        label.setForeground(Color.WHITE);
        label.setBounds(350, 180, 700, 35);
        image.add(label);

        b1 = new JButton("Rs. 100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(2, 34, 114, 255));
        b1.setBounds(300, 270, 150, 35);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(2, 34, 114, 255));
        b2.setBounds(630, 270, 150, 35);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(2, 34, 114, 255));
        b3.setBounds(300, 318, 150, 35);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(2, 34, 114, 255));
        b4.setBounds(630, 318, 150, 35);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(2, 34, 114, 255));
        b5.setBounds(300, 362, 150, 35);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(2, 34, 114, 255));
        b6.setBounds(630, 362, 150, 35);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("BACK");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(96, 12, 12));
        b7.setBounds(630, 406, 150, 35);
        b7.addActionListener(this);
        image.add(b7);

        setLayout(null);
        setSize(1550, 830);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b7) {
            new Main_Class(pin);
            setVisible(false);
        } else {
            String amount = ((JButton) e.getSource()).getText().substring(4);
            Conn conn = new Conn();
            Date date = new Date();
            try {
                ResultSet resultSet =
                        conn.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if (e.getSource() != b7 && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }
                conn.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "', " +
                        "'withdrawl', '" + amount + "')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
            } catch (Exception E) {
                E.printStackTrace();
            }
            new Main_Class(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}

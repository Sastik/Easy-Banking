package Easy.Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {
    String pin;
    JLabel l2;
    JButton b1;

    BalanceEnquriy(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1710, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 830);
        add(image);

        JLabel l1 = new JLabel("Your Current Balance is RS");
        l1.setFont(new Font("System", Font.BOLD, 20));
        l1.setForeground(Color.GREEN);
        l1.setBounds(400, 180, 600, 35);
        image.add(l1);

        l2 = new JLabel();
        l2.setFont(new Font("System", Font.BOLD, 25));
        l2.setForeground(Color.WHITE);
        l2.setBounds(500, 250, 500, 35);
        image.add(l2);

        b1 = new JButton("BACK");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(new Color(96, 12, 12));
        b1.setForeground(Color.WHITE);
        b1.setBounds(660, 410, 120, 35);
        b1.addActionListener(this);
        add(b1);

        int balance = 0;
        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '" + pin + "'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        l2.setText("" + balance + "/-");

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Main_Class(pin);
        setVisible(false);
    }

    public static void main(String[] args) {
        new BalanceEnquriy("");
    }
}


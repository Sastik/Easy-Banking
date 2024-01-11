package Easy.Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {

    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    Main_Class(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1710, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 830);
        add(image);

        JLabel label = new JLabel("Please Select Your Transection");
        label.setFont(new Font("System", Font.BOLD, 27));
        label.setForeground(Color.WHITE);
        label.setBounds(340, 180, 700, 35);
        image.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(300,270,150,35);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(630,270,150,35);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(300,318,150,35);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(630,318,150,35);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(2, 34, 114, 255));
        b5.setBounds(300,362,150,35);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(31, 107, 33));
        b6.setBounds(630,362,150,35);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("EXIT");
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
        try{
            if (e.getSource() == b1) {
                new Deposit(pin);
                setVisible(false);
            } else if (e.getSource() == b2) {
                new Withdrawl(pin);
                setVisible(false);
            } else if (e.getSource() == b3) {
                new FastCash(pin);
                setVisible(false);
            } else if (e.getSource() == b4) {
                new MiniStatement(pin);
                setVisible(false);
            } else if (e.getSource() == b5) {
                new ChangePin(pin);
                setVisible(false);
            } else if (e.getSource() == b6) {
                new BalanceEnquriy(pin);
                setVisible(false);
            } else if (e.getSource() == b7) {
                System.exit(0);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main_Class("");
    }
}


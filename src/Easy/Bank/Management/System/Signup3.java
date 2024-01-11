package Easy.Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    String formno;
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;

    JButton s, c;


    Signup3(String formno) {
        super("Application Form");

        this.formno = formno;

        JLabel label1 = new JLabel("Form No. " + formno);
        label1.setBounds(600, 20, 600, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(label1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l2 = new JLabel("Page 3 : Account Details");
        l2.setBounds(330, 70, 600, 30);
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l2);

        JLabel l3 = new JLabel("Account Type : ");
        l3.setBounds(100, 120, 230, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(215, 252, 252));
        r1.setBounds(100, 160, 230, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(215, 252, 252));
        r2.setBounds(350, 160, 230, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(215, 252, 252));
        r3.setBounds(100, 190, 230, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(215, 252, 252));
        r4.setBounds(350, 190, 260, 30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number : ");
        l4.setBounds(100, 240, 150, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setBounds(100, 270, 200, 20);
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-6424");
        l6.setBounds(330, 240, 250, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM Card/cheque book and statements)");
        l7.setBounds(330, 270, 500, 12);
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l7);

        JLabel l8 = new JLabel("PIN : ");
        l8.setBounds(100, 310, 150, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l8);

        JLabel l9 = new JLabel("X X X X");
        l9.setBounds(330, 310, 150, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l9);

        JLabel l10 = new JLabel("(4-digit password)");
        l10.setBounds(100, 340, 500, 12);
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l10);

        JLabel l11 = new JLabel("Service required : ");
        l11.setBounds(100, 390, 150, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(100, 430, 150, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(250, 430, 150, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(440, 430, 150, 30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(100, 460, 150, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(250, 460, 150, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("Raleway", Font.BOLD, 14));
        c6.setBounds(440, 460, 150, 30);
        add(c6);

        c7 = new JCheckBox("I here by declares that the above information is correct to the best " +
                "of my knowledge", true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(90, 520, 600, 20);
        add(c7);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(220, 560, 100, 30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420, 560, 100, 30);
        c.addActionListener(this);
        add(c);

        setSize(850, 650);
        getContentPane().setBackground(new Color(215, 252, 252));
        setLocation(250, 50);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String atype= null;
            if (r1.isSelected()) {
                atype = "Saving Alignment";
            }else if (r2.isSelected()) {
                atype = "Fixed Deposit Account";
            }else if (r3.isSelected()) {
                atype = "Current Account";
            }else if (r4.isSelected()) {
                atype = "Recurring Deposit Account";
            }
            if(atype == null ){
                JOptionPane.showMessageDialog(null, "Please Select Account Type");
                return;
            }

            Random rand = new Random();
            long first7 = (rand.nextLong() % 90000000L) + 1409963000000000L;
            String cardno = "" + Math.abs(first7);

            long first3 = (rand.nextLong() % 9000L)+ 1000L;
            String pin = "" + Math.abs(first3);

            String fac ="";
            if (c1.isSelected()) {
                fac += "ATM Card ";
            }if (c2.isSelected()) {
                fac += "Internet Banking ";
            }if (c3.isSelected()) {
                fac += "Mobile Banking ";
            }if (c4.isSelected()) {
                fac += "Email Alerts ";
            }if (c5.isSelected()) {
                fac += "Cheque Book ";
            }if (c6.isSelected()) {
                fac += "E-Statement ";
            }
            if(fac.equals("")){
                JOptionPane.showMessageDialog(null, "Please Select atleast one facility");
                return;
            }

            try{
                if(e.getSource()==s){
                    if(atype.equals("")){
                        JOptionPane.showMessageDialog(null, "Failed all the fields are required");
                    }else{
                        Conn c1 = new Conn();
                        String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                        String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                        c1.statement.executeUpdate(q1);
                        c1.statement.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\nPin: " + pin);
                        new Deposit(pin);
                        setVisible(false);
                    }
                } else if (e.getSource()==c) {
                    System.exit(0);
                }
            }catch (Exception E) {
                E.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}


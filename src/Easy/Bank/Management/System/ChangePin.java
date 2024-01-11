package Easy.Bank.Management.System;

import com.sun.jdi.event.StepEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {

    JButton b1, b2;
    JPasswordField p1, p2;

    String pin;

    ChangePin(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1710, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 830);
        add(image);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 17));
        l1.setForeground(Color.WHITE);
        l1.setBounds(450, 180, 400, 35);
        image.add(l1);

        JLabel l2 = new JLabel("NEW PIN: ");
        l2.setFont(new Font("System", Font.BOLD, 13));
        l2.setForeground(Color.WHITE);
        l2.setBounds(330, 240, 400, 35);
        image.add(l2);

        p1 = new JPasswordField();
        p1.setFont(new Font("Raleway", Font.BOLD, 35));
        p1.setForeground(Color.BLACK);
        p1.setBackground(new Color(243, 217, 85, 255));
        p1.setBounds(490, 240, 200, 35);
        image.add(p1);

        JLabel l3 = new JLabel("RE-ENTER NEW PIN: ");
        l3.setFont(new Font("System", Font.BOLD, 13));
        l3.setForeground(Color.WHITE);
        l3.setBounds(330, 290, 400, 35);
        image.add(l3);

        p2 = new JPasswordField();
        p2.setFont(new Font("Raleway", Font.BOLD, 35));
        p2.setForeground(Color.BLACK);
        p2.setBackground(new Color(243, 217, 85, 255));
        p2.setBounds(490, 290, 200, 35);
        image.add(p2);

        b1 = new JButton("SAVE");
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
//        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String newpin = p1.getText();
            String repin = p2.getText();

            if(!newpin.equals(repin)) {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            if(e.getSource() == b1) {

                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Conn c = new Conn();
                String q1 = "update bank set pin = '"+newpin+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+newpin+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+newpin+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new Main_Class(pin);
            }else if (e.getSource()==b2) {
                new Main_Class(pin);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main (String[] args){
        new ChangePin("");
    }
}


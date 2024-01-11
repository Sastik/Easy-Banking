package Easy.Bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName, textFname, textEmail, textAdd, textMob, textAdhar, textCity, textState, textPin;
    Random ran = new Random();
    long first5 = (ran.nextLong() % 900000L) + 100000L;
    String first = " " + Math.abs(first5);
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, r4, r5;
    JButton next;

    Signup() {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 30));
        add(label1);

        JLabel label2 = new JLabel("Page 1: Personal Details");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label2);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 17));
        labelName.setBounds(100, 140, 100, 30);
        add(labelName);

        textName = new JTextField(15);
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 140, 300, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name : ");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 17));
        labelfName.setBounds(100, 190, 200, 30);
        add(labelfName);

        textFname = new JTextField(15);
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 190, 300, 30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth : ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 17));
        DOB.setBounds(100, 240, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        dateChooser.setDateFormatString("yyyy-MM-dd");
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 330, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Raleway", Font.BOLD, 17));
        labelG.setBounds(100, 280, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 280, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(380, 280, 90, 30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(222, 255, 228));
        r3.setBounds(490, 280, 90, 30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email id : ");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 17));
        labelEmail.setBounds(100, 330, 200, 30);
        add(labelEmail);

        textEmail = new JTextField(15);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 330, 300, 30);
        add(textEmail);

        JLabel labelMob = new JLabel("Mobile No : ");
        labelMob.setFont(new Font("Raleway", Font.BOLD, 17));
        labelMob.setBounds(100, 380, 200, 30);
        add(labelMob);

        textMob = new JTextField(15);
        textMob.setFont(new Font("Raleway", Font.BOLD, 14));
        textMob.setBounds(300, 380, 300, 30);
        add(textMob);

        JLabel labelAdhar = new JLabel("Adhar-Card No : ");
        labelAdhar.setFont(new Font("Raleway", Font.BOLD, 17));
        labelAdhar.setBounds(100, 430, 250, 30);
        add(labelAdhar);

        textAdhar = new JTextField(15);
        textAdhar.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdhar.setBounds(300, 430, 300, 30);
        add(textAdhar);

        JLabel labelAdd = new JLabel("Permanent Address : ");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 17));
        labelAdd.setBounds(100, 480, 250, 30);
        add(labelAdd);

        textAdd = new JTextField(15);
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 480, 300, 40);
        add(textAdd);

        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Raleway", Font.BOLD, 17));
        labelState.setBounds(100, 530, 80, 30);
        add(labelState);

        textState = new JTextField(15);
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(160, 530, 150, 30);
        add(textState);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 17));
        labelCity.setBounds(350, 530, 80, 30);
        add(labelCity);

        textCity = new JTextField(15);
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(400, 530, 130, 30);
        add(textCity);

        JLabel labelPin = new JLabel("PIN : ");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 17));
        labelPin.setBounds(570, 530, 80, 30);
        add(labelPin);

        textPin = new JTextField(15);
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(630, 530, 130, 30);
        add(textPin);

        JLabel labelMs = new JLabel("Marital Status : ");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 17));
        labelMs.setBounds(100, 580, 200, 30);
        add(labelMs);

        r4 = new JRadioButton("Unmaried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(222, 255, 228));
        r4.setBounds(300, 580, 100, 30);
        add(r4);

        r5 = new JRadioButton("Married");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(new Color(222, 255, 228));
        r5.setBounds(430, 580, 90, 30);
        add(r5);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r4);
        buttonGroup2.add(r5);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 610, 100, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 700);
        getContentPane().setBackground(new Color(222, 255, 228));
        setLocation(250, 30);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formNo = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }

        String mobile = textMob.getText();
        String adhar = textAdhar.getText();
        String email = textEmail.getText();
        String address = textAdd.getText();
        String city = textCity.getText();
        String state = textState.getText();
        String pincode = textPin.getText();
        String marital = null;
        if (r4.isSelected()) {
            marital = "Unmaried";
        } else if (r5.isSelected()) {
            marital = "Married";
        }
        try {
            if (textName.getText().equals("") || textMob.getText().equals("") || textAdhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Conn con1 = new Conn();

                // --------------------------Database & Table creation------------------
                // create database atmSystem;
                // use atmSystem;
                // create table signup(form_no varchar(30), name varchar(30), father_name
                // varchar(30), DOB varchar(30), gender varchar(30), email varchar(60),
                // mobile_no varchar(30), adhar_no varchar(30), address varchar(60), state
                // varchar(30), city varchar(30), pincode varchar(30), marital_status
                // varchar(30));
                // select * from signup;

                String q = "insert into signup values('" + formNo + "','" + name + "','" + fname + "','" + dob + "','"
                        + gender + "','" + email + "','" + mobile + "','" + adhar + "','" + address + "','" + state
                        + "','" + city + "','" + pincode + "','" + marital + "')";
                con1.statement.executeUpdate(q);
                new Signup2(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}


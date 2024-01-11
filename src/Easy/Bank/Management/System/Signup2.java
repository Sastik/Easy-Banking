package Easy.Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan;
    JRadioButton r1, r2, r3, r4;
    JButton next;

    Signup2(String formno) {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel label1 = new JLabel("Form No. " + formno);
        label1.setBounds(600, 20, 600, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(label1);

        JLabel l2 = new JLabel("Page 2: Additional Details");
        l2.setBounds(330, 70, 600, 30);
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setBounds(100, 120, 100, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l3);

        String[] religion = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(300, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setBounds(100, 170, 100, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l4);

        String[] category = { "General", "OBC", "SC", "ST", "OBC", "Other" };
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(300, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setBounds(100, 220, 100, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l5);

        String[] income = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(300, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education : ");
        l6.setBounds(100, 270, 100, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l6);

        String[] education = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate",
                "Other" };
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(300, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setBounds(100, 320, 150, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l7);

        String[] occupation = { "Student", "Salaried", "Business", "Self-Employed", "Retired",
                "Other" };
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(300, 320, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No : ");
        l8.setBounds(100, 370, 150, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l8);

        textPan = new JTextField(15);
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        textPan.setBounds(300, 370, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Senior Citizen : ");
        l9.setBounds(100, 420, 150, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l9);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(300, 420, 60, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(380, 420, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l10 = new JLabel("Existing Account : ");
        l10.setBounds(100, 470, 150, 30);
        l10.setFont(new Font("Raleway", Font.BOLD, 17));
        add(l10);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(252, 208, 76));
        r3.setBounds(300, 470, 60, 30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(252, 208, 76));
        r4.setBounds(380, 470, 90, 30);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(540, 560, 100, 30);
        next.addActionListener(this);
        add(next);

        setSize(850, 650);
        getContentPane().setBackground(new Color(252, 208, 76));
        setLocation(250, 50);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String ocu = (String) comboBox5.getSelectedItem();
        String pan = textPan.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r3.isSelected())){
            eAccount = "Yes";
        } else if (r4.isSelected()) {
            eAccount ="No";
        }
        try {
            if (textPan.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Conn c1 = new Conn();

                //  -------------------------Table creation------------------------
                //                create table signuptwo(form_no varchar(30), religion varchar(30),
                //                category varchar(30), income varchar(30), education varchar(30),
                //                occupassion varchar(60), pan varchar(30), seniorcitizen varchar(30),
                //                existing_account varchar(60));
                //                select * from signuptwo;

                String q =
                        "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+ocu+"','"+pan+"','"+scitizen+"','"+eAccount+"')";

                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");
    }
}

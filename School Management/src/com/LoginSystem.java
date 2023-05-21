package com;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginSystem implements ActionListener {

    JLabel label1;
    JLabel label2,label3,label4,heading;
    JTextField textField1;
    JPasswordField pass;
    JButton btn1;
    JButton btn2;
    JFrame f;

    public LoginSystem() {

        f= new JFrame();
        f.setVisible(true);
        f.setSize(680,577);
        f.setTitle("Login");
        f.getContentPane().setBackground(new Color(255,255,255));
        f.setLayout(null);
        f.setResizable(false);
        f.setLocation(450, 150);
        f.setDefaultCloseOperation(3);  // int 3 =JFrame.EXIT_ON_CLOSE

        heading=new JLabel("School Management");
        f.add(heading);
        heading.setBounds(200,20,400,100);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Arial", Font.BOLD,25));


        label1 = new JLabel("Username : ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.PLAIN,17));
        label2 = new JLabel("Password : ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Arial", Font.PLAIN,17));

        ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("com\\images\\15.jpg"));
        Image img= icon.getImage().getScaledInstance(690,600,Image.SCALE_SMOOTH);
        ImageIcon icon2=new ImageIcon(img);
        label4 = new JLabel(icon2);

        textField1 = new JTextField(60);
        textField1.setBorder(new EmptyBorder(0,0,0,0));
        pass = new JPasswordField(60);
        pass.setBorder(new EmptyBorder(0,0,0,0));

        btn1 = new JButton("Submit");
        btn1.setBackground(Color.white);
        btn1.setForeground(Color.black);
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setBorder(new EmptyBorder(0,0,0,0));
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn2 = new JButton("Close");
        btn2.setBackground(Color.white);
        btn2.setForeground(Color.black);
        btn2.setFocusable(false);
        btn2.setFocusPainted(false);
        btn2.setBorder(new EmptyBorder(0,0,0,0));
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        label4.add(label1);
        label4.add(label2);

        f.add(label4);
        label4.add(textField1);
        label4.add(pass);
        label4.add(btn1);
        label4.add(btn2);

        label1.setBounds(200, 160, 100, 30);
        label2.setBounds(200, 220, 100, 30);

        label4.setBounds(0, 0, 680, 540);
        textField1.setBounds(320, 168, 140, 20);
        pass.setBounds(320, 228, 140, 20);
        btn1.setBounds(240, 325, 80, 28);
        btn2.setBounds(355, 325, 80, 28);

        f.validate();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
String str=event.getActionCommand();
       if (str.equals("Submit")) {

           try {
               Connect con = new Connect();
               String s1 = textField1.getText();
               String s2 = new String(pass.getPassword());

               String query = "select * from login where username='"+s1+"' and password='"+s2+"'";
               ResultSet rs = con.st.executeQuery(query);
               if (rs.next()) {
                   new School();
                   f.setVisible(false);
               } else {
                   JOptionPane.showMessageDialog(f, "Invalid login","Try Again",JOptionPane.WARNING_MESSAGE);
               }
               con.c.close();
           }
           catch(Exception e){
               e.printStackTrace();
           }
        }

       if (str.equals("Close")) {
             f.setVisible(false);
        }
    }
    public static void main (String args[])
    {
        new LoginSystem();
    }
}

package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.File;
import java.sql.ResultSet;

public class Add_Faculty implements ActionListener{

    JFrame f;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label14,label15,label16,label17,label18,label19,label20;
    JButton btn1,btn2,btn3;
    JTextField textField1,textField2,textField3,textField4,textField5,textField7,textField8,textField9,textField10,textField11;
    JComboBox comboBox1;
    String photo="";

    public Add_Faculty(){

        f= new JFrame("Add Faculty");
        f.setVisible(true);
        f.setSize(690,600);
        f.setLocation(405,150);
        f.getContentPane().setBackground(Color.WHITE);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.setVisible(false);
            }
        });
        f.setLayout(null);

        label1=new JLabel("Faculty Name");
        label2=new JLabel("Faculty ID");
        label3=new JLabel("Email Id");
        label4=new JLabel("Address");
        label5=new JLabel("Gender");
        label6=new JLabel("Position");
        label7=new JLabel("DOB");
        label8=new JLabel("Qualification");
        label9=new JLabel("Experience");
        label10=new JLabel("Phone No.");
        label14=new JLabel("New Faculty");
        label15=new JLabel("Joining Date");

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\avatar.jpg"));
        Image myimage1 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        label16=new JLabel(new ImageIcon(myimage1));
        label16.setBackground(Color.LIGHT_GRAY);
        Font myfont= new Font("Arial",Font.TRUETYPE_FONT,16);
        label14.setFont(myfont);
        label14.setForeground(Color.BLACK);

        label17=new JLabel();
        label18=new JLabel();

        ImageIcon icon4= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon9.png"));
        Image img4= icon4.getImage().getScaledInstance(48,48,Image.SCALE_SMOOTH);
        ImageIcon newicon4=new ImageIcon(img4);
        label20=new JLabel(newicon4);

        btn1=new JButton("Add");
        btn1.setBackground(new Color(255,0,0));
        btn1.setForeground(Color.white);
        btn1.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn2=new JButton("Cancel");
        btn2.setBackground(new Color(255,0,0));
        btn2.setForeground(Color.white);
        btn2.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn2.setFocusPainted(false);
        btn2.setFocusable(false);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn3=new JButton("Photo");
        Font myfont1= new Font("Arial",Font.BOLD,10);
        btn3.setFont(myfont1);
        btn3.setBackground(new Color(255,255,255));
        btn3.setForeground(Color.BLACK);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.setFocusable(false);
        btn3.setFocusPainted(false);
        ImageIcon btn_icon1=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon12.png"));
        Image newImage1=btn_icon1.getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH);
        ImageIcon newIcon1=new ImageIcon(newImage1);
        btn3.setIcon(newIcon1);

        btn3.addActionListener(this);

        String gender[]={"Male","Female"};

        comboBox1= new JComboBox(gender);
        comboBox1.setFocusable(false);
        comboBox1.setBackground(Color.WHITE);
        textField1= new JTextField(20);
        textField2= new JTextField(20);
        textField3= new JTextField(20);
        textField4= new JTextField(20);
        textField5= new JTextField(20);
        textField7= new JTextField(20);
        textField8= new JTextField(20);
        textField9= new JTextField(20);
        textField10= new JTextField(20);
        textField11= new JTextField(20);

        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(label4);
        f.add(label5);
        f.add(label6);
        f.add(label7);
        f.add(label8);
        f.add(label9);
        f.add(label10);
        f.add(label14);
        f.add(label15);
        f.add(label16);
        f.add(label17);
        f.add(label18);
        f.add(label20);
       

        f.add(textField1);
        f.add(textField2);
        f.add(textField3);
        f.add(textField4);
        f.add(textField5);

        f.add(textField7);
        f.add(textField8);
        f.add(textField9);
        f.add(textField10);

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(comboBox1);
        f.add(textField11);

        label1.setBounds(40,70,100,30);
        label2.setBounds(40,115,100,30);
        label3.setBounds(40,160,100,30);
        label4.setBounds(40,205,100,30);
        label5.setBounds(40,250,100,30);
        label6.setBounds(40,295,100,30);
        label7.setBounds(350,70,100,30);
        label8.setBounds(350,115,100,30);
        label9.setBounds(350,160,100,30);
        label10.setBounds(350,205,100,30);

        label15.setBounds(350,250,100,30);
        label16.setBounds(140,375,100,100);
        label17.setBounds(270,400,250,30);
        label18.setBounds(270,370,250,30);
        
        label20.setBounds(395,14,48,48);

        label14.setBounds(270,18,200,30);

        btn1.setBounds(235,520,80,25);
        btn2.setBounds(355,520,80,25);
        btn3.setBounds(26,410,86,25);

        comboBox1.setBounds(170,258,125,20);

        textField1.setBounds(170,80,125,20);
        textField2.setBounds(170,125,125,20);
        textField3.setBounds(170,170,125,20);
        textField4.setBounds(170,215,125,20);
        textField5.setBounds(170,302,125,20);

        textField7.setBounds(465,75,125,20);
        textField8.setBounds(465,120,125,20);
        textField9.setBounds(465,165,125,20);
        textField10.setBounds(475,255,115,20);
        textField11.setBounds(465,210,125,20);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event ){

        String faculty_name,email,address,gender,position,dob,qualification,experience,join_date,phone_no;
        int faculty_id;

        if(event.getSource()==btn1){

            faculty_name=textField1.getText();
            faculty_id = Integer.parseInt(textField2.getText());
            email=textField3.getText();
            address=textField4.getText();
            gender= (String) comboBox1.getSelectedItem();
            position=textField5.getText();
            dob=textField7.getText();
            qualification=textField8.getText();
            experience=textField9.getText();
            phone_no=textField11.getText();
            join_date=textField10.getText();

            try {
                Connect con = new Connect();
                String query = "insert into faculty values('"+faculty_name+"','"+faculty_id+"','"+email+"','"+address+"','"+gender+"','"+ position+"','"+dob+"','"+ qualification+"','"+ experience+"','"+ phone_no+"','"+join_date+"','"+photo+"')";
                int result = con.st.executeUpdate(query);
                System.out.println(result);
                if (result>0) {
                     JOptionPane.showMessageDialog(f, "Faculty Added.","Added",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(f, "Faculty not Added.","Error",JOptionPane.ERROR_MESSAGE);
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        if(event.getSource()==btn2){
            f.setVisible(false);
        }
        if(event.getSource()==btn3) {
            String path = "C:\\Users\\Rajat\\IdeaProjects\\College Management\\src\\com\\images";
            JFileChooser fileChooser = new JFileChooser(path);
            int i = fileChooser.showOpenDialog(f);
            if (i == JFileChooser.APPROVE_OPTION)
            {
                File file = fileChooser.getSelectedFile();
                String filePath = file.getAbsolutePath();
                 String fileName=file.getName();
                photo=fileName;
                long size=file.length();

                ImageIcon img = new ImageIcon(filePath);
                Image myimage = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                label16.setIcon(new ImageIcon(myimage));
                label17.setText(fileName);
                label18.setText(String.valueOf(size)+"  byte");
            }
        }
    }
    public static void main(String[] args){
        new Add_Faculty();
    }
}

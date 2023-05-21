package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.File;

public class Student_Register implements ActionListener {

    JFrame f;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20;
    JButton btn1,btn2,btn3;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10,textField11,textField12;
     JComboBox comboBox1;
     JComboBox comboBox2;
    String photo="null";

    public Student_Register(){

         f= new JFrame("Student Admission");
         f.setVisible(true);
         f.setSize(690,600);
        f.getContentPane().setBackground(Color.WHITE);
        f.setLocation(405,150);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.setVisible(false);
            }
        });
        f.setLayout(null);

        label1=new JLabel("Name");
        label2=new JLabel("Roll No.");
        label3=new JLabel("Address");
        label4=new JLabel("Email");
        label5=new JLabel("Age");
        label6=new JLabel("Class");
        label7=new JLabel("DOB");
        label8=new JLabel("Father's Name");
        label9=new JLabel("Mother's Name");
        label10=new JLabel("Phone No.");
        label11=new JLabel("Stream");
        label12=new JLabel("Gender");
        label13=new JLabel("Session Year");
        label14=new JLabel("New Student");
        label15=new JLabel("Addmission Date");

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\avatar.jpg"));
        Image myimage1 = img1.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);

        label16=new JLabel(new ImageIcon(myimage1));

        Font myfont= new Font("Arial",Font.BOLD,17);
        label14.setFont(myfont);
        label14.setForeground(Color.BLACK);

        label17=new JLabel();
        label18=new JLabel();

        ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("com\\images\\7.jpeg"));
        Image img= icon.getImage().getScaledInstance(690,600,Image.SCALE_SMOOTH);
        ImageIcon icon2=new ImageIcon(img);
        label19=new JLabel(icon2);

        ImageIcon icon4= new ImageIcon(ClassLoader.getSystemResource("com\\images\\"));
        Image img4= icon4.getImage().getScaledInstance(48,48,Image.SCALE_SMOOTH);
        ImageIcon newicon4=new ImageIcon(img4);
        label20=new JLabel(newicon4);

        btn1=new JButton("Add");
        btn1.setBackground(new Color(255,0,0));
        btn1.setForeground(Color.white);
        btn1.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);

        btn2=new JButton("Cancel");
        btn2.setBackground(new Color(255,0,0));
        btn2.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn2.setForeground(Color.white);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);

        btn3=new JButton("Photo");
        Font myfont1= new Font("Arial",Font.BOLD,10);
        btn3.setFont(myfont1);
        btn3.setBackground(new Color(255,255,255));
        btn3.setForeground(Color.BLACK);

        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.setFocusable(false);
        btn3.setFocusPainted(false);
        btn3.setBorder(new EmptyBorder(0,0,0,0));
        ImageIcon btn_icon1=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon12.png"));
        Image newImage1=btn_icon1.getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH);
        ImageIcon newIcon1=new ImageIcon(newImage1);
        btn3.setIcon(newIcon1);
        btn3.addActionListener(this);

        String stream[]={"Science","Commerce","Arts","None"};
        String  classes[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
        comboBox1= new JComboBox(classes);
        comboBox1.setFocusable(false);
        comboBox1.setBackground(Color.WHITE);
        comboBox1.setBorder(new EmptyBorder(0,0,0,0));

        comboBox2= new JComboBox(stream);
        comboBox2.setFocusable(false);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setBorder(new EmptyBorder(0,0,0,0));

        textField1= new JTextField(20);
        textField1.setBorder(new EmptyBorder(0,0,0,0));
        textField2= new JTextField(20);
        textField2.setBorder(new EmptyBorder(0,0,0,0));
        textField3= new JTextField(20);
        textField3.setBorder(new EmptyBorder(0,0,0,0));
        textField4= new JTextField(20);
        textField4.setBorder(new EmptyBorder(0,0,0,0));
        textField5= new JTextField(20);
        textField5.setBorder(new EmptyBorder(0,0,0,0));
        textField6= new JTextField(20);
        textField6.setBorder(new EmptyBorder(0,0,0,0));
        textField7= new JTextField(20);
        textField7.setBorder(new EmptyBorder(0,0,0,0));
        textField8= new JTextField(20);
        textField8.setBorder(new EmptyBorder(0,0,0,0));
        textField9= new JTextField(20);
        textField9.setBorder(new EmptyBorder(0,0,0,0));
        textField10= new JTextField(20);
        textField10.setBorder(new EmptyBorder(0,0,0,0));
        textField11= new JTextField(20);
        textField11.setBorder(new EmptyBorder(0,0,0,0));
        textField12= new JTextField(20);
        textField12.setBorder(new EmptyBorder(0,0,0,0));

        label19.add(label1);
        label19.add(label2);
        label19.add(label3);
        label19.add(label4);
        label19.add(label5);
        label19.add(label6);
        label19.add(label7);
        label19.add(label8);
        label19.add(label9);
        label19.add(label10);
        label19.add(label11);
        label19.add(label12);
        label19.add(label13);
        label19.add(label14);
        label19.add(label15);
        label19.add(label16);
        label19.add(label17);
        label19.add(label18);
        label19.add(label20);
        f.add(label19);
        label19.add(textField1);
        label19.add(textField2);
        label19.add(textField3);
        label19.add(textField4);
        label19.add(textField5);
        label19.add(textField6);
        label19.add(textField7);
        label19.add(textField8);
        label19.add(textField9);
        label19.add(textField10);
        label19.add(textField12);
        label19.add(btn1);
        label19.add(btn2);
        label19.add(btn3);
        label19.add(comboBox1);
        label19.add(comboBox2);
        label19.add(textField11);

        label1.setBounds(40,70,100,30);
        label2.setBounds(40,110,100,30);
        label3.setBounds(40,150,100,30);
        label4.setBounds(40,190,100,30);
        label5.setBounds(40,230,100,30);
        label6.setBounds(40,270,100,30);
        label7.setBounds(350,70,100,30);
        label8.setBounds(350,110,100,30);
        label9.setBounds(350,150,100,30);
        label10.setBounds(350,190,100,30);
        label11.setBounds(350,230,100,30);
        label12.setBounds(350,270,100,30);
        label13.setBounds(350,310,100,30);
        label15.setBounds(40,310,100,30);
        label16.setBounds(140,375,110,110);
        label17.setBounds(260,400,250,30);
        label18.setBounds(260,370,250,30);
        label19.setBounds(0,0,690,600);
        label20.setBounds(395,10,48,48);
        label14.setBounds(270,18,200,30);
        btn1.setBounds(235,520,80,25);
        btn2.setBounds(355,520,80,25);
        btn3.setBounds(27,410,80,25);
        comboBox1.setBounds(120,277,125,20);
        comboBox2.setBounds(465,234,125,20);
        textField1.setBounds(120,80,125,20);
        textField2.setBounds(120,120,125,20);
        textField3.setBounds(120,160,125,20);
        textField4.setBounds(120,200,125,20);
        textField5.setBounds(120,240,125,20);
        textField6.setBounds(465,277,125,20);
        textField7.setBounds(465,75,125,20);
        textField8.setBounds(465,115,125,20);
        textField9.setBounds(465,155,125,20);
        textField10.setBounds(145,317,100,20);
        textField11.setBounds(465,195,125,20);
        textField12.setBounds(465,317,125,20);

btn1.addActionListener(this);
btn2.addActionListener(this);
    }

public void actionPerformed(ActionEvent event ){

    String student_name,email,address,gender,age,dob,admission_date,father_name,phone_no,mother_name,phone_number,stream,ssession_year;
    int roll_number,classes;

    if(event.getSource()==btn1){
        student_name=textField1.getText();
        roll_number = Integer.parseInt(textField2.getText());
        email=textField4.getText();
        address=textField3.getText();
        gender= textField6.getText();;
        age=textField5.getText();
        dob=textField7.getText();
        admission_date=textField10.getText();
        father_name=textField8.getText();
        phone_no=textField11.getText();
        mother_name=textField9.getText();
        stream=(String) comboBox2.getSelectedItem();
        ssession_year=textField12.getText();
        classes = Integer.parseInt( (String)comboBox1.getSelectedItem());

        try {
            Connect con = new Connect();
            String query = "insert into student values('"+student_name+"','"+roll_number+"','"+address+"','"+email+"','"+age+"','"+ classes+"','"+admission_date+"','"+dob+"','"+father_name+"','"+mother_name+"','"+phone_no+"','"+stream+"','"+gender+"','"+ssession_year+"','"+photo+"')";
            int result = con.st.executeUpdate(query);  // it returns 1 on successful data insertion.
            //          //  System.out.println(result);
            if (result>0) {
                JOptionPane.showMessageDialog(null, "Student Added.","done",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(f, "Student not Added.","error",JOptionPane.ERROR_MESSAGE);
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
            long size=file.length();
 photo=fileName;
 System.out.println(photo);
            ImageIcon img = new ImageIcon(filePath);
            Image myimage = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            label16.setIcon(new ImageIcon(myimage));
            label17.setText(fileName);
            label18.setText(String.valueOf(size)+"  byte");
        }
    }
}
    public static void main(String[] args){
        new Student_Register();
    }
}

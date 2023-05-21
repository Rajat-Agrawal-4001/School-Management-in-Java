package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.File;
import java.sql.ResultSet;

public class Update_Detail implements ActionListener {

    JFrame f;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18
            ,label19,label20,label21,label22,label23,label24,
    label25,label26,label27,label28,label29,label30,label31,label32,label33,label34,label35;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10,textField11,textField12
            ,textField13,textField14,textField15,textField16,textField17,textField18,textField19,textField20,textField21,textField22,textField23,textField24;
    JComboBox comboBox1,comboBox2,comboBox3;
    JTabbedPane tabbedPane;
    JPanel panel1,panel2;
    static String photo="";

    public Update_Detail(){
        f= new JFrame("Update  Record");
        f.setVisible(true);
        f.setSize(707,640);
        f.getContentPane().setBackground(Color.WHITE);
        f.setLocation(405,145);
         f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.setVisible(false);
            }
        });
        f.setLayout(null);

        panel1= new JPanel();
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);
        panel1.setBorder(new EmptyBorder(0,0,0,0));

        panel2= new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);
        panel2.setBorder(new EmptyBorder(0,0,0,0));

        tabbedPane= new JTabbedPane();
        f.add(tabbedPane);
        tabbedPane.setBackground(Color.WHITE);

        tabbedPane.setBounds(0,0,690,600);
        tabbedPane.add("Update Student",panel1);
        tabbedPane.add("Update Faculty",panel2);

        label1=new JLabel("Name");
        label2=new JLabel("Age");
        label3=new JLabel("Address");
        label4=new JLabel("Email Id");
        label5=new JLabel("Roll No.");
        label6=new JLabel("Class");
        label7=new JLabel("DOB");
        label8=new JLabel("Father's Name");
        label9=new JLabel("Mother's Name");
        label10=new JLabel("Phone No.");
        label11=new JLabel("Stream");
        label12=new JLabel("Gender");
        label13=new JLabel("Session");
        label15=new JLabel("Addmission Date");
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\avatar.jpg"));
        Image myimage1 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        label16=new JLabel(new ImageIcon(myimage1));
        label16.setBackground(Color.LIGHT_GRAY);
        Font myfont= new Font("Arial",Font.TRUETYPE_FONT,17);

        label17=new JLabel();
        label18=new JLabel();

        label34=new JLabel("Enter roll no to Update :");

        btn1=new JButton("Update");
        btn1.setBackground(new Color(255,69,0));
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(new EmptyBorder(0,0,0,0));
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn2=new JButton("Cancel");
        btn2.setBackground(new Color(255,69,0));
        btn2.setForeground(Color.WHITE);
        btn2.setBorder(new EmptyBorder(0,0,0,0));
        btn2.setFocusable(false);
        btn2.setFocusPainted(false);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn3=new JButton("Photo");
        Font myfont1= new Font("Arial",Font.BOLD,10);
        btn3.setFont(myfont1);
        btn3.setBackground(Color.WHITE);
        btn3.setForeground(Color.BLACK);
        btn3.setFocusable(false);
        btn3.setFocusPainted(false);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon btn_icon1=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon12.png"));
        Image newImage1=btn_icon1.getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH);
        ImageIcon newIcon1=new ImageIcon(newImage1);
        btn3.setIcon(newIcon1);
        btn3.addActionListener(this);

        btn7=new JButton("Fetch");
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.setFocusPainted(false);
        btn7.setFocusable(false);
        btn7.setBackground(Color.WHITE);
        btn7.setForeground(Color.BLACK);
        Font myfont6= new Font("Arial",Font.BOLD,11);
        btn7.setFont(myfont6);
        btn7.addActionListener(this);

        String stream[]={"Science","Commerce","Arts","None"};
        String  classes[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
        comboBox1= new JComboBox(classes);
        comboBox1.setBackground(Color.WHITE);
        comboBox1.setFocusable(false);

        comboBox2= new JComboBox(stream);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setFocusable(false);

        textField1= new JTextField(20);
        textField2= new JTextField(20);
        textField3= new JTextField(20);
        textField4= new JTextField(20);
        textField5= new JTextField(20);
        textField6= new JTextField(20);
        textField7= new JTextField(20);
        textField8= new JTextField(20);
        textField9= new JTextField(20);
        textField10= new JTextField(20);
        textField11= new JTextField(20);
        textField12= new JTextField(20);
        textField23= new JTextField(20);

        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        panel1.add(label5);
        panel1.add(label6);
        panel1.add(label7);
        panel1.add(label8);
        panel1.add(label9);
        panel1.add(label10);
        panel1.add(label11);
        panel1.add(label12);
        panel1.add(label13);
        panel1.add(label15);
        panel1.add(label16);
        panel1.add(label17);
        panel1.add(label18);
        panel1.add(label34);
        panel1.add(textField1);
        panel1.add(textField2);
        panel1.add(textField3);
        panel1.add(textField4);
        panel1.add(textField5);
        panel1.add(textField6);
        panel1.add(textField7);
        panel1.add(textField8);
        panel1.add(textField9);
        panel1.add(textField10);
        panel1.add(textField12);
        panel1.add(textField23);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn7);
        panel1.add(comboBox1);
        panel1.add(comboBox2);
        panel1.add(textField11);

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
        label16.setBounds(140,375,100,100);
        label17.setBounds(260,400,250,30);
        label18.setBounds(260,370,250,30);
        label34.setBounds(40,20,250,30);
        btn1.setBounds(220,515,80,25);
        btn2.setBounds(340,515,80,25);
        btn3.setBounds(20,410,100,25);
        btn7.setBounds(385,25,80,25);
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
        textField23.setBounds(240,26,125,20);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        label19=new JLabel("Faculty Name");
        label20=new JLabel("Faculty ID");
        label21=new JLabel("Email Id");
        label22=new JLabel("Address");
        label23=new JLabel("Gender");
        label24=new JLabel("Position");
        label25=new JLabel("DOB");
        label26=new JLabel("Qualification");
        label27=new JLabel("Experience");
        label28=new JLabel("Phone No.");
        label30=new JLabel("Joining Date");

        ImageIcon img11 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\avatar.jpg"));
        Image myimage12 = img11.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        label31=new JLabel(new ImageIcon(myimage12));
        Font myfont2= new Font("Arial",Font.TRUETYPE_FONT,17);

        label32=new JLabel();
        label33=new JLabel();
        label35=new JLabel("Enter Faculty_id to Update :");

        btn4=new JButton("Update");
        btn4.setBackground(new Color(255,0,0));
        btn4.setForeground(Color.white);
        btn4.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn4.setFocusPainted(false);
        btn4.setFocusable(false);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn5=new JButton("Cancel");
        btn5.setBackground(new Color(255,0,0));
        btn5.setForeground(Color.white);
        btn5.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn5.setFocusPainted(false);
        btn5.setFocusable(false);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn6=new JButton("Photo");
        Font myfont4= new Font("Arial",Font.BOLD,10);
        btn6.setFont(myfont4);
        btn6.setBackground(Color.WHITE);
        btn6.setForeground(Color.BLACK);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon btn_icon2=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon12.png"));
        Image newImage2=btn_icon2.getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH);
        ImageIcon newIcon2=new ImageIcon(newImage2);
        btn6.setIcon(newIcon2);
        btn6.addActionListener(this);

        btn8=new JButton("Fetch");
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.setFocusPainted(false);
        btn8.setFocusable(false);
        btn8.setBackground(Color.WHITE);
        btn8.setForeground(Color.BLACK);
        Font myfont5= new Font("Arial",Font.BOLD,11);
        btn8.setFont(myfont5);
        btn8.addActionListener(this);

        String gender[]={"Male","Female"};

        comboBox3= new JComboBox(gender);
        comboBox3.setFocusable(false);
        comboBox3.setBackground(Color.WHITE);

        textField13= new JTextField(20);
        textField14= new JTextField(20);
        textField15= new JTextField(20);
        textField16= new JTextField(20);
        textField17= new JTextField(20);
        textField18= new JTextField(20);
        textField19= new JTextField(20);
        textField20= new JTextField(20);
        textField21= new JTextField(20);
        textField22= new JTextField(20);
        textField24= new JTextField(20);

        panel2.add(label19);
        panel2.add(label20);
        panel2.add(label21);
        panel2.add(label22);
        panel2.add(label23);
        panel2.add(label24);
        panel2.add(label25);
        panel2.add(label26);
        panel2.add(label27);
        panel2.add(label28);
        panel2.add(label30);
        panel2.add(label31);
        panel2.add(label32);
        panel2.add(label33);
        panel2.add(label35);
        panel2.add(textField13);
        panel2.add(textField14);
        panel2.add(textField15);
        panel2.add(textField16);
        panel2.add(textField17);
        panel2.add(textField18);
        panel2.add(textField19);
        panel2.add(textField20);
        panel2.add(textField21);
        panel2.add(textField24);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn8);
        panel2.add(comboBox3);
        panel2.add(textField22);

        label19.setBounds(40,70,100,30);
        label20.setBounds(40,115,100,30);
        label21.setBounds(40,160,100,30);
        label22.setBounds(40,205,100,30);
        label23.setBounds(40,250,100,30);
        label24.setBounds(40,295,100,30);
        label25.setBounds(350,70,100,30);
        label26.setBounds(350,115,100,30);
        label27.setBounds(350,160,100,30);
        label28.setBounds(350,205,100,30);
        label31.setBounds(140,375,100,100);
        label30.setBounds(350,250,250,30);
        label32.setBounds(270,370,250,30);
        label33.setBounds(270,400,200,30);
        label35.setBounds(40,20,200,30);
        btn4.setBounds(235,520,80,25);
        btn5.setBounds(355,520,80,25);
        btn6.setBounds(27,410,100,25);
        btn8.setBounds(385,26,80,25);
        comboBox3.setBounds(170,258,125,20);
        textField13.setBounds(170,80,125,20);
        textField14.setBounds(170,125,125,20);
        textField15.setBounds(170,170,125,20);
        textField16.setBounds(170,215,125,20);
        textField17.setBounds(170,302,125,20);
        textField18.setBounds(465,75,125,20);
        textField19.setBounds(465,120,125,20);
        textField20.setBounds(465,165,125,20);
        textField21.setBounds(475,255,115,20);
        textField22.setBounds(465,210,125,20);
        textField24.setBounds(240,26,125,20);

        btn4.addActionListener(this);
        btn5.addActionListener(this);
        f.validate();
    }
    public void actionPerformed(ActionEvent event ) {
        if (event.getSource() == btn1) {
            //   Updating Student

            String student_name,email,address,gender,age,dob,session_year,stream,admission_date,father_name,mother_name,phone_no;
            int roll_number,delete_student_id,classes;

            delete_student_id=Integer.parseInt(textField23.getText());
            student_name=textField1.getText();
            roll_number = Integer.parseInt(textField5.getText());
            email=textField4.getText();
            address=textField3.getText();
            gender=textField6.getText();
            age=textField2.getText();
            dob=textField7.getText();
            admission_date=textField10.getText();
            father_name=textField8.getText();
            phone_no=textField11.getText();
            mother_name=textField9.getText();
            stream=(String) comboBox2.getSelectedItem();
            session_year=textField12.getText();
            classes=Integer.parseInt((String)comboBox1.getSelectedItem());

            try {
                Connect con = new Connect();
                String query="delete from student where roll_number="+delete_student_id;

                int result = con.st.executeUpdate(query);
                System.out.println(result);
                if (result>0) {
                    query = "insert into student values('"+student_name+"','"+roll_number+"','"+address+"','"+email+"','"+age+"','"+classes+"','"+admission_date+"','"+dob+"','"+father_name+"','"+mother_name+"','"+phone_no+"','"+stream+"','"+gender+"','"+session_year+"','"+photo+"')";
                    result = con.st.executeUpdate(query);
                    if (result>0) {
                        JOptionPane.showMessageDialog(f, "Student Updated.","Success",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(f, "Student not updated.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Student not updated.","Error",JOptionPane.ERROR_MESSAGE);
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        if (event.getSource() == btn2) {
            f.setVisible(false);
        }
        if (event.getSource() == btn3) {

            String path = "C:\\Users\\Rajat\\IdeaProjects\\College Management\\src\\com\\images";
            JFileChooser fileChooser = new JFileChooser(path);
            int i = fileChooser.showOpenDialog(f);
            if (i == JFileChooser.APPROVE_OPTION)
            {
                File file = fileChooser.getSelectedFile();
                String filePath = file.getAbsolutePath();
                String fileName = file.getName();
                photo=fileName;
                long size = file.length();
                ImageIcon img = new ImageIcon(filePath);
                Image myimage = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                label16.setIcon(new ImageIcon(myimage));
                label17.setText(fileName);
                label18.setText(String.valueOf(size) + "  byte");
            }
        }
        if (event.getSource() == btn4) {
            //   Updating Faculty
            String faculty_name,email,address,gender,position,dob,qualification,experience,join_date,phone_no;
            int faculty_id,delete_faculty_id;
            delete_faculty_id=Integer.parseInt(textField24.getText());
            faculty_name=textField13.getText();
            faculty_id = Integer.parseInt(textField14.getText());
            email=textField15.getText();
            address=textField16.getText();
            gender= (String) comboBox3.getSelectedItem();
            position=textField17.getText();
            dob=textField18.getText();
            qualification=textField19.getText();
            experience=textField20.getText();
            phone_no=textField22.getText();
            join_date=textField21.getText();
            try {
                Connect con = new Connect();
String query="delete from faculty where faculty_id="+delete_faculty_id;
                int result = con.st.executeUpdate(query);
                System.out.println(result);
                if (result>0) {
                     query = "insert into faculty values('"+faculty_name+"','"+faculty_id+"','"+email+"','"+address+"','"+gender+"','"+ position+"','"+dob+"','"+ qualification+"','"+ experience+"','"+ phone_no+"','"+join_date+"','"+photo+"')";
                     result = con.st.executeUpdate(query);
                    if (result>0) {
                        JOptionPane.showMessageDialog(null, "Faculty Updated.");
                    } else {
                        JOptionPane.showMessageDialog(f, "Faculty not updated.");
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Faculty not updated.");
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }// update faculty

        if (event.getSource() == btn5) {
            f.setVisible(false);
        }
        if (event.getSource() == btn6) {

            String path = "C:\\Users\\Rajat\\IdeaProjects\\College Management\\src\\com\\images";
            JFileChooser fileChooser = new JFileChooser(path);
            int i = fileChooser.showOpenDialog(f);
            if (i == JFileChooser.APPROVE_OPTION)
            {
                File file = fileChooser.getSelectedFile();
                String filePath = file.getAbsolutePath();
                String fileName = file.getName();
                photo=fileName;
                long size = file.length();
                ImageIcon img = new ImageIcon(filePath);
                Image myimage = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                label31.setIcon(new ImageIcon(myimage));
                label32.setText(fileName);
                label33.setText(String.valueOf(size) + "  byte");
            }
        }
        if (event.getSource() == btn7) {
            //   fetching Student

            String new_photo="";
            try {
                Connect con = new Connect();
                int roll_num;
                roll_num=Integer.parseInt(textField23.getText());
                String query = "select * from student where roll_number="+roll_num;
                ResultSet resultSet = con.st.executeQuery(query);
                // System.out.println(result);
                if(resultSet.next()) {
                    textField1.setText(resultSet.getString("name"));
                    textField2.setText(resultSet.getString("age"));
                    textField3.setText(resultSet.getString("address"));
                    textField4.setText(resultSet.getString("email"));
                    textField5.setText(String.valueOf(resultSet.getInt("roll_number")));
                    comboBox1.setSelectedItem(String.valueOf(resultSet.getInt("class")));
                    textField10.setText(resultSet.getString("admission_date"));
                    textField7.setText(resultSet.getString("dob"));
                    textField8.setText(resultSet.getString("father_name"));
                    textField9.setText(resultSet.getString("mother_name"));
                    textField11.setText(resultSet.getString("phone_number"));
                    comboBox2.setSelectedItem(resultSet.getString("stream"));
                    textField6.setText(resultSet.getString("gender"));
                    textField12.setText(resultSet.getString("session_year"));
                    new_photo=resultSet.getString("photo");
                    photo=new_photo;
                }
                else {
                    JOptionPane.showMessageDialog(f,"Student not found.","Error Fetching",JOptionPane.ERROR_MESSAGE);
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\"+new_photo+""));
            Image myimage2 = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            label16.setIcon(new ImageIcon(myimage2));
        }

        if (event.getSource() == btn8) {
            //   Fetching Faculty
            String new_photo="";
            try {
                Connect con = new Connect();
int id;
                id=Integer.parseInt(textField24.getText());
                String query = "select * from faculty where faculty_id="+id;
                ResultSet resultSet = con.st.executeQuery(query);
                if(resultSet.next()) {
                  textField13.setText(resultSet.getString("faculty_name"));
                  textField14.setText(String.valueOf(resultSet.getInt("faculty_id")));
                  textField15.setText(resultSet.getString("email"));
                   textField16.setText(resultSet.getString("address"));
                    comboBox3.setSelectedItem(resultSet.getString("gender"));
                    textField17.setText(resultSet.getString("position"));
                   textField18.setText(resultSet.getString("dob"));
                    textField19.setText(resultSet.getString("qualification"));
                   textField20.setText(resultSet.getString("experience"));
                   textField22.setText(resultSet.getString("phone_number"));
                   textField21.setText(resultSet.getString("join_date"));
                   new_photo=resultSet.getString("photo");
                   photo=new_photo;
                }
                else {
                    JOptionPane.showMessageDialog(f,"Faculty not found.","Error Fetching",JOptionPane.ERROR_MESSAGE);
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\"+new_photo+""));
            Image myimage2 = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            label31.setIcon(new ImageIcon(myimage2));
        }
    }
    public static void main(String[] args){
        new Update_Detail();
    }
}

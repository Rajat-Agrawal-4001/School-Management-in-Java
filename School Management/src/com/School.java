package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class School implements ActionListener{

JFrame frame;
 JLabel imageLabel;
 JLabel label1,label2;
    JMenu menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9;
JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
    JMenuBar  menuBar;
    JMenuItem menuItem1,menuItem2,menuItem3,menuItem4,menuItem5,
            menuItem6,menuItem7,menuItem8,menuItem9,menuItem11,menuItem12,menuItem13,menuItem14,menuItem15;

public School(){

 frame= new JFrame();
     menuBar= new JMenuBar();
    menu1=new JMenu("Admission");
    menu2=new JMenu("Attendance");
    menu3=new JMenu("Record");
    menu4=new JMenu("Update");
    menu5=new JMenu("Delete");
    menu6=new JMenu("Result");
    menu7=new JMenu("Fee");
    menu9=new JMenu("Exit");

    menu1.setForeground(Color.BLUE);
    menu2.setForeground(Color.BLUE);
    menu3.setForeground(Color.BLUE);
    menu4.setForeground(Color.BLUE);
    menu5.setForeground(Color.BLUE);
    menu6.setForeground(Color.BLUE);
    menu7.setForeground(Color.BLUE);
    menu9.setForeground(Color.BLUE);

    menuItem1=new JMenuItem("Add Student");
    menuItem1.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon1= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon1.png"));
    Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem1.setIcon(new ImageIcon(image1));
    menuItem1.setBackground(Color.WHITE);

    menuItem2=new JMenuItem("Add Faculty");
    menuItem2.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon2= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\second.jpg"));
    Image image2 = icon2.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem2.setIcon(new ImageIcon(image2));
    menuItem2.setBackground(Color.WHITE);

    menuItem3=new JMenuItem("Student Detail");
    menuItem3.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon3= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon3.png"));
    Image image3 = icon3.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem3.setIcon(new ImageIcon(image3));
    menuItem3.setBackground(Color.WHITE);

    menuItem4=new JMenuItem("Faculty Detail");
    menuItem4.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon4= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon3.png"));
    Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem4.setIcon(new ImageIcon(image4));
    menuItem4.setBackground(Color.WHITE);

    menuItem5=new JMenuItem("Take Attandance");
    menuItem5.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon5= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon9.png"));
    Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem5.setIcon(new ImageIcon(image5));
    menuItem5.setBackground(Color.WHITE);

    menuItem6=new JMenuItem("View Attandance");
    menuItem6.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon6= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon9.png"));
    Image image6 = icon6.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem6.setIcon(new ImageIcon(image6));
    menuItem6.setBackground(Color.WHITE);

    menuItem7=new JMenuItem("View Result");
    menuItem7.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon7= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon16.png"));
    Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem7.setIcon(new ImageIcon(image7));
    menuItem7.setBackground(Color.WHITE);

    menuItem8=new JMenuItem("Update Records");
    menuItem8.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon8= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon6.png"));
    Image image8 = icon8.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem8.setIcon(new ImageIcon(image8));
    menuItem8.setBackground(Color.WHITE);

    menuItem9=new JMenuItem("Fee Pay");
    menuItem9.setFont(new Font("Arail",Font.BOLD,14));
    ImageIcon icon9= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon7.png"));
    Image image9 = icon9.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem9.setIcon(new ImageIcon(image9));
    menuItem9.setBackground(Color.WHITE);

    menuItem12=new JMenuItem("Exit");
    menuItem12.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon12= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon12.png"));
    Image image12 = icon12.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem12.setIcon(new ImageIcon(image12));
    menuItem12.setBackground(Color.WHITE);

    menuItem13=new JMenuItem("Delete Detail");
    menuItem13.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon13= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon18.png"));
    Image image13 = icon13.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem13.setIcon(new ImageIcon(image13));
    menuItem13.setBackground(Color.WHITE);

    menuItem14=new JMenuItem("Declare Result");
    menuItem14.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon14= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon16.png"));
    Image image14 = icon14.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem14.setIcon(new ImageIcon(image14));
    menuItem14.setBackground(Color.WHITE);

    menuItem15=new JMenuItem("Fee Record");
    menuItem15.setFont(new Font("Arial",Font.BOLD,14));
    ImageIcon icon15= new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon7.png"));
    Image image15 = icon15.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
    menuItem15.setIcon(new ImageIcon(image15));
    menuItem15.setBackground(Color.WHITE);


 frame.setLayout(null);
 frame.setTitle("School Management");
frame.setVisible(true);
 frame.setDefaultCloseOperation(3);
 frame.setSize(1025,660);
 frame.setMaximumSize(new Dimension(1400,100));

    frame.getContentPane().setBackground(Color.WHITE);
 frame.setLocation(270,95);
 frame.setResizable(false);

ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("com\\images\\4.jpg"));
//frame.setIconImage(icon.getImage());

label1= new JLabel("SMB Public School,  Aligarh.");
 Font myfont=new Font("Arial",Font.BOLD,19);
label1.setFont(myfont);

    Image img= icon.getImage().getScaledInstance(1025,660,Image.SCALE_SMOOTH);
    ImageIcon myicon2=new ImageIcon(img);
    JLabel label3=new JLabel(myicon2);

    ImageIcon myicon1= new ImageIcon(ClassLoader.getSystemResource("com\\images\\logo3.png"));
    Image img1= myicon1.getImage().getScaledInstance(230,230,Image.SCALE_SMOOTH);
    ImageIcon myicon3=new ImageIcon(img1);
    label2=new JLabel(myicon3);

label3.add(label2);
label2.setBounds(40,45,230,230);


    Font newFont=new Font("Arial",Font.BOLD,14);
button1=new JButton("Add Student");
button1.setFont(newFont);
button1.setBackground(new Color(32,178,170));
button1.setForeground(Color.WHITE);
button1.setFocusable(false);
button1.setFocusPainted(false);
button1.setBorder(new EmptyBorder(0,0,0,0));
button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
button1.addActionListener(this);
    ImageIcon btn_icon1=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon13.png"));
    Image newImage1=btn_icon1.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon1=new ImageIcon(newImage1);
    button1.setIcon(newIcon1);
    button1.setHorizontalTextPosition(SwingConstants.LEFT);

    button2=new JButton("Add Faculty");
    button2.setFont(newFont);
    button2.setBackground(new Color(32,178,170));
    button2.setForeground(Color.WHITE);
    button2.setFocusable(false);
    button2.setFocusPainted(false);
    button2.setBorder(new EmptyBorder(0,0,0,0));
    button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button2.addActionListener(this);
    ImageIcon btn_icon2=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon12.png"));
    Image newImage2=btn_icon2.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon2=new ImageIcon(newImage2);
    button2.setIcon(newIcon2);
    button2.setHorizontalTextPosition(SwingConstants.LEFT);

    button3=new JButton("View Student");
    button3.setFont(newFont);
    button3.setBackground(new Color(32,178,170));
    button3.setForeground(Color.WHITE);
    button3.setFocusable(false);
    button3.setFocusPainted(false);
    button3.setBorder(new EmptyBorder(0,0,0,0));
    button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button3.addActionListener(this);
    ImageIcon btn_icon3=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon8.png"));
    Image newImage3=btn_icon3.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon3=new ImageIcon(newImage3);
    button3.setIcon(newIcon3);
    button3.setHorizontalTextPosition(SwingConstants.LEFT);

    button4=new JButton("View Facuty");
    button4.setFont(newFont);
    button4.setBackground(new Color(32,178,170));
    button4.setForeground(Color.WHITE);
    button4.setFocusable(false);
    button4.setFocusPainted(false);
    button4.setBorder(new EmptyBorder(0,0,0,0));
    button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button4.addActionListener(this);
    ImageIcon btn_icon4=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon9.png"));
    Image newImage4=btn_icon4.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon4=new ImageIcon(newImage4);
    button4.setIcon(newIcon4);
    button4.setHorizontalTextPosition(SwingConstants.LEFT);

    button5=new JButton("Delete");
    button5.setFont(newFont);
    button5.setBackground(new Color(32,178,170));
    button5.setForeground(Color.WHITE);
    button5.setFocusable(false);
    button5.setFocusPainted(false);
    button5.setBorder(new EmptyBorder(0,0,0,0));
    button5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button5.addActionListener(this);
    ImageIcon btn_icon5=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon3.png"));
    Image newImage5=btn_icon5.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon5=new ImageIcon(newImage5);
    button5.setIcon(newIcon5);
    button5.setHorizontalTextPosition(SwingConstants.LEFT);

    button6=new JButton("Update");
    button6.setFont(newFont);
    button6.setBackground(new Color(32,178,170));
    button6.setForeground(Color.WHITE);
    button6.setFocusable(false);
    button6.setFocusPainted(false);
    button6.setBorder(new EmptyBorder(0,0,0,0));
    button6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button6.addActionListener(this);
    ImageIcon btn_icon6=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon5.png"));
    Image newImage6=btn_icon6.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon6=new ImageIcon(newImage6);
    button6.setIcon(newIcon6);
    button6.setHorizontalTextPosition(SwingConstants.LEFT);

    button7=new JButton("View Result");
    button7.setFont(newFont);
    button7.setBackground(new Color(32,178,170));
    button7.setForeground(Color.WHITE);
    button7.setFocusable(false);
    button7.setFocusPainted(false);
    button7.setBorder(new EmptyBorder(0,0,0,0));
    button7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button7.addActionListener(this);
    ImageIcon btn_icon7=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon6.png"));
    Image newImage7=btn_icon7.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon7=new ImageIcon(newImage7);
    button7.setIcon(newIcon7);
    button7.setHorizontalTextPosition(SwingConstants.LEFT);

    button8=new JButton("Fee Pay");
    button8.setFont(newFont);
    button8.setBackground(new Color(32,178,170));
    button8.setForeground(Color.WHITE);
    button8.setFocusable(false);
    button8.setFocusPainted(false);
    button8.setBorder(new EmptyBorder(0,0,0,0));
    button8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button8.addActionListener(this);
    ImageIcon btn_icon8=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon11.png"));
    Image newImage8=btn_icon8.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon8=new ImageIcon(newImage8);
    button8.setIcon(newIcon8);
    button8.setHorizontalTextPosition(SwingConstants.LEFT);

    button9=new JButton("Fee Record");
    button9.setFont(newFont);
    button9.setBackground(new Color(32,178,170));
    button9.setForeground(Color.WHITE);
    button9.setFocusable(false);
    button9.setFocusPainted(false);
    button9.setBorder(new EmptyBorder(0,0,0,0));
    button9.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button9.addActionListener(this);
    ImageIcon btn_icon9=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon30.png"));
    Image newImage9=btn_icon9.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);

    ImageIcon newIcon9=new ImageIcon(newImage9);
    button9.setIcon(newIcon9);
    button9.setHorizontalTextPosition(SwingConstants.LEFT);

    button10=new JButton("Take Attandance");
    button10.setFont(newFont);
    button10.setBackground(new Color(32,178,170));
    button10.setForeground(Color.WHITE);
    button10.setFocusable(false);
    button10.setFocusPainted(false);
    button10.setBorder(new EmptyBorder(0,0,0,0));
    button10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button10.addActionListener(this);
    ImageIcon btn_icon10=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon31.png"));
    Image newImage10=btn_icon10.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon10=new ImageIcon(newImage10);
    button10.setIcon(newIcon10);
    button10.setHorizontalTextPosition(SwingConstants.LEFT);

    button11=new JButton("View Attandance");
    button11.setFont(newFont);
    button11.setBackground(new Color(32,178,170));
    button11.setForeground(Color.WHITE);
    button11.setFocusable(false);
    button11.setFocusPainted(false);
    button11.setBorder(new EmptyBorder(0,0,0,0));
    button11.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button11.addActionListener(this);
    ImageIcon btn_icon11=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon25.png"));
    Image newImage11=btn_icon11.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon11=new ImageIcon(newImage11);
    button11.setIcon(newIcon11);
    button11.setHorizontalTextPosition(SwingConstants.LEFT);

    button12=new JButton("Declare Result");
    button12.setFont(newFont);
    button12.setBackground(new Color(32,178,170));
    button12.setForeground(Color.WHITE);
    button12.setFocusable(false);
    button12.setFocusPainted(false);
    button12.setBorder(new EmptyBorder(0,0,0,0));
    button12.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button12.addActionListener(this);
    ImageIcon btn_icon12=new ImageIcon(ClassLoader.getSystemResource("com\\images\\icon\\icon28.png"));
    Image newImage12=btn_icon12.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
    ImageIcon newIcon12=new ImageIcon(newImage12);
    button12.setIcon(newIcon12);
    button12.setHorizontalTextPosition(SwingConstants.LEFT);

    frame.setJMenuBar(menuBar);

    frame.add(label3);
    label3.add(label1);
    label3.add(button1);
    label3.add(button2);
    label3.add(button3);
    label3.add(button4);
    label3.add(button5);
    label3.add(button6);
    label3.add(button7);
    label3.add(button8);
    label3.add(button9);
    label3.add(button10);
    label3.add(button11);
    label3.add(button12);

  menuBar.add(menu1);
    menuBar.add(menu2);
    menuBar.add(menu3);
    menuBar.add(menu4);
    menuBar.add(menu5);
    menuBar.add(menu6);
    menuBar.add(menu7);

    menuBar.add(menu9);

    menu1.add(menuItem1);
    menu1.add(menuItem2);
    menu2.add(menuItem5);
    menu2.add(menuItem6);
    menu3.add(menuItem3);
    menu3.add(menuItem4);
    menu5.add(menuItem13);
    menu4.add(menuItem8);
    menu6.add(menuItem7);
    menu6.add(menuItem14);
    menu7.add(menuItem9);
    menu7.add(menuItem15);

    menu9.add(menuItem12);

    menuItem1.addActionListener(this);
    menuItem2.addActionListener(this);
    menuItem3.addActionListener(this);
    menuItem4.addActionListener(this);
    menuItem5.addActionListener(this);
    menuItem6.addActionListener(this);
    menuItem7.addActionListener(this);
    menuItem8.addActionListener(this);
    menuItem9.addActionListener(this);

    menuItem12.addActionListener(this);
    menuItem13.addActionListener(this);
    menuItem14.addActionListener(this);
    menuItem15.addActionListener(this);

    label3.setBounds(0,0,1025,660);
    label1.setBounds(334,4,400,50);

    button1.setBounds(650,80,150,39);
    button2.setBounds(650,140,150,39);
    button3.setBounds(650,200,150,39);
    button4.setBounds(650,260,150,39);
    button5.setBounds(650,320,150,39);
    button6.setBounds(650,380,150,39);
    button7.setBounds(650,440,150,39);
    button8.setBounds(650,500,150,39);
    button9.setBounds(50,500,150,39);
    button10.setBounds(50,440,150,39);
    button11.setBounds(50,380,150,39);
    button12.setBounds(50,320,150,39);

    frame.validate();

}

@Override
public void actionPerformed(ActionEvent event){
if(event.getSource()==menuItem1){
    new Student_Register();
}
    if(event.getSource()==menuItem2){
        new Add_Faculty();
    }
    if(event.getSource()==menuItem3){
        new Student_Details();
    }
    if(event.getSource()==menuItem4){
        new Faculty_Details();
    }
    if(event.getSource()==menuItem5){
        new Take_Attendence();
    }
    if(event.getSource()==menuItem6){
        new View_Attendence();
    }
    if(event.getSource()==menuItem7){
        new View_Result();
    }
    if(event.getSource()==menuItem8){
        new Update_Detail();
    }
    if(event.getSource()==menuItem9){
        new  Pay_Fees();
    }
    if(event.getSource()==menuItem11){

    }
    if(event.getSource()==menuItem12){
        System.exit(0);
    }
    if(event.getSource()==menuItem13){
        new Delete_Record();
    }
    if(event.getSource()==menuItem14){
        new Declare_Result();
    }
    if(event.getSource()==menuItem15){
        new Fee_Record();
    }
    if (event.getSource()==button1){
        new Student_Register();
    }
    if (event.getSource()==button2){
        new Add_Faculty();
    }
    if (event.getSource()==button3){
        new Student_Details();
    }
    if (event.getSource()==button4){
        new Faculty_Details();
    }
    if (event.getSource()==button5){
        new Delete_Record();
    }
    if (event.getSource()==button6){
        new Update_Detail();
    }
    if (event.getSource()==button7){
        new View_Result();
    }
    if (event.getSource()==button8){
        new  Pay_Fees();
    }
    if (event.getSource()==button9){
        new Fee_Record();
    }
    if (event.getSource()==button10){
        new Take_Attendence();
    }
    if (event.getSource()==button11){
        new View_Attendence();
    }
    if (event.getSource()==button12){
        new Declare_Result();
    }
}
public static void main(String args[]){
    new School();
}
}

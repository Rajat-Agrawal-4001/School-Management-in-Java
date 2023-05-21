package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Pay_Fees implements ActionListener{

    JFrame frame;
    JButton btn1;
    JTextField textField1,textField2,textField3,textField4,textField5;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label12;
    JComboBox comboBox1;
    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    ButtonGroup buttonGroup;

    public  Pay_Fees(){
        frame= new JFrame();
        frame.setTitle("Fee  Payment");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(680,574);
        frame.setLocation(436,165);
        frame.setLayout(null);
        frame.setResizable(false);

        btn1= new JButton("Pay");
        btn1.setBackground(Color.BLUE);
        btn1.setForeground(Color.WHITE);
        btn1.setFont(new Font("Arial",Font.BOLD,14));
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setBorder(new EmptyBorder(0,0,0,0));
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn1.addActionListener(this);

        label1= new JLabel("Roll no");
        label2= new JLabel("Fee Payment");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Arial",Font.BOLD,22));

        textField1= new JTextField(20);
        textField2= new JTextField(20);
        textField3= new JTextField(20);
        textField4= new JTextField(20);
        textField5= new JTextField(20);

        String  classes[]={"1","2","3","4","5","6","7","8","9","10","11","12"};

        comboBox1= new JComboBox(classes);
        comboBox1.setBackground(Color.WHITE);

        label3= new JLabel("Student Name");
        label4= new JLabel("Father's Name");
        label5= new JLabel("Class");
        label6= new JLabel("Payment Type");
        label7= new JLabel("Date");
        label8= new JLabel("Fee Amount");

        radioButton1= new JRadioButton("1) Cash");
        radioButton2= new JRadioButton("2) Net Banking");
        radioButton3= new JRadioButton("3) Credit Card");
        radioButton4= new JRadioButton("4) Google Pay");

        buttonGroup= new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        radioButton1.setBackground(Color.WHITE);
        radioButton2.setBackground(Color.WHITE);
        radioButton3.setBackground(Color.WHITE);
        radioButton4.setBackground(Color.WHITE);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);

        frame.add(btn1);
        frame.add(comboBox1);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textField4);
        frame.add(textField5);

        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(radioButton4);

        label1.setBounds(120,115,100,30);
        label2.setBounds(250,36,250,30);
        label3.setBounds(120,155,100,30);
        label4.setBounds(120,195,100,30);
        label5.setBounds(120,234,100,30);
        label6.setBounds(120,282,100,30);
        label7.setBounds(120,362,100,30);
        label8.setBounds(120,402,100,30);

       btn1.setBounds(285,471,100,30);
       btn1.setVerticalAlignment(SwingConstants.CENTER);

       textField1.setBounds(270,120,125,20);
        textField2.setBounds(270,160,125,20);
        textField3.setBounds(270,200,125,20);
        textField4.setBounds(270,370,125,20);
        textField5.setBounds(270,410,125,20);

        comboBox1.setBounds(270,240,125,20);

        radioButton1.setBounds(270,280,80,30);
        radioButton2.setBounds(355,280,110,30);
        radioButton3.setBounds(480,280,120,30);
        radioButton4.setBounds(275,320,120,30);
        frame.validate();
    }

    public void actionPerformed(ActionEvent event){
        int roll_no,classes,fee_amount;
        String name,father_name,date;

        if(event.getSource()==btn1){
            roll_no=Integer.parseInt(textField1.getText());
            name=textField2.getText();
            father_name=textField3.getText();
            classes=Integer.parseInt((String)comboBox1.getSelectedItem());
            date=textField4.getText();
            fee_amount=Integer.parseInt(textField5.getText());

            try {
                Connect con = new Connect();
                String query = "insert into student_fee(roll_number,student_name,father_name,class,date,amount) values('"+roll_no+"','"+name+"','"+father_name+"','"+classes+"','"+date+"','"+fee_amount+"')";
                int result = con.st.executeUpdate(query);
                if (result>0) {
                    JOptionPane.showMessageDialog(frame, "Fee Paid.","Success",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Fee Not Paid.","Failed",JOptionPane.ERROR_MESSAGE);
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        new  Pay_Fees();
    }
}

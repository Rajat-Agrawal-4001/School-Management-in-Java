package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.File;

public class Declare_Result implements ActionListener{

    JFrame f;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9
            ,textField10,textField11,textField12,textField13;
    JButton btn1,btn2;

    public Declare_Result(){

        f= new JFrame("Declare Result");
        f.setVisible(true);
        f.setSize(680,570);
        f.getContentPane().setBackground(Color.WHITE);
        f.setLocation(405,184);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.setVisible(false);
            }
        });
        f.setLayout(null);

        label1= new JLabel("Enter Marks");
        label1.setFont(new Font("Arial",Font.BOLD,17));
        label2= new JLabel("Roll No");
        label3= new JLabel("Declare  Date");
        label4= new JLabel("Enter Subject :");
        label5= new JLabel("Enter Marks :");
        label6= new JLabel("Sub. 1");
        label7= new JLabel("Sub. 2");
        label8= new JLabel("Sub. 3");
        label9= new JLabel("Sub. 4");
        label10= new JLabel("Sub. 5");
        label11= new JLabel("SGPA");
        label12= new JLabel();
        label13= new JLabel(" Result Status");

        btn1= new JButton("Submit");
        btn1.setBackground(new Color(255,69,0));
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setBorder(new EmptyBorder(0,0,0,0));

        btn2= new JButton("Cancel");
        btn2.setBackground(new Color(255,69,0));
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setFocusPainted(false);
        btn2.setBorder(new EmptyBorder(0,0,0,0));

        btn1.addActionListener(this);
        btn2.addActionListener(this);

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
        textField13= new JTextField(20);

        textField1= new JTextField(20);

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
        f.add(label11);
        f.add(label12);
        f.add(label13);
        f.add(textField1);
        f.add(textField2);
        f.add(textField3);
        f.add(textField4);
        f.add(textField5);
        f.add(textField6);
        f.add(textField7);
        f.add(textField8);
        f.add(textField9);
        f.add(textField10);
        f.add(textField11);
        f.add(textField12);
        f.add(textField13);
        f.add(btn1);
        f.add(btn2);

        label1.setBounds(263,20,200,30);
        label2.setBounds(110,100,200,30);
        label3.setBounds(354,100,200,30);
        label4.setBounds(60,180,200,30);
        label5.setBounds(370,180,200,30);
        label6.setBounds(100,243,100,30);
        label7.setBounds(100,283,100,30);
        label8.setBounds(100,323,100,30);
        label9.setBounds(100,363,100,30);
        label10.setBounds(100,403,100,30);

        textField12.setBounds(468,105,125,20);
        textField1.setBounds(180,250,125,20);
        textField2.setBounds(180,290,125,20);
        textField3.setBounds(180,330,125,20);
        textField4.setBounds(180,370,125,20);
        textField5.setBounds(180,410,125,20);
        textField6.setBounds(360,250,125,20);
        textField7.setBounds(360,290,125,20);
        textField8.setBounds(360,330,125,20);
        textField9.setBounds(360,370,125,20);
        textField10.setBounds(360,410,125,20);
        textField11.setBounds(190,105,125,20);

        btn1.setBounds(236,477,80,25);
        btn2.setBounds(350,477,80,25);
        f.validate();
    }

    public void actionPerformed(ActionEvent event ){
        if(event.getSource()==btn1)
        {
String subject1,subject2,subject3,subject4,subject5,classes;
int roll_no,marks1,marks2,marks3,marks4,marks5;

roll_no=Integer.parseInt(textField11.getText());
            String date=textField12.getText();
subject1=textField1.getText();
            subject2=textField2.getText();
            subject3=textField3.getText();
            subject4=textField4.getText();
            subject5=textField5.getText();
            marks1=Integer.parseInt(textField6.getText());
            marks2=Integer.parseInt(textField7.getText());
            marks3=Integer.parseInt(textField8.getText());
            marks4=Integer.parseInt(textField9.getText());
            marks5=Integer.parseInt(textField10.getText());

            try {
                Connect con = new Connect();

                String query = "insert into marks values('"+roll_no+"','"+date+"','"+subject1+"','"+subject2+"','"+subject3+"','"+subject4+"','"+subject5+"','"+marks1+"','"+marks2+"','"+marks3+"','"+marks4+"','"+marks5+"')";
                int result = con.st.executeUpdate(query);
                if (result>0) {
                    JOptionPane.showMessageDialog(null, "Marks Successfully Saved.","Saved",JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(f, "Marks not Saved.","Error",JOptionPane.ERROR_MESSAGE);
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        if (event.getSource()==btn2){
            f.setVisible(false);
        }

    }

    public static void main(String args[]){

        new Declare_Result();
    }
}

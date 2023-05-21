package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class View_Result implements ActionListener{

    JFrame frame;
JButton btn1;
JTextField textField1;
    JLabel label1,label2;
    public  static int roll_no;

    public View_Result(){
        frame= new JFrame();
        frame.setTitle("View Result");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(650,359);
        frame.setLocation(436,279);
        frame.setLayout(null);
        frame.setResizable(false);

btn1= new JButton("Search");
btn1.setBackground(new Color(255,69,0));
btn1.setForeground(Color.WHITE);
btn1.setFocusable(false);
btn1.setFont(new Font("Arial",Font.BOLD,11));
btn1.setFocusPainted(false);
btn1.setVerticalTextPosition(SwingConstants.CENTER);
btn1.setHorizontalTextPosition(SwingConstants.CENTER);
btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setBorder(new EmptyBorder(0, 0, 0, 0));

btn1.addActionListener(this);
label1= new JLabel("Roll No.");

        label2= new JLabel("Examination Result");
        label2.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
textField1= new JTextField(50);

        frame.add(label1);
        frame.add(label2);
        frame.add(btn1);
        frame.add(textField1);

label1.setBounds(180,130,100,30);
        label2.setBounds(230,38,250,30);
        btn1.setBounds(295,210,80,30);
        textField1.setBounds(270,130,170,30);
    }

public void actionPerformed(ActionEvent event){
        if(event.getSource()==btn1){

            roll_no=Integer.parseInt(textField1.getText());
            try {
                Connect con = new Connect();
                String query = "select * from student where roll_number='"+roll_no+"'";
                ResultSet resultSet = con.st.executeQuery(query);
               if(resultSet.next()) {
System.out.println(roll_no);
                   new Marks_Sheet();
                }
               else {
                   JOptionPane.showMessageDialog(null, "Roll number doesn't exists.","Error",JOptionPane.WARNING_MESSAGE);
               }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
}
    public static void main(String args[]){
        new View_Result();
    }
}

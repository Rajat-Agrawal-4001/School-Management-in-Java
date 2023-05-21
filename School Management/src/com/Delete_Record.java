package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Delete_Record implements ActionListener{

    JFrame frame;
    JButton btn1;
    JTextField textField1;
    JLabel label1,label2;
    JCheckBox checkBox1,checkBox2;

    public  Delete_Record (){
        frame= new JFrame();
        frame.setTitle("Delete");
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

        btn1= new JButton("Delete");
        btn1.setBackground(new Color(255,69,0));
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setBorder(new EmptyBorder(0,0,0,0));
        btn1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));


        btn1.addActionListener(this);
        label1= new JLabel("ID :");
        label1.setFont(new Font("Arial",Font.BOLD,15));
        label2= new JLabel("Delete Record");

        label2.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
        textField1= new JTextField(50);

        checkBox1= new JCheckBox("Student");
        checkBox1.setBackground(Color.WHITE);
        checkBox2= new JCheckBox("Faculty");
        checkBox2.setBackground(Color.WHITE);

        frame.add(label1);
        frame.add(label2);
        frame.add(btn1);
        frame.add(textField1);   // add() function should executes before set bounds()
        frame.add(checkBox1);
        frame.add(checkBox2);

        label1.setBounds(210,150,200,30);
        label2.setBounds(240,22,250,30);
        btn1.setBounds(295,230,80,33);
        textField1.setBounds(270,150,170,30);
        checkBox1.setBounds(260,95,80,25);
        checkBox2.setBounds(350,95,80,25);
        frame.validate();
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==btn1){
            String query="";
            int user_input=Integer.parseInt(textField1.getText());
            try {
                Connect con = new Connect();
if(checkBox1.isSelected())
                query="delete from student where roll_number='"+user_input+"'";
if(checkBox2.isSelected())
     query="delete from faculty where faculty_id='"+user_input+"'";

                int result = con.st.executeUpdate(query);
                if (result>0) {
                    JOptionPane.showMessageDialog(frame, "Data Deleted.","OK",JOptionPane.INFORMATION_MESSAGE);
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(frame, "Data not Deleted.","Error",JOptionPane.ERROR_MESSAGE);
                }
                con.c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        new  Delete_Record();
    }
}

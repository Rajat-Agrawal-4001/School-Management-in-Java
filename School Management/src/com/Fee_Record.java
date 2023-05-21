package com;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Fee_Record {

    JFrame frame;
    JTable jTable;
    JLabel label1;
    static int number=0;
    String[] names={"S No","Roll No","Student","Father","Class","Date","Total Fee","Discount","Paid","Other Due","Status"};

    public Fee_Record(){
        frame= new JFrame();
        frame.setTitle("Fee Record");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(1075,550);
        frame.setLocation(270,180);
        frame.setResizable(false);

        String[][] data=new String[500][12];

        int i=0,j=0;

        try {
            Connect con = new Connect();
            String query = "select * from student_fee";
            ResultSet resultSet = con.st.executeQuery(query);
            while (resultSet.next()) {
                number++;
                data[i][j++]=String.valueOf(number);
                data[i][j++]=(String) resultSet.getString("roll_number");
                data[i][j++]=resultSet.getString("student_name");
                data[i][j++]=resultSet.getString("father_name");
                data[i][j++]=resultSet.getString("class");
                data[i][j++]=(String) resultSet.getString("date");
                int myclass=Integer.parseInt(resultSet.getString("class"));
                int total_fee=0;
                    if (myclass==1)
                    total_fee=1500;
                    else if (myclass==2)
                    total_fee=1500;
                    else if (myclass==3)
                    total_fee=1500;
                    else if (myclass==4)
                    total_fee=1500;
                    else if (myclass==5)
                    total_fee=1700;
                    else if (myclass==6)
                    total_fee=1700;
                    else if (myclass==7)
                    total_fee=1700;
                    else if (myclass==8)
                    total_fee=2000;
                    else if (myclass==9)
                    total_fee=2000;
                    else if (myclass==10)
                    total_fee=2000;
                    else if (myclass==11)
                    total_fee=3000;
                    else if (myclass==12)
                    total_fee=3000;
                data[i][j++]=String.valueOf(total_fee);
                data[i][j++]="0";
                data[i][j++]=resultSet.getString("amount");
                data[i][j++]="0";
                int fee=Integer.parseInt(resultSet.getString("amount"));
                String status=(fee>=total_fee)?"All Paid":"Pending";
                data[i][j++]=status;
                i++;
                j=0;
            }
            con.c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        jTable=new JTable(data,names);
        jTable.getTableHeader().setBackground(new Color(32,178,170));
        jTable.getTableHeader().setForeground(Color.white);
        jTable.setGridColor(Color.LIGHT_GRAY);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        jTable.getTableHeader().setPreferredSize(new Dimension(50,30));
        jTable.setDragEnabled(false);
        jTable.setFocusable(false);

        JScrollPane scrollPane= new JScrollPane(jTable);
        scrollPane.setViewportView(jTable);
        frame.add(scrollPane);
       scrollPane.setBounds(0,0,1075,500);
        frame.validate();
    }
    public static void main(String args[]){
        new Fee_Record();
    }
}

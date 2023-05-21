package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class View_Attendence implements ActionListener{

    JFrame frame;
    JTable jTable;
    JButton button1;
    JLabel label1,label2;
    DefaultTableModel tableModel;
    String[] columnNames={"Roll No","Student Name","Date","Subject","Status"};

    public View_Attendence(){
        frame= new JFrame();
        frame.setTitle("View Attendence");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(900,476);
        frame.setLocation(330,220);
        frame.setLayout(null);
        frame.setResizable(false);

        label1= new JLabel("Student Attendence");
        label1.setForeground(Color.black);

        button1= new JButton("Print");
        button1.setBorder(new EmptyBorder(0,0,0,0));
        button1.setBackground(Color.RED);
        button1.setForeground(Color.WHITE);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(button1);
        button1.setBounds(720,25,80,30);
        button1.addActionListener(this);
        button1.setFocusPainted(false);
        button1.setFocusable(false);

        label1.setBounds(340,10,250,50);
        label1.setFont(new Font("Arial",Font.BOLD,16));

        ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("com\\images\\"));
        Image img= icon.getImage().getScaledInstance(900,550,Image.SCALE_SMOOTH);
        ImageIcon icon2=new ImageIcon(img);
        label2 = new JLabel(icon2);
        frame.add(label2);
        label2.add(label1);

        label2.setBounds(0,0,900,550);

        tableModel=new DefaultTableModel(columnNames,0);
        jTable=new JTable(tableModel);

        int roll_no;
        String name,date,subject,status;

        try {
            Connect con = new Connect();

            String query = "select * from attandance";
            ResultSet resultSet = con.st.executeQuery(query);
            // System.out.println(result);
            while (resultSet.next()) {
                roll_no=Integer.parseInt(resultSet.getString("roll_number"));
                name=resultSet.getString("name");
                date=resultSet.getString("date");
                subject=resultSet.getString("subject");
                status=resultSet.getString("status");
                Object data[]={roll_no,name,date,subject,status};
                tableModel.addRow(data);
            }
            con.c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        jTable.setRowHeight(20);
        jTable.setGridColor(Color.LIGHT_GRAY);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getTableHeader().setBackground(new Color(32,178,170));
        jTable.getTableHeader().setForeground(Color.white);
        jTable.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        jTable.getTableHeader().setPreferredSize(new Dimension(50,30));
        jTable.setDragEnabled(false);
        jTable.setFocusable(false);
        JScrollPane scrollPane= new JScrollPane(jTable);
        label2.add(scrollPane);
        scrollPane.setBounds(80,100,700,223);
frame.validate();
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==button1){
try {
    jTable.print();
}
catch (Exception e){ }
        }
    }
    public static void main(String args[]){
       new View_Attendence();
    }
}

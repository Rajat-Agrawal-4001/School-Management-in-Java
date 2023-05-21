package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Take_Attendence implements ActionListener{

    JFrame frame;
    JTable jTable;
    JLabel label1,label2,label3,label4;
     JComboBox<String> comboBox1;
    JComboBox<String> comboBox2;
     JSpinner spinner1;
     JButton button1,button2;
    Object[][] data=new Object[10][12];
    DefaultTableModel tabelModel;
    String new_date;
    String[] columnNames={"s_no","Roll No","Student Name","Date","Subject","Present"};

    public Take_Attendence(){
        frame= new JFrame();
        frame.setTitle("Take Attendence");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(850,576);
        frame.setLocation(330,170);
        frame.setLayout(null);
        frame.setResizable(false);

        label1= new JLabel("Select Class       :");
        label2 = new JLabel("Select Date       :");
        label3 = new JLabel("Select Subject   :");

        String  classes[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
        String  subjects[]={"Hindi","English","Maths","Science","SST"};
        comboBox1=new JComboBox<String>(classes);
        comboBox1.setBackground(Color.WHITE);
        comboBox1.setFocusable(false);
        comboBox1.setBorder(new EmptyBorder(0, 0, 0, 0));

        comboBox2=new JComboBox<String>(subjects);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setFocusable(false);
        comboBox2.setBorder(new EmptyBorder(0, 0, 0, 0));

        spinner1= new JSpinner();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
        spinner1.setModel(new SpinnerDateModel());
        spinner1.setEditor(new JSpinner.DateEditor(spinner1,dateformat.toPattern()));
        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
               new_date =String.valueOf(spinner1.getValue());

            }
        });
        button1= new JButton("Refresh");
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        button1.setFocusable(false);
        button1.setFocusPainted(false);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.addActionListener(this);

        button2= new JButton("Submit");
        button2.setBackground(Color.RED);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setFocusPainted(false);
        button2.setFocusable(false);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.addActionListener(this);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(comboBox1);
        frame.add(comboBox2);
        frame.add(spinner1);
        frame.add(button1);
        frame.add(button2);

        label1.setBounds(150,26,200,30);
        label2.setBounds(150,75,200,30);
        label3.setBounds(150,121,150,30);
        comboBox1.setBounds(300,33,140,22);
        comboBox2.setBounds(300,128,140,22);
        spinner1.setBounds(300,82,140,22);
        button1.setBounds(670,185,80,30);
        button2.setBounds(375,478,80,30);

        tabelModel=new DefaultTableModel(columnNames,0);
        jTable=new JTable(tabelModel);

jTable.setRowHeight(35);
        jTable.setGridColor(Color.LIGHT_GRAY);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        jTable.setFont(new Font("Segoe UI",Font.PLAIN,18));
        jTable.setDragEnabled(false);
        jTable.setFocusable(false);
        jTable.setGridColor(Color.LIGHT_GRAY);
        jTable.getTableHeader().setBackground(new Color(32,178,170));
        jTable.getTableHeader().setForeground(Color.white);
        jTable.getTableHeader().setPreferredSize(new Dimension(50,35));
        jTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane scrollPane= new JScrollPane(jTable);
        scrollPane.setViewportView(jTable);
        frame.add(scrollPane);
        scrollPane.setBounds(67,250,700,183);
        frame.validate();
    }
    public void actionPerformed(ActionEvent event){
        int i=0,j=0,s_no,roll_no;
        String subject,name,status;

if (event.getSource()==button1){
// refresh button code
    int classNumber=Integer.parseInt((String) comboBox1.getSelectedItem());
    subject=(String) comboBox2.getSelectedItem();
    Date attandanca_date =(Date)spinner1.getValue();

    SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
    new_date= dateFormat.format(attandanca_date);

// table needs to clear its all data here
    try {
        Connect con = new Connect();

        String query = "select * from student where class="+classNumber+"";
        ResultSet resultSet = con.st.executeQuery(query);
         System.out.println(resultSet);
        while (resultSet.next()) {
              s_no=i+1;
            data[i][j++]=s_no;
            data[i][j++]=Integer.parseInt(resultSet.getString("roll_number"));
            data[i][j++]=resultSet.getString("name");
            data[i][j++]=new_date;
            data[i][j++]=subject;
            data[i][j++]="present";
            tabelModel.addRow(data[i]);
            i++;
            j=0;
        }
        con.c.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}

if(event.getSource()==button2){
// submit btn code
    if (tabelModel.getRowCount()==0){
        JOptionPane.showMessageDialog(null,"Table is Empty.");
    }
    else {
        try {
            Connect con = new Connect();
            int result=0;

                for (int p=0;p<tabelModel.getRowCount();p++){
                    s_no=Integer.parseInt(tabelModel.getValueAt(p,0).toString());
                    roll_no=Integer.parseInt(tabelModel.getValueAt(p,1).toString());
                    name=tabelModel.getValueAt(p,2).toString();
                    new_date=tabelModel.getValueAt(p,3).toString();
                    subject=tabelModel.getValueAt(p,4).toString();
                    status=tabelModel.getValueAt(p,5).toString();
                    String query = "insert into attandance values('"+s_no+"','"+roll_no+"','"+name+"','"+new_date+"','"+subject+"','"+status+"')";
                    result = con.st.executeUpdate(query);
                }
            if (result>0) {
                JOptionPane.showMessageDialog(frame, "Attendance Submitted.","done",JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(frame, "Attendance not Submitted.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            con.c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
    }
    public static void main(String args[]){
        new Take_Attendence();
    }
}

package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Student_Details implements ActionListener{

    JFrame frame;
    JTable jTable;
    JLabel label1,label2,label3;
    JTextField textField1;
    JPanel panel1;
    JButton btn1;
    static int roll_no;
    DefaultTableModel tabelModel;
    String[] names={"Student Name","Roll No","Class","Stream","Email","Address","Phone no","Gender","DOB","Father's Name","Adm. Date"};

    public Student_Details(){
        frame= new JFrame();
        frame.setTitle("Student Record");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(1075,600);
        frame.setLocation(270,155);
        frame.setLayout(null);

        panel1= new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(32,178,170));
        frame.add(panel1);
        panel1.setBounds(0,0,1075,100);

        label3= new JLabel();
        panel1.add(label3);
        label3.setBounds(50,4,100,100);

        ImageIcon myicon1= new ImageIcon(ClassLoader.getSystemResource("com\\images\\logo3.png"));
        Image img1= myicon1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon icon3=new ImageIcon(img1);
        label3.setIcon(icon3);

        label2= new JLabel("Student Record");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Arial",Font.BOLD,23));
        panel1.add(label2);
        label2.setBounds(400,40,200,30);

btn1= new JButton("View Profile");
btn1.setBackground(Color.WHITE);
btn1.setForeground(new Color(32,178,170));
btn1.setBorder(new EmptyBorder(0,0,0,0));
btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
btn1.addActionListener(this);
panel1.add(btn1);

textField1= new JTextField(20);

DefaultTableCellRenderer renderer= new DefaultTableCellRenderer(){
    @Override
    public Component getTableCellRendererComponent(JTable arg0, Object arg1, boolean arg2, boolean arg3, int arg4,int arg5){
        Component tableCellRendererComponent= super.getTableCellRendererComponent(arg0,arg1,arg2,arg3,arg4,arg5);
        int align=DefaultTableCellRenderer.CENTER;

        ((DefaultTableCellRenderer)tableCellRendererComponent).setHorizontalAlignment(align);
        return  tableCellRendererComponent;
    }
};
        tabelModel=new DefaultTableModel(names,0);
        jTable=new JTable(tabelModel);

        for (int i=0;i<=10;i++)
        jTable.getColumnModel().getColumn(i).setCellRenderer(renderer);
        jTable.getTableHeader().setBackground(Color.WHITE);
        jTable.getTableHeader().setForeground(Color.BLACK);
        jTable.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        jTable.getTableHeader().setPreferredSize(new Dimension(50,40));
        jTable.setDragEnabled(false);
        jTable.setBorder(new EmptyBorder(0,0,0,0));
        jTable.setFocusable(false);
        jTable.setGridColor(Color.LIGHT_GRAY);
        jTable.getTableHeader().setReorderingAllowed(false);

        int i=0,j=0,roll_no,classes;

        String name,stream,email,address,gender,dob,father_name,admission_date,phone_no;
        try {
            Connect con = new Connect();
            String query = "select * from student";
            ResultSet resultSet = con.st.executeQuery(query);
            while (resultSet.next()) {
                name=resultSet.getString("name");
                roll_no= resultSet.getInt("roll_number");
                classes=resultSet.getInt("class");
                stream=resultSet.getString("stream");
                email=resultSet.getString("email");
                address=resultSet.getString("address");
                phone_no=resultSet.getString("phone_number");
                gender=resultSet.getString("gender");
                dob=resultSet.getString("dob");
                father_name=resultSet.getString("father_name");
                admission_date=resultSet.getString("admission_date");
                Object data[]={name,roll_no,classes,stream,email,address,phone_no,gender,dob,father_name,admission_date};
                tabelModel.addRow(data);
            }
            con.c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        JScrollPane scrollPane= new JScrollPane(jTable);
        scrollPane.setViewportView(jTable);

        frame.add(scrollPane);
        panel1.add(textField1);
        panel1.add(btn1);
        scrollPane.setBounds(0,132,1075,350);
        textField1.setBounds(700,40,200,30);
        btn1.setBounds(925,40,100,30);
        frame.validate();
    }
@Override
    public void actionPerformed(ActionEvent event){
if (event.getSource()==btn1){
roll_no=Integer.parseInt(textField1.getText());
    new Student_Profile();
}
    }
    public static void main(String args[]){
        new Student_Details();
    }
}


package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Faculty_Details implements ActionListener{

    JFrame frame;
    JTable jTable;
    JLabel label1,label2,label3;
    JTextField textField1;
    JButton button1,button2;
    JPanel panel1;
    DefaultTableModel tabelModel;
    static int faculty_id;
    String[] names={"Faculty Name","Faculty Id","Email","Address","Gender","Position","DOB","Qualification","Experience","Phone no","Joining Date","View"};

    public Faculty_Details(){
        frame= new JFrame();
        frame.setLayout(null);
        frame.setTitle("Faculty Record");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(1075,630);
        frame.setLocation(300,165);
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

label2= new JLabel("Faculty Record");
label2.setForeground(Color.WHITE);
label2.setFont(new Font("Arial",Font.BOLD,23));
panel1.add(label2);
label2.setBounds(400,40,200,30);

        button2= new JButton("View Profile");
        button2.setBackground(Color.WHITE);
        button2.setForeground(new Color(32,178,170));
        button2.setBorder(new EmptyBorder(0,0,0,0));
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.addActionListener(this);

        textField1= new JTextField(20);
        textField1.setBorder(new EmptyBorder(0,0,0,0));

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

String name,email,address,gender,position,dob,qualification,experience,join_date,phone_no;
int id;
        try {
            Connect con = new Connect();

            String query = "select * from faculty";
            ResultSet resultSet = con.st.executeQuery(query);
            while (resultSet.next()) {
                name=resultSet.getString("faculty_name");
               id = resultSet.getInt("faculty_id");
                email=resultSet.getString("email");
               address =resultSet.getString("address");
               gender =resultSet.getString("gender");
                position=resultSet.getString("position");
               dob =resultSet.getString("dob");
                qualification=resultSet.getString("qualification");
               experience =resultSet.getString("experience");
                phone_no=resultSet.getString("phone_number");
               join_date =resultSet.getString("join_date");
                Object data[]={name,id,email,address,gender,position,dob,qualification,experience,phone_no,join_date};
                tabelModel.addRow(data);
            }
            con.c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        jTable.getTableHeader().setBackground(Color.WHITE);
        jTable.getTableHeader().setForeground(Color.BLACK);
        jTable.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        jTable.getTableHeader().setPreferredSize(new Dimension(50,35));
        jTable.setDragEnabled(false);
        jTable.setFocusable(false);
        jTable.setBorder(new EmptyBorder(0,0,0,0));
        jTable.setGridColor(Color.LIGHT_GRAY);
        jTable.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollPane= new JScrollPane(jTable);
        scrollPane.setViewportView(jTable);

        frame.add(scrollPane);
        panel1.add(textField1);
        panel1.add(button2);
        scrollPane.setBounds(0,132,1075,350);
        textField1.setBounds(700,40,200,30);
        button2.setBounds(925,40,100,30);

frame.validate();
    }

    @Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource()==button2){
            faculty_id=Integer.parseInt(textField1.getText());
            new Faculty_Profile();
        }
    }
    public static void main(String args[]){
        new Faculty_Details();
    }
}

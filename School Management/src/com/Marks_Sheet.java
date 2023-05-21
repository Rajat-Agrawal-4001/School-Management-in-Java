package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;

public class Marks_Sheet implements  ActionListener{

    JFrame frame;
    JTable jTable;
    JButton btn1;
    JPanel panel1;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,
    label17,label18,label19,label20,label21;
    public int roll_num;

    public Marks_Sheet () {
        frame = new JFrame();
        panel1= new JPanel();
        frame.setTitle("Marks Sheet");
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(980, 620);
        frame.setLocation(300, 140);
        frame.setLayout(null);
        frame.setResizable(false);

        label1= new JLabel("Examination Result");
        label2= new JLabel("Name");
        label3= new JLabel("Class");
        label4= new JLabel("Roll No");
        label5= new JLabel("Father's Name");
        label6= new JLabel("Percentage");
        label7= new JLabel();
        label8= new JLabel("School");
        label9= new JLabel();
        label10= new JLabel();
        label11= new JLabel();
        label12= new JLabel();
        label13= new JLabel();

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\avatar.jpg"));
        Image myimage1 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        label14= new JLabel(new ImageIcon(myimage1));
        label15= new JLabel("Session");
        label16= new JLabel();
        label17= new JLabel("Result Status");
        label18= new JLabel("Issued on");
        label19= new JLabel();
        label20= new JLabel();

        ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("com\\images\\16.jpg"));
        Image img= icon.getImage().getScaledInstance(980,620,Image.SCALE_SMOOTH);
        ImageIcon icon2=new ImageIcon(img);
        label21 = new JLabel(icon2);

        btn1= new JButton("Print");
        btn1.setBackground(new Color(32,178,170));
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setBorder(new EmptyBorder(0,0,0,0));
        btn1.addActionListener(this);

        label21.add(label1);
        label21.add(label2);
        label21.add(label4);
        label21.add(label5);
        label21.add(label8);
        label21.add(label6);
        label21.add(label3);
        label21.add(label7);
        label21.add(label9);
        label21.add(label10);
        label21.add(label11);
        label21.add(label12);
        label21.add(label13);
        label21.add(label14);
        label21.add(btn1);
        label21.add(label15);
        label21.add(label16);
        label21.add(label17);
        label21.add(label18);
        label21.add(label19);
        label21.add(label20);
        frame.add(label21);

        label1.setBounds(365, 47, 272, 44);
        label2.setBounds(70, 100, 100, 30);
        label3.setBounds(500, 100, 100, 30);
        label4.setBounds(70, 130, 100, 30);
        label5.setBounds(70, 160, 100, 30);
        label6.setBounds(500, 130, 100, 30);
        label7.setBounds(220, 100, 100, 30);
        label8.setBounds(500, 160, 100, 30);
        label9.setBounds(600, 100, 100, 30);
        label10.setBounds(220, 130, 100, 30);
        label11.setBounds(220, 160, 100, 30);
        label12.setBounds(600, 130, 100, 30);
        label13.setBounds(600, 160, 250, 30);
        label14.setBounds(800, 70, 100, 100);
        btn1.setBounds(817,200,80,25);
        label15.setBounds(70,190,100,30);
        label16.setBounds(220,190,250,30);
        label17.setBounds(700,500,100,30);
        label18.setBounds(100,500,100,30);
        label19.setBounds(800,500,100,30);
        label20.setBounds(200,500,100,30);

        label21.setBounds(0,0,980,620);

        label1.setBackground(new Color(255, 255, 255));
        label1.setFont(new Font("Arial", Font.BOLD, 18));

        roll_num=View_Result.roll_no;
        System.out.println(roll_num);

        String[][] mydata=new String[15][12];
        String roll_number="";
        String photo="";

        // fetching the student info from database
        try {
            Connect con = new Connect();

            String query = "select * from student where roll_number="+roll_num;
            ResultSet resultSet = con.st.executeQuery(query);
            if(resultSet.next()) {
                label7.setText(resultSet.getString("name"));
                roll_number=(String) resultSet.getString("roll_number");
                label9.setText(resultSet.getString("class"));
                label11.setText(resultSet.getString("father_name"));
                label16.setText(resultSet.getString("session_year"));
                String sessionYear=resultSet.getString("session_year");
                label1.setText("Examination Result  "+sessionYear+"");
                label13.setText("Leman High School, Aligarh.");
                 photo=resultSet.getString("photo");
            }
            con.c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        label10.setText(roll_number);
        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\"+photo+""));
        Image myimage2 = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        label14.setIcon(new ImageIcon(myimage2));

        // fetching the students marks from database

        String subject1="",subject2="",subject3="",subject4="",subject5="",marks1="",marks2="",marks3="",marks4="",marks5="";
        String practical_marks1="40";
        String practical_marks2="40";
        String practical_marks3="40";
        String practical_marks4="40";
        String practical_marks5="40";
        String total_marks1="150";
        String total_marks2="150";
        String total_marks3="150";
        String total_marks4="150";
        String total_marks5="150";

        String declare_date="";

        try {
            Connect con = new Connect();

            String query = "select * from marks where roll_number='"+roll_num+"'";
            ResultSet resultSet = con.st.executeQuery(query);
            // System.out.println(result);
            if(resultSet.next()) {
                roll_number=(String) resultSet.getString("roll_number");
                declare_date=resultSet.getString("date");
                subject1=(String) resultSet.getString("subject1");
                subject2=(String) resultSet.getString("subject2");
                subject3=(String) resultSet.getString("subject3");
                subject4=(String) resultSet.getString("subject4");
                subject5=(String) resultSet.getString("subject5");
                marks1=(String) resultSet.getString("marks1");
                marks2=(String) resultSet.getString("marks2");
                marks3=(String) resultSet.getString("marks3");
                marks4=(String) resultSet.getString("marks4");
                marks5=(String) resultSet.getString("marks5");
            }
            con.c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        label20.setText(declare_date);

        int no1,no2,no3,no4,no5;
        no1= Integer.parseInt(marks1);
        no2= Integer.parseInt(marks2);
        no3= Integer.parseInt(marks3);
        no4= Integer.parseInt(marks4);
        no5= Integer.parseInt(marks5);

        int total_theory_marks=no1+no2+no3+no4+no5;
        int total_practical_marks=200;
        int total_obtain_marks=total_practical_marks+total_theory_marks;

         System.out.println(total_obtain_marks);
        int total_max_marks=750;
        float percentage=((float) total_obtain_marks/(float) total_max_marks)*100;

        System.out.println(percentage);
        label12.setText(percentage+"  %");

        String Result_status="";

        if(no1<40 || no2<40 || no3<40 || no4<40 || no5<40)
            Result_status="Fail";
        else
            Result_status="Pass";
        label19.setText(Result_status);

        String[][] data = new String[6][5];
        data[0][0]=subject1;
        data[0][1]= marks1;
        data[0][2]=practical_marks1;
        data[0][3]=total_marks1;
        data[0][4]="P";
        if (Integer.parseInt(data[0][1])<40)
            data[0][4]="F";

        data[1][0]=subject2;
        data[1][1]= marks2;
        data[1][2]=practical_marks2;
        data[1][3]=total_marks2;
        data[1][4]="P";
        if (Integer.parseInt(data[1][1])<40)
            data[1][4]="F";

        data[2][0]=subject3;
        data[2][1]= marks3;
        data[2][2]=practical_marks3;
        data[2][3]=total_marks3;
        data[2][4]="P";
        if (Integer.parseInt(data[2][1])<40)
            data[2][4]="F";

        data[3][0]=subject4;
        data[3][1]= marks4;
        data[3][2]=practical_marks4;
        data[3][3]=total_marks4;
        data[3][4]="P";
        if (Integer.parseInt(data[3][1])<40)
            data[3][4]="F";

        data[4][0]=subject5;
        data[4][1]= marks5;
        data[4][2]=practical_marks5;
        data[4][3]=total_marks5;
        data[4][4]="P";
        if (Integer.parseInt(data[4][1])<40)
            data[4][4]="F";

        String[] names = {"Subject Name", "Theory Marks", "Practical Marks", "Total Max. Marks", "Pass/Fail"};
        jTable = new JTable(data, names);

        jTable.setRowHeight(25);
        jTable.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        jTable.getTableHeader().setBackground(Color.WHITE);
        jTable.setFont(new Font("Arial",Font.PLAIN,18));
        jTable.getTableHeader().setPreferredSize(new Dimension(50,40));
        jTable.setGridColor(Color.LIGHT_GRAY);
        jTable.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollPane = new JScrollPane(jTable);
        label21.add(scrollPane);
       scrollPane.setBounds(100, 280, 700, 193);

        frame.validate();
    }
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == btn1) {

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageNumber) throws PrinterException {
                pageFormat.setOrientation(PageFormat.LANDSCAPE);
                if (pageNumber > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) graphics;
                g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2.scale(0.47, 0.47);
                label21.print(g2);
                return Printable.PAGE_EXISTS;
            }
        });

        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        }
    }
}
    public static void main(String args[]){
        new Marks_Sheet();
    }
}

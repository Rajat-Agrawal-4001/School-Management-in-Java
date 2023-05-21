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

public class Student_Profile implements  ActionListener{

    JFrame frame;
    JTable jTable;
    JButton btn1,btn2;
    JPanel panel1,mainPanel;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,
            label17,label18,label19,label20,label21,label22,label23,label24,label25,label26,label27,label28,label29,label30;
    public int roll_num;

    public Student_Profile () {
        frame = new JFrame();

        frame.setTitle("Student Profile");
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setSize(980, 675);
        frame.setLocation(300, 95);
        frame.setLayout(null);
        frame.setResizable(false);

        mainPanel= new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);
        frame.add(mainPanel);
        mainPanel.setBounds(0,0,980,675);

        panel1= new JPanel();
panel1.setLayout(null);
        panel1.setBackground(new Color(32,178,170));
        mainPanel.add(panel1);
        panel1.setBounds(0,0,980,100);

        label30= new JLabel();
        panel1.add(label30);
        label30.setBounds(650,4,100,100);

        ImageIcon myicon1= new ImageIcon(ClassLoader.getSystemResource("com\\images\\logo3.png"));
        Image img1= myicon1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon icon3=new ImageIcon(img1);
        label30.setIcon(icon3);

        btn2 = new JButton("Print");
        btn2.setBorder(new EmptyBorder(0, 0, 0, 0));
        btn2.setFocusable(false);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.setForeground(new Color(32,178,170));
        btn2.setBackground(new Color(255, 255, 255));
        btn2.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn2.setFocusable(false);
        btn2.setBounds(50, 45, 100, 30);
        panel1.add(btn2);
        btn2.addActionListener(this);

        label1= new JLabel("Student Profile");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        panel1.add(label1);
        label1.setForeground(Color.WHITE);
        label1.setBounds(365, 26, 272, 44);

        label2= new JLabel("Student Name");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setBorder(new LineBorder(new Color(192, 192, 192)));
        mainPanel.add(label2);
        label2.setBounds(70, 160, 200, 30);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        label3= new JLabel("Class");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setBorder(new LineBorder(new Color(192, 192, 192)));
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label3);
        label3.setBounds(70, 200, 200, 30);

        label4= new JLabel("Roll No");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setBorder(new LineBorder(new Color(192, 192, 192)));
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label4);
        label4.setBounds(70, 120, 200, 30);

        label6= new JLabel("Address");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setBorder(new LineBorder(new Color(192, 192, 192)));
        label6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label6);
        label6.setBounds(70, 240, 200, 30);

        label7= new JLabel("Email ID");
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        label7.setBorder(new LineBorder(new Color(192, 192, 192)));
        label7.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label7);
        label7.setBounds(70, 280, 200, 30);

        label8= new JLabel("Date of Birth");
        label8.setHorizontalAlignment(SwingConstants.CENTER);
        label8.setBorder(new LineBorder(new Color(192, 192, 192)));
        label8.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label8);
        label8.setBounds(70, 320, 200, 30);

        label9= new JLabel("Phone No");
        label9.setHorizontalAlignment(SwingConstants.CENTER);
        label9.setBorder(new LineBorder(new Color(192, 192, 192)));
        label9.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label9);
        label9.setBounds(70, 360, 200, 30);

        label10= new JLabel("Addmission Date");
        label10.setHorizontalAlignment(SwingConstants.CENTER);
        label10.setBorder(new LineBorder(new Color(192, 192, 192)));
        label10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label10);
        label10.setBounds(70,560, 200, 30);

        label11= new JLabel("Stream");
        label11.setHorizontalAlignment(SwingConstants.CENTER);
        label11.setBorder(new LineBorder(new Color(192, 192, 192)));
        label11.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label11);
        label11.setBounds(70, 400, 200, 30);

        label12= new JLabel("Father Name");
        label12.setHorizontalAlignment(SwingConstants.CENTER);
        label12.setBorder(new LineBorder(new Color(192, 192, 192)));
        label12.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label12);
        label12.setBounds(70, 440, 200, 30);

        label13= new JLabel("Gender");
        label13.setHorizontalAlignment(SwingConstants.CENTER);
        label13.setBorder(new LineBorder(new Color(192, 192, 192)));
        label13.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label13);
        label13.setBounds(70, 480, 200, 30);

        label15= new JLabel("Age");
        label15.setHorizontalAlignment(SwingConstants.CENTER);
        label15.setBorder(new LineBorder(new Color(192, 192, 192)));
        label15.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mainPanel.add(label15);
        label15.setBounds(70, 520, 200, 30);

        label16= new JLabel("205");
        label16.setHorizontalAlignment(SwingConstants.CENTER);
        label16.setBorder(new LineBorder(new Color(192, 192, 192)));
        label16.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label16.setBackground(Color.orange);
        mainPanel.add(label16);
        label16.setBounds(271, 120, 300, 30);

        label17= new JLabel("Rajat Agrawal");
        label17.setHorizontalAlignment(SwingConstants.CENTER);
        label17.setBorder(new LineBorder(new Color(192, 192, 192)));
        label17.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label17.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label17);
        label17.setBounds(271, 160, 300, 30);

        label18= new JLabel("10");
        label18.setHorizontalAlignment(SwingConstants.CENTER);
        label18.setBorder(new LineBorder(new Color(192, 192, 192)));
        label18.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label18.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label18);
        label18.setBounds(271, 200, 300, 30);

        label19= new JLabel("Aligarh");
        label19.setHorizontalAlignment(SwingConstants.CENTER);
        label19.setBorder(new LineBorder(new Color(192, 192, 192)));
        label19.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label19.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label19);
        label19.setBounds(271, 240, 300, 30);

        label20= new JLabel("rajatagrawal9394@gmail.com");
        label20.setHorizontalAlignment(SwingConstants.CENTER);
        label20.setBorder(new LineBorder(new Color(192, 192, 192)));
        label20.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label20.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label20);
        label20.setBounds(271, 280, 300, 30);

        label21= new JLabel("25-12-1998");
        label21.setHorizontalAlignment(SwingConstants.CENTER);
        label21.setBorder(new LineBorder(new Color(192, 192, 192)));
        label21.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label21.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label21);
        label21.setBounds(271, 320, 300, 30);

        label22= new JLabel("819181610");
        label22.setHorizontalAlignment(SwingConstants.CENTER);
        label22.setBorder(new LineBorder(new Color(192, 192, 192)));
        label22.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label22.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label22);
        label22.setBounds(271, 360, 300, 30);

        label23= new JLabel("Science");
        label23.setHorizontalAlignment(SwingConstants.CENTER);
        label23.setBorder(new LineBorder(new Color(192, 192, 192)));
        label23.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label23.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label23);
        label23.setBounds(271, 400, 300, 30);

        label24= new JLabel("Mr. Harish");
        label24.setHorizontalAlignment(SwingConstants.CENTER);
        label24.setBorder(new LineBorder(new Color(192, 192, 192)));
        label24.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label24.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label24);
        label24.setBounds(271, 440, 300, 30);

        label25= new JLabel("Male");
        label25.setHorizontalAlignment(SwingConstants.CENTER);
        label25.setBorder(new LineBorder(new Color(192, 192, 192)));
        label25.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label25.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label25);
        label25.setBounds(271, 480, 300, 30);

        label26= new JLabel("24");
        label26.setHorizontalAlignment(SwingConstants.CENTER);
        label26.setBorder(new LineBorder(new Color(192, 192, 192)));
        label26.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label26.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label26);
        label26.setBounds(271, 520, 300, 30);

        label27= new JLabel("09-04-2022");
        label27.setHorizontalAlignment(SwingConstants.CENTER);
        label27.setBorder(new LineBorder(new Color(192, 192, 192)));
        label27.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label27.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(label27);
        label27.setBounds(271, 560, 300, 30);

   label28= new JLabel("Rajat Agrawal");
        label28.setFont(new Font("Segoe UI", Font.BOLD, 18));
        label28.setBackground(Color.WHITE);
        label28.setForeground(Color.WHITE);
        panel1.add(label28);
        label28.setBounds(785, 50, 250, 30);

        ImageIcon myimg1 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\avatar.jpg"));
        Image newimage1 = myimg1.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        label14= new JLabel(new ImageIcon(newimage1));
        mainPanel.add(label14);
        label14.setBounds(745, 128, 150, 150);

        roll_num=Student_Details.roll_no;
        String roll_number="";
            String photo="";
            try {
                    Connect con = new Connect();
                    String query = "select * from student where roll_number='"+roll_num+"'";
                    ResultSet resultSet = con.st.executeQuery(query);
                    // System.out.println(result);
                    if(resultSet.next()) {
                            label17.setText(resultSet.getString("name"));
                            label16.setText((String)resultSet.getString("roll_number"));
                            label18.setText(resultSet.getString("class"));
                            label24.setText(resultSet.getString("father_name"));
                            photo=resultSet.getString("photo");
                        label19.setText(resultSet.getString("address"));
                        label20.setText(resultSet.getString("email"));
                        label27.setText(resultSet.getString("admission_date"));
                       label22.setText(resultSet.getString("phone_number"));
                        label23.setText(resultSet.getString("stream"));
                        label25.setText(resultSet.getString("gender"));;
                        label26.setText(resultSet.getString("age"));
                        label21.setText(resultSet.getString("dob"));
                        label28.setText(resultSet.getString("name"));
                    }
                    con.c.close();
            }
            catch(Exception e){
                    e.printStackTrace();
            }
        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("com\\images\\"+photo+""));
        Image myimage2 = img2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        label14.setIcon(new ImageIcon(myimage2));
        frame.validate();
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==btn2){
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

                    mainPanel.print(g2);
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
        new Student_Profile();
    }
}

package universitymanagementsystemm;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class TeacherLeave extends JFrame implements ActionListener {

    Choice cEmpId, ctime;
    //JDateChooser dcdate;
    JButton submit, cancel;
    JTextField email , Date;
    
    TeacherLeave() {
        
        setSize(500, 550);
        setLocation(550, 100);
        setLayout(null);
        
         getContentPane().setBackground(new Color(89, 36, 33));
         
         
      
        
        JLabel heading = new JLabel("Apply Leave (Teacher)");
        heading.setBounds(40, 50, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel lblemail = new JLabel("Employee Email: ");
        lblemail.setBounds(60, 100, 200, 20);
        lblemail.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblemail.setForeground(Color.WHITE);
        add(lblemail);
        
        
        email = new JTextField();
        email.setBounds(60,130,200,20);
        add(email);
   
      
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200, 20);
        lbldate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbldate.setForeground(Color.WHITE);
        add(lbldate);
        
        Date = new JTextField();
        Date.setBounds(60,210,200,25);
        add(Date);
        
    
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 260, 200, 20);
        lbltime.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbltime.setForeground(Color.WHITE);
        add(lbltime);
        
        ctime = new Choice();
        ctime.setBounds(60, 290, 200, 20);
        ctime.add("Full Day");
        ctime.add("Half Day");
        ctime.add("Two days");  
        ctime.add("Five days");
        ctime.add("Ten days");
        ctime.add("Fiftenth days");
        
        add(ctime);
        
        submit = new JButton("Apply");
        submit.setBounds(60, 350, 100, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
         submit.setFocusable(false);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(200, 350, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
       
        cancel.setFocusable(false);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
//            String email = cEmpId.getSelectedItem();
//          //  String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
//            String duration = ctime.getSelectedItem();
//            
//            String query = "insert into teacherleave values('"+rollno+"', '"+date+"', '"+duration+"')";
//            
//            try {
//                Conn c = new Conn();
//              //  c.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Leave Confirmed");
//                setVisible(false);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new TeacherLeave();
    }
}
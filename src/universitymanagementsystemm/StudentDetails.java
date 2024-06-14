package universitymanagementsystemm;
import javax.swing.*;
import java.awt.*;
public class StudentDetails extends JFrame{
    
    Choice crollno;
    
    
    
    StudentDetails(){
        
        setSize(900,700);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Search by Roll Number");
        heading.setBounds(20,20,150,20);
        add(heading);
        
        
        
        
        crollno = new Choice();
        
        
        
         setVisible(true);
    }
    public static void main(String[] args){
        new StudentDetails();
    }
}

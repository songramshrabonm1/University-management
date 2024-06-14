package universitymanagementsystemm;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class Project extends JFrame  implements ActionListener {
    
    //implements ActionListener
    Project(){
        
        
        setSize(1360,885);//pic size - 745 ,385//1360,765
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        
	
        Font fnt1 = new Font("Arial",Font.BOLD,65);
        
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,1360,120);
        p1.setBackground(new Color(89, 36, 33));
      

         JLabel img = new JLabel(new ImageIcon("C:\\\\Users\\\\pc\\\\UniversityManagementSystemm\\\\src\\\\icons\\\\logo-white-new.png"));
         img.setBounds(0,50,100,100);
         p1.add(img);
        
        
        JLabel Name = new JLabel("LEADING UNIVERSITY");
        Name.setFont(fnt1);
        Name.setForeground(Color.WHITE);
        Name.setBounds(250,50,400,150);
        p1.add(Name);
        
        JLabel Name2 = new JLabel("a promise to lead ....");
        Name2.setFont(new Font("Arial",Font.ITALIC,30));
        Name2.setForeground(Color.WHITE);
        Name2.setBounds(750,100,400,150);
        p1.add(Name2);
  
        add(p1);

  
        
                 
            
       JMenuBar mb = new JMenuBar();
        
       mb.setBounds(0, 120, 1360, 10);
       
       
       //New Information
       JMenu newInformation = new JMenu("New Information");
       newInformation.setForeground(Color.RED);
       mb.add(newInformation);//menu add koreci menubarer upor;
       
       
       JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
       facultyInfo.setBackground(Color.WHITE);
       newInformation.add(facultyInfo);
       
       JMenuItem studentInfo = new JMenuItem("New Student Information");
       studentInfo.setBackground(Color.WHITE);
       newInformation.add(studentInfo);
       
       
       
       //Details
        JMenu details = new JMenu("View Details");
       details.setForeground(Color.BLUE);
       mb.add(details);//menu add koreci menubarer upor;
       
       
       JMenuItem facultyDetails = new JMenuItem("New Faculty Details");
       facultyDetails.setBackground(Color.WHITE);
       details.add(facultyDetails);
       
       JMenuItem studentDetails = new JMenuItem("New Student Details");
       studentDetails.setBackground(Color.WHITE);
       details.add(studentDetails);
       
       //Leave
       JMenu leave = new JMenu("Apply Leave");
       leave.setForeground(Color.RED);
       mb.add(leave);
       
       JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
       facultyLeave.setBackground(Color.red);
       leave.add(facultyLeave);
       
       JMenuItem StudentLeave = new JMenuItem("Student Leave");
       StudentLeave.setBackground(Color.red);
       leave.add(StudentLeave);
       
       
       
       //Leave Details
       JMenu leaveDetails = new JMenu("Leave Details");
       leaveDetails.setBackground(Color.BLUE);
       mb.add(leaveDetails);
       
       JMenuItem FacultyLeaveDetails = new JMenuItem("Faculty Leave Details");
       FacultyLeaveDetails.setBackground(Color.BLACK);
       leaveDetails.add(FacultyLeaveDetails);
       
       JMenuItem StudentLeaveDetails = new JMenuItem("Student Leave Details");
       StudentLeaveDetails.setBackground(Color.red);
       leaveDetails.add(StudentLeaveDetails);
       
       
       //Exams
        JMenu Exams = new JMenu("Examination");
       Exams.setForeground(Color.RED);
       mb.add(Exams);
       
       JMenuItem ExaminationDetails = new JMenuItem("Examination Result");
       ExaminationDetails.setBackground(Color.red);
       Exams.add(ExaminationDetails);
       
       JMenuItem ExamMark = new JMenuItem("Enter Marks");
       StudentLeave.setBackground(Color.red);
       Exams.add(ExamMark);
       
       
       //UpdateInformation
       
       JMenu UpdateInfo = new JMenu("Update Details");
       UpdateInfo.setForeground(Color.BLUE);
       mb.add(UpdateInfo);
       
       JMenuItem FacultyUpdate = new JMenuItem("Update Faculty Details");
       FacultyUpdate.setBackground(Color.WHITE);
       UpdateInfo.add(FacultyUpdate);
       
       JMenuItem StudentUpdate = new JMenuItem("Update Student Details");
       StudentUpdate.setBackground(Color.red);
       UpdateInfo.add(StudentUpdate);
       
       
       //Fees
       JMenu fees = new JMenu("Fees Details");
       fees.setForeground(Color.RED);
       mb.add(fees);
       
       JMenuItem FeesStructure = new JMenuItem("Fees Structure");
       FeesStructure.setBackground(Color.red);
       fees.add(FeesStructure);
       
       JMenuItem feeForm = new JMenuItem("Student Fee form");
       feeForm.setBackground(Color.red);
       fees.add(feeForm);
       
       
       //Exits
        JMenu Exits = new JMenu("Exits");
       Exits.setForeground(Color.BLUE);
       mb.add(Exits);
       
       JMenuItem exit = new JMenuItem("Exits");
       exit.setBackground(Color.WHITE);
       exit.addActionListener(this);
       fees.add(Exits);
 
       
      
       setJMenuBar(mb); //menubar add korar jonno 
        
        
        
        
        
        
        
        

        JPanel p2 = new JPanel();
        p2.setBounds(0,120,1360,765);

       JLabel image = new JLabel(new ImageIcon("C:\\Users\\pc\\UniversityManagementSystemm\\src\\icons\\Upload Leading University.jpg"));
        p2.add(image);
        add(p2);
        
       
        
        
        
        setVisible(true);
    }
    @Override
	public void actionPerformed(ActionEvent e){
        String msg = e.getActionCommand();
        if(msg.equals("Exits")){
            setVisible(false);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    public static void main(String[] args){
        new Project();
    }
    
}

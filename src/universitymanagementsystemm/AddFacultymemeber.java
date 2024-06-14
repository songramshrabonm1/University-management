package universitymanagementsystemm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddFacultymemeber extends JFrame implements ActionListener{

        //Random ran = new Random();
        //long first8 = (ran.nextLong()
    
        JComboBox cbcourse;
        
        JTextField tfname,tEmail,pscRslt,jscRslt,sscRslt ,tffathername,tfmotherName,Roll,tAdrees ,tphone,dob ,DATE;
        
        JButton submit,cancel;
        AddFacultymemeber(){
 
            setSize(900,820);
            setLocationRelativeTo(null);
            setLayout(null);
            
        JLabel Image = new JLabel(new ImageIcon("C:\\Users\\pc\\UniversityManagementSystemm\\src\\icons\\logo-white-new.png"));
	Image.setBounds(400,20,110,100);
	add(Image);

            JLabel heading = new JLabel("New Teacher Details");
            heading.setForeground(Color.WHITE);
            heading.setBounds(310,130,500,50);
            heading.setFont(new Font("Arial",Font.BOLD,30));
            add(heading);
            
            //Name: 
            JLabel lblName = new JLabel("Teacher Name:");
            lblName.setForeground(Color.WHITE);
            lblName.setBounds(50,200,150,30);
            lblName.setFont(new Font("Arial",Font.BOLD,18));
            add(lblName);
            
            
            tfname = new JTextField();
            tfname.setBounds(200,200,150,30);
            add(tfname); 
 
            //Father's name
             JLabel lblFatherName = new JLabel("Father's Name:");
             lblFatherName.setForeground(Color.WHITE);
            lblFatherName.setBounds(50,250,150,30);
            lblFatherName.setFont(new Font("Arial",Font.BOLD,18));
            add(lblFatherName);
            
            
            tffathername = new JTextField();
            tffathername.setBounds(200,250,150,30);
            add(tffathername); 
       
            //Mother Name 

             JLabel lblMotherName = new JLabel("Mother's Name:");
            lblMotherName.setBounds(50,300,150,30);
            lblMotherName.setForeground(Color.WHITE);
            lblMotherName.setFont(new Font("Arial",Font.BOLD,18));
            add(lblMotherName);
            
            
            tfmotherName = new JTextField();
            tfmotherName.setBounds(200,300,150,30);
            add(tfmotherName); 
            
            

            
            //Roll NUMBER
            JLabel rollNumber = new JLabel("Roll Number");
            rollNumber.setBounds(50,350,150,30);
            rollNumber.setForeground(Color.WHITE);
            rollNumber.setFont(new Font("Arial",Font.BOLD,18));
            add(rollNumber);
            
            Roll = new JTextField("21320200");
            Roll.setBounds(200,350,150,30);
            add(Roll);
            
            
            
            //dateofBirth
             JLabel lbldob = new JLabel("Date of Birth");
            lbldob.setBounds(400,350,200,30);
            lbldob.setForeground(Color.WHITE);
            lbldob.setFont(new Font("Arial",Font.BOLD,18));
            add(lbldob); 
            
            dob = new JTextField("Date/Month/Year");
            dob.setBounds(600,350,150,30);
            add(dob);
            
            //Address
            JLabel Adress = new JLabel("Address");
            Adress.setBounds(50,400,150,30);
            Adress.setForeground(Color.WHITE);
            Adress.setFont(new Font("Arial",Font.BOLD,18));
            add(Adress);
            
            tAdrees = new JTextField();
            tAdrees.setBounds(200,400,150,30);
            add(tAdrees);
            
            //Phone
            JLabel phone = new JLabel("Phone Number");
            phone.setBounds(400,400,200,30);
            phone.setForeground(Color.WHITE);
            phone.setFont(new Font("Arial",Font.BOLD,18));
            add(phone); 
            
            tphone = new JTextField("01");
            tphone.setBounds(600,400,150,30);
            add(tphone);
            
            
            //Email
            JLabel Email = new JLabel("Email Id");
            Email.setBounds(50,450,150,30);
            Email.setForeground(Color.WHITE);
            Email.setFont(new Font("Arial",Font.BOLD,18));
            add(Email);
            
            tEmail = new JTextField("@gmail.com");
            tEmail.setBounds(200,450,150,30);
            add(tEmail);
            
            //psc
            JLabel psc = new JLabel("PSC Result");
            psc.setBounds(400,450,200,30);
            psc.setForeground(Color.WHITE);
            psc.setFont(new Font("Arial",Font.BOLD,18));
            add(psc); 
            
            pscRslt = new JTextField();
            pscRslt.setBounds(600,450,150,30);
            pscRslt.setForeground(Color.WHITE);
            add(pscRslt);
            
            
            //JSC
             JLabel JSC = new JLabel("JSC Result");
            JSC.setBounds(50,500,150,30);
            JSC.setForeground(Color.WHITE);
            JSC.setFont(new Font("Arial",Font.BOLD,18));
            add(JSC);
            
            jscRslt = new JTextField();
            jscRslt.setBounds(200,500,150,30);
            add(jscRslt);
            
            //ssc
            JLabel ssc = new JLabel("SSC Result");
            ssc.setBounds(400,500,200,30);
            ssc.setForeground(Color.WHITE);
            ssc.setFont(new Font("Arial",Font.BOLD,18));
            add(ssc); 
            
            sscRslt = new JTextField();
            sscRslt.setBounds(600,500,150,30);
            add(sscRslt);
            
            //Label Course
             JLabel course = new JLabel("Department");
            course.setBounds(50,550,150,30);
            course.setForeground(Color.WHITE);
            course.setFont(new Font("Arial",Font.BOLD,18));
            add(course);
            
            String Course[] = {"Cse" , "BBA" ,"Civil", "MBA","EEE","BA","LAW","Architecture","Tourism and Hospitality Management","English"};
            
            cbcourse = new JComboBox(Course);
            cbcourse.setBounds(200,550,150,30);
            cbcourse.setBackground(Color.WHITE);
            add(cbcourse);
            
            
            //Admission Date
            JLabel date = new JLabel("Admission Date");
            date.setBounds(400,550,200,30);
            date.setForeground(Color.WHITE);
            date.setFont(new Font("Arial",Font.BOLD,18));
            add(date); 
            
            DATE = new JTextField();
            DATE.setBounds(600,550,150,30);
            add(DATE);
            
            //Submit button
            
                submit = new JButton("Submit");
		submit.setFont(new Font("Tahoma",Font.BOLD,15));
		submit.setBounds(250, 680, 120, 40);
		submit.setBackground(Color.BLACK);
                submit.setForeground(Color.WHITE);
		submit.setFocusable(false);
                submit.addActionListener(this);

		add(submit);
                
                //cancel button
                
                cancel = new JButton("Cancel");
		cancel.setFont(new Font("Tahoma",Font.BOLD,15));
		cancel.setBounds(400, 680, 120, 40);
		cancel.setBackground(Color.BLACK);
                cancel.setForeground(Color.WHITE);
		cancel.setFocusable(false);
                cancel.addActionListener(this);

		add(cancel);
                
                
                getContentPane().setBackground(new Color(89, 36, 33));
		
     
            setVisible(true);
        }
        
        
         @Override
	public void actionPerformed(ActionEvent e) {
            
            
            if(e.getSource() == submit){
                
                String name =tfname.getText();
                String fname = tffathername.getText();
                String mname = tfmotherName.getText();
                String rollno = Roll.getText();
                String Dob = dob.getText();
                String adrees = tAdrees.getText();
                String phone = tphone.getText();
                String email = tEmail.getText();
                String PSC = pscRslt.getText();
                String JSC = jscRslt.getText();
                String SSc = sscRslt.getText();
                String Department = (String)cbcourse.getSelectedItem();
                String AdmissionDate = DATE.getText();
                
            }else{
                setVisible(false);
            }

        }

    
    public static void main(String[] args){
        new AddFacultymemeber();
    }
}

    
    
    
    
    
    
    
    
    
    
    
 

package universitymanagementsystemm;
import java.util.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.*;
public class Registration extends JFrame implements ActionListener {
    
    JTextField nameTxt , emailTxt , passTxt , conPassTxt , mobileTxt , addressTxt;
    
    JButton registerBtn,cancelBtn;
    Registration(){
        
        setSize(900,650);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        
        
        Font labelFont = new Font("Arial",Font.BOLD,16);
        
        //JPanel headerPanel = new JPanel();
       // headerPanel.setBackground(Color
       
       JLabel Image = new JLabel(new ImageIcon("C:\\Users\\pc\\UniversityManagementSystemm\\src\\icons\\logo-white-new.png"));
	Image.setBounds(400,20,110,100);
	add(Image);
       
       JLabel heading = new JLabel("Registration Form");
       heading.setForeground(Color.WHITE);
       heading.setBounds(330,130,500,50);
       heading.setFont(new Font("Arial",Font.BOLD,30));
       add(heading);
       
       
       //Name: 
            JLabel lblName = new JLabel("Name:");
            lblName.setForeground(Color.WHITE);
            lblName.setBounds(50,200,150,30);
            lblName.setFont(new Font("Arial",Font.BOLD,18));
            add(lblName);
            
            
            nameTxt = new JTextField();
            nameTxt.setBounds(240,200,150,30);
            add(nameTxt); 
            
            
            
            //Email
             JLabel email = new JLabel("Email : ");
             email.setForeground(Color.WHITE);
            email.setBounds(50,250,150,30);
            email.setFont(new Font("Arial",Font.BOLD,18));
            add(email);
            
            
           emailTxt  = new JTextField();
            emailTxt.setBounds(240,250,150,30);
            add(emailTxt); 
            
            
            //password
        
             JLabel Password = new JLabel("Password: ");
             Password.setForeground(Color.WHITE);
            Password.setBounds(50,300,150,30);
            Password.setFont(new Font("Arial",Font.BOLD,18));
            add(Password);
            
            
            passTxt = new JTextField();
            passTxt.setBounds(240,300,150,30);
            add(passTxt); 
            
            //confirmPassword
            
            JLabel ConfirmPassword = new JLabel("Confirm Password: ");
             ConfirmPassword.setForeground(Color.WHITE);
            ConfirmPassword.setBounds(50,350,190,30);
            ConfirmPassword.setFont(new Font("Arial",Font.BOLD,18));
            add(ConfirmPassword);
            
            
             conPassTxt= new JTextField();
            conPassTxt.setBounds(240,350,150,30);
            add(conPassTxt); 
            
            
            //Mobile 
            
            JLabel mobileLabel = new JLabel("Mobile : ");
             mobileLabel.setForeground(Color.WHITE);
            mobileLabel.setBounds(50,400,150,30);
            mobileLabel.setFont(new Font("Arial",Font.BOLD,18));
            add(mobileLabel);
            
            
            mobileTxt = new JTextField();
            mobileTxt.setBounds(240,400,150,30);
            add(mobileTxt); 
            
            //Address
             JLabel Address = new JLabel("Address : ");
             Address.setForeground(Color.WHITE);
            Address.setBounds(50,450,150,30);
            Address.setFont(new Font("Arial",Font.BOLD,18));
            add(Address);
            
            
             addressTxt= new JTextField();
            addressTxt.setBounds(240,450,150,30);
            add(addressTxt); 
            
      
            //REGISTER BUTTION 
             //Submit button
            
                registerBtn = new JButton("Register");
		registerBtn.setFont(new Font("Tahoma",Font.BOLD,15));
		registerBtn.setBounds(250, 540, 120, 40);
		registerBtn.setBackground(Color.BLACK);
                registerBtn.setForeground(Color.WHITE);
		registerBtn.setFocusable(false);
                registerBtn.addActionListener(this);

		add(registerBtn);
                
                //cancel button
                
                cancelBtn = new JButton("Cancel");
		cancelBtn.setFont(new Font("Tahoma",Font.BOLD,15));
		cancelBtn.setBounds(400, 540, 120, 40);
		cancelBtn.setBackground(Color.BLACK);
                cancelBtn.setForeground(Color.WHITE);
		cancelBtn.setFocusable(false);
                cancelBtn.addActionListener(this);

		add(cancelBtn);
    
     getContentPane().setBackground(new Color(89, 36, 33));
     setResizable(false);
    
        setVisible(true);
    }
     
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == registerBtn) {
                    
                   // String username = tfUsername.getText();
                  //  String password = pfPassword.getText();
                  
                  String username = nameTxt.getText();
                  String email = emailTxt.getText();
                  String pass = passTxt.getText();
                  String conPass = conPassTxt.getText();
                  String moblile = mobileTxt.getText();
                  String address = addressTxt.getText();
                  
                  //validation : 
                  String userNameRegex = "^[A-Za-z ]{3,10}$";
                  
              
                  String emailRegex = "^(cse||law||eee||bba||llb||civil||eng)_[0-9]{10}@lus\\.ac\\.bd$";
                  String passRegex = "^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+])).{6,20}$";
                  String mobileRegex = "^(\\+88)?01[2-9]\\d{8}$";
                  String addressRegex = "^[A-Za-z0-9]{3,10}$";
                  
                  
                  if(!Pattern.matches(userNameRegex,username)){
                      JOptionPane.showMessageDialog(null,"Username");
                  }
                  else if(!Pattern.matches(emailRegex,email)){
                      JOptionPane.showMessageDialog(null,"email");

                  }
                  else if(!Pattern.matches(passRegex,pass)){
                      JOptionPane.showMessageDialog(null,"Invalid password");

                  }
                   else if(!conPass.equals(pass)){
                      JOptionPane.showMessageDialog(null,"password and confirm password not match");

                  }
                  
                   else if(!Pattern.matches(mobileRegex,moblile)){
                      JOptionPane.showMessageDialog(null,"Invalid mobile number");

                  }
                    else if(!Pattern.matches(addressRegex,address)){
                      JOptionPane.showMessageDialog(null,"Invalid Address");

                  }
                    else{
                      //  System.out.println(username);
                        
                      
                      Conn c = new Conn();
                      String q = "INSERT INTO `admindetails`(`Name`, `Email`, `Password`, `Mobile`, `Address`) VALUES ('"+username+"','"+email+"','"+pass+"','"+moblile+"','"+address+"')";
                      c.Register(q);
                      c.close();
                    }
                  
			
		}
		if(e.getSource()==cancelBtn) {
			setVisible(false);
		}
		
	}
    
    
    
    

    public static void main(String[] args){
        new Registration();
    }
    
    
}

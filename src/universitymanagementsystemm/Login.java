package universitymanagementsystemm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame  implements ActionListener {
 
    
    JTextField tfUsername , pfPassword;
  //  JPasswordField pfPassword;
    JButton login,registration ;
    Login(){
		getContentPane().setBackground(new Color(89, 36, 33));
		setSize(800,450);
		
		setLayout(null);
		
		JLabel labelUserName = new JLabel("Email : ");
		labelUserName.setBounds(40, 120, 100, 20);
		labelUserName.setFont(new Font("Arial",Font.BOLD,17));
                labelUserName.setForeground(Color.WHITE);
		add(labelUserName);
		
		
		
		
		 tfUsername = new JTextField();
		tfUsername.setBounds(150,120,150,20);
		add(tfUsername);
		
		
		
		JLabel labelPassword = new JLabel("Password : ");
		labelPassword.setBounds(40, 170, 100, 20);
		labelPassword.setFont(new Font("Arial",Font.BOLD,17));
                 labelPassword.setForeground(Color.WHITE);
		add(labelPassword);
		
		 pfPassword = new JTextField();
		pfPassword.setBounds(150, 170, 150, 20);
		add(pfPassword);
		
		
		 login = new JButton("Login");
		login.setFont(new Font("Tahoma",Font.BOLD,15));
		login.setBounds(40, 240, 120, 40);
		login.setBackground(Color.BLACK);
                login.setForeground(Color.WHITE);
		login.setFocusable(false);
                login.addActionListener(this);

		add(login);
		
		
		 registration = new JButton("Register");
		registration.setFont(new Font("Tahoma",Font.BOLD,15));
		registration.setBounds(200, 240, 120, 40);
		registration.setBackground(Color.BLACK);
                registration.setForeground(Color.WHITE);
		registration.setFocusable(false);
                registration.addActionListener(this);
		add(registration);
		
		
                JLabel Image = new JLabel(new ImageIcon("C:\\Users\\pc\\UniversityManagementSystemm\\src\\icons\\logo-white.png"));
		Image.setBounds(350,20,350,350);
		add(Image);

                
                
                
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
    
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == login) {
                    
                    String username = tfUsername.getText();
                    String password = pfPassword.getText();
                    
			
		}
		if(e.getSource()==registration) {
			//setVisible(false);
                        dispose(); //current frame dispose hoye jabe 
                         new Registration();
		}
		
	}

    
    public static void main(String[] args){
        new Login();
    }
}

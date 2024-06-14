
package universitymanagementsystemm;
import javax.swing.*;

public class First extends JFrame implements Runnable{  
    
    Thread t;
    First(){
        //C:\Users\pc\UniversityManagementSystemm\src\icons\leading_university_cover.jpeg
        
        
        JLabel image = new JLabel(new ImageIcon("C:\\Users\\pc\\UniversityManagementSystemm\\src\\icons\\leading_university_cover.jpeg"));
	add(image);
		
	setSize(765,430); //Frame width and height;//pic size - 745 ,385
	setLocationRelativeTo(null);//get Middle
        setResizable(false);
        
        t = new Thread(this);
        t.start();
        
	setVisible(true);

       
    }
    @Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(4000); //1s -> 1000 milisecond;
                        setVisible(false);
			new Login();
			
		}catch(Exception e) {
			
		}
		
	}

    
    
}

            /*
            
            JDBC connectivity 6 parts:
            
            1-Import the package : import java.sql.*;
           
            
            2-Load and register the driver 
            	Class.forName(“com.mysql.jdbc.driver);
                Class→ this is a class
		ForName → method of the Class 
           
            
            3-Established the connection 
                Connection con = DriverManager.getConnection(url, username , password);

                Connection → is a interface 
                DriverManger→Which is implements in the DriverManager class 
                getConnection→ this is a static method. We know we implement the static method directly in the class.

            4-Create Statement : 
            
                Statement st = con.createStatement();

                Statement → interface
                createStatement → method of the con class

            5-Execute the query : 
            
         ResultSet rs = st.executeQuery(“select *from Student”);

        ResultSet → interface 

            
            
            6-Process Result: 
                    while(rs.next())
            {
                    System.out.println(“rs.getInt(1)+” “+rs.getString(2));
                }
            
            7- Close the connection: 
            
                                st.close();
                                con.close();

            */
            
            
            
           // Class.forname("");     

package universitymanagementsystemm;

import java.sql.*;

public class Conn {



    public Connection con;
    public Statement st;
    public ResultSet rs;

    public Conn()
    {
   
   
        try
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }
            catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "");
            st = con.createStatement();
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
    public void Register(String register)
    {
        try
        {
            st.executeUpdate(register);
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
   // c.close();
    
       public void close()
    {
        try
        {
            st.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

        try
        {
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
    




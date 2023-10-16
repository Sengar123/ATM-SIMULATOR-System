
package bank.management.system;
import java.sql.*;
public class Conn {
    //register the driver
    //create connection
    //statement creation
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";
            c = DriverManager.getConnection(url, "root", "Divya@123");
            s=c.createStatement();
            }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}

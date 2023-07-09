package bank.management.system;
import java.sql.*;

public class Conn {
      Connection c;
      Statement s;
      
  public Conn(){
      
    try{
//        Class.forName(com.mysql.cj.jdbc.Driver); //work as mysql-connect-java .jar file 
        c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","1234");
        s=c.createStatement();
        
    }catch (Exception e){
        System.out.println(e);
        
    }
  }    
}

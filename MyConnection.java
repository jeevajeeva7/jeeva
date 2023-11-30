import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Nithya.G
 */
public class MyConnection {
     public static Connection getConnection()
     {
       Connection no=null;
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        no=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bill","root","12345");
      }catch (Exception ex)
      {
      System.out.println(ex.getMessage());
      }
       return no;
      }
    
}

package Servlet;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
		 
		public class Servlet1   {
			 
			public static boolean validate(String name , String pass)
		    {
		      boolean status = false;
		      try
		      {
		    	  Class.forName("com.mysql.cj.jdbc.Driver");
		    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/front","root","12345");
		    	 
		    PreparedStatement ps = con.prepareStatement(" SELECT * FROM quiz WHERE USERNAME =? and PASSWORD =? ");
		    ps.setString(1,name);
		    ps.setString(2,pass);
		     System.out.println(name);
		     System.out.println(pass);
		    ResultSet rs=ps.executeQuery();
		    status = rs.next();
		    
		      }catch(Exception e)
		        {
		    	  System.out.println(e);
		        }
		    	return status;
		    

		}
			
			public static void validate(String a , String b , String c ,String d ,String e ,String f ,String g ,String h )
		    {
				 
				
				System.out.println(a);
				 System.out.println(b);
				 System.out.println(c);
				 System.out.println(d);
				 System.out.println(e);
				 System.out.println(f);
				 System.out.println(g);
				 System.out.println(h);
			     
		      try
		      {
		    	  Class.forName("com.mysql.cj.jdbc.Driver");
		    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/front","root","12345");
		    	 
		    PreparedStatement pa = con.prepareStatement (" INSERT  INTO quiz (`FATHERNAME`,`MOTHERNAME`,`ADDRESS`,`PHONE`,`CITY`,`STATE`,`USERNAME`,`PASSWORD`)  values(?,?,?,?,?,?,?,?)");
		    pa.setString(1,a);
		    pa.setString(2,b);
		    pa.setString(3,c);
		    pa.setString(4,d);
		    pa.setString(5,e);
		    pa.setString(6,f);
		    pa.setString(7,g);
		    pa.setString(8,h);
		    pa.executeUpdate();

		 
		   
		     
		    
		      }catch(Exception ex)
		        {
		    	  System.out.println(ex);
		        }
		    	 
		    

		}
			
			
			}

			 
			
			
			
		

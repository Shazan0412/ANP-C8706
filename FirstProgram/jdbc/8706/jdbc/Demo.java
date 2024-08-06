package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("welcome");
		
		//step 1  
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//step 2  
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"apke database ka naam ", "Username", "Password") ;

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp8706", "root", "Shazan1012@") ;
			
			// step 3 	
			Statement st  = 	con.createStatement();
			// step 4  
			ResultSet  rs  = st.executeQuery("select * from Employee") ;
			
			while(rs.next()) {
				System.out.println(   "student "+ rs.getInt(1) +" " +rs.getString(2 )+" " +rs.getInt(3) );
			}
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
		
		
		

	}

}

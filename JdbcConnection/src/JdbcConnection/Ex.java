package JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306";
		String username ="root";
		String pass ="root";
		
 // package import 
//load package
		try {
		Connection conn = DriverManager.getConnection(url,username,pass);
		System.out.print("establish connection");
		}
		
		catch(Exception e){
			
		}
		
		//establish connection
//write statement
//execute statement
//close connection


	}

}

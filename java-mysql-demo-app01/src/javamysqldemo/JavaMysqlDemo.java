package javamysqldemo;

import java.sql.*;

public class JavaMysqlDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "root";		
		String pass = "root";


		// Establish connection to database
		myConn = DriverManager.getConnection(dbUrl, user, pass);
			
		// Create a statement
		myStmt = myConn.createStatement();
			
		// Execute SQL query and get the result set
		myRs = myStmt.executeQuery("select * from employees");
			
		// Process the result set
		while (myRs.next()) {
			System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
		}
		
	}
	
}

package javamysqldemo;

import java.sql.*;

public class JavaMysqlDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/gomalaysia";
		String user = "root";		
		String pass = "root";


		// Establish connection to database
		myConn = DriverManager.getConnection(dbUrl, user, pass);
			
		// Create a statement
		myStmt = myConn.createStatement();
			
		// Execute SQL query and get the result set
		myRs = myStmt.executeQuery("select * from events");
			
		// Process the result set
		while (myRs.next()) {
			System.out.println(myRs.getString("event_name") + ", " + myRs.getDate("start_date") + ", " + myRs.getString("venue"));
		}
		
	}
	
}

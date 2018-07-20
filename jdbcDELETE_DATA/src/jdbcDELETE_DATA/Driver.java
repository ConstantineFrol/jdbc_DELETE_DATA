/**
 * 
 */
package jdbcDELETE_DATA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

/**
 * @author 		Konstantin Frolov
 * Student No.	R00144177
 * email		konstantin.frolov@mycit.ie
 */
public class Driver {

	/**
	 * 1. Create Connection
	 * 2. Create a Statement
	 * 3. Execute SQL Query
	 * 
	 */
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/demo1?autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "root";
		
		try {

			// 1. Create Connection
			Connection myConnection = DriverManager.getConnection(url, user, password);
			
			// 2. Create a Statement
			Statement myStatement = myConnection.createStatement();
			
			// 3. Execute Deleting query
			String deletingQuery = "DELETE FROM employees "
					+ "WHERE LastName = 'Brown'";
			
			int rowsAffected = myStatement.executeUpdate(deletingQuery);
			
			System.out.println("Rows affected: " + rowsAffected);
			System.out.println("Delete Complete.");
			
		}catch(Exception exc) {
			System.out.println("Oops !!!\n" + exc.getMessage());
		}
		
	}

}

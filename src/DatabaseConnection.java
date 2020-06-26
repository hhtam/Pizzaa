
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DatabaseConnection {
	protected Connection conn;
	///Tao Lien ket voi SQL Server
	public DatabaseConnection() {
		try {
			String dbURL = "jdbc:sqlserver://localhost\\HOAITAM;user=sa;password=123;database=test";
			
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
			    System.out.println("OK");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Added your method 
	//
	//
	
	
	
	public static void main(String[] args) {
		new DatabaseConnection();
	}
}

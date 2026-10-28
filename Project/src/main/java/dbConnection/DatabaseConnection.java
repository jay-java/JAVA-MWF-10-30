package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection createConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/ecomm";
		String username = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("connection established");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}

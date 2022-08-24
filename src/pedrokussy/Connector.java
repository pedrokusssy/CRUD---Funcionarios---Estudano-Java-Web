package pedrokussy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private Connection connection;
	
	public Connection getConnection() {
		
		try {
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/func",
					"pedro",
					"P@ssw0rd");
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
			
		}
		
		return connection;
		
	}
	
}

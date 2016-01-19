package Pattern_Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	public Connection getConnection(){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}

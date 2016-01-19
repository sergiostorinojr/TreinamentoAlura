package Pattern_Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:32:29
 *
 * Pattern Factory
 *
 */
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

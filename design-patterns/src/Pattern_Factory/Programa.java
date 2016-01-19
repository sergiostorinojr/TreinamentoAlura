package Pattern_Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:32:42
 *
 * Pattern Factory
 *
 */
public class Programa {

	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
			
			PreparedStatement ps = con.prepareStatement("select *from tabela");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

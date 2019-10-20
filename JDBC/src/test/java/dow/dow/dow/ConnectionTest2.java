package dow.dow.dow;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class ConnectionTest2 {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/jsp";
	private static final String USER ="root";
	private static final String PW = "akscl";


	@Test
	public void test() throws ClassNotFoundException {
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL,USER,PW)){
			System.out.println("이건되잖아");
			
			
		}catch(Exception e) {
			
			System.out.println("아씨발");
			
		}
		
	}

}

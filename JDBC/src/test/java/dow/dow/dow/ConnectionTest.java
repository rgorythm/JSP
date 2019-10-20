package dow.dow.dow;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"}) 
public class ConnectionTest {
	@Inject
	private DataSource ds;
	
	@Test
	public void test() {
		
		try(Connection con = ds.getConnection()){
			
			System.out.println("이건되야한다");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("야이시발");
			
		}
		
	}

}

package pass.pass.pass;

import javax.servlet.http.HttpSession;

public interface PassService {
	
	public void insertUser(PassVO passVO) throws Exception;
	
	public void selectUser(PassVO passVO) throws Exception;
	

}

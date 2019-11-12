package pass.pass.pass;

public interface PassDAO {
	
	public void insertUser(PassVO passVO) throws Exception;
	
	public PassVO selectUser(PassVO passVO) throws Exception;
	
	public PassVO selectUser2() throws Exception;
	
}

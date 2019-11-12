package pass.pass.pass;

import org.springframework.stereotype.Component;

@Component
public class PassVO {
	
	String userID;
	String userPASS;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPASS() {
		return userPASS;
	}
	public void setUserPASS(String userPASS) {
		this.userPASS = userPASS;
	}
	
}

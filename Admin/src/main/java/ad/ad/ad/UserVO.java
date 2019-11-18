package ad.ad.ad;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component("UserVO")
public class UserVO {
	
	String userID;
	String userPASS;
	Date regDate;
	
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
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}

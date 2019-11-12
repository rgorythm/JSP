package pass.pass.pass;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.http.HttpRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.stereotype.Service;
@Service
public class PassServiceImp implements PassService{
	@Inject
	PassDAO dao;
	@Inject
	BCryptPasswordEncoder encoder;
	
	@Override
	public void insertUser(PassVO passVO) throws Exception {
		// TODO Auto-generated method stub
								//사용자가 입력한 패스워드를 암호화
		String encodingPass = encoder.encode(passVO.getUserPASS());
		passVO.setUserPASS(encodingPass);
		//그럼db에는 암호화된 비번이들어감
		dao.insertUser(passVO);
	}

	@Override
	public void selectUser(PassVO passVO) throws Exception {
		// TODO Auto-generated method stub
		PassVO confirm = dao.selectUser(passVO);
		PassVO confirm2 = dao.selectUser2();
		String encodingpass = confirm.getUserPASS();
		String pass = passVO.getUserPASS();
		String pass2 = confirm2.getUserPASS();
		System.out.println("admin비번:"+pass);
		System.out.println("admin2비번:"+pass2);
		boolean a = encoder.matches(pass, encodingpass);
		boolean b = encoder.matches(pass, pass2);
		System.out.println(a);
		System.out.println(b);
		
	}

}

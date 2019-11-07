package scu.scu.scu;

import javax.inject.Inject;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class CustomAuthenticationProvider implements AuthenticationProvider{
	@Inject
	CustomUserDetailService service;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userID = (String)authentication.getPrincipal();
		String userPASS = (String)authentication.getCredentials();
		//위에2개가 로그인폼에서 입력한 ID PASS값
		
		//얘느 위에서받은 ID값으로 디비접근 디비정보를담아 dbuser에
		CustomUserDetail dbuser = (CustomUserDetail)service.loadUserByUsername(userID);
		if(!userPASS.equals(dbuser.getPassword())) {
			//사용자입력PASS랑 db에있는PASS랑비교
			System.out.println("비밀번호가맞지않대");
			throw new BadCredentialsException(userID);
		}else {
			System.out.println("비번이맞아");
														// ID PASS 권한? 3개리턴
			return new UsernamePasswordAuthenticationToken(userID, userPASS, dbuser.getAuthorities());
		}
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}

package scu.scu.scu;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService{
	@Inject
	UserDAO dao;
	
	@Override
	//로그인폼에소 입력받은 ID 값으로 검색해서 걔정보를 user에담음 아까 VO걔야 user가
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		CustomUserDetail user = dao.userGet(username);
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}
		return user;
	}
}

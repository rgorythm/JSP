package scu.scu.scu;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@SuppressWarnings("serial")
//userDetails인터페이스 구현 VO라고보면?될듯
public class CustomUserDetail implements UserDetails{
	private String userID;
	private String userPASS;
	private String AUTHORITY;
	private boolean ENABLED;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		//권한정보를 받는건데.. 왜 어레이리스트로 받는지모르겠음
		ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		auth.add(new SimpleGrantedAuthority(AUTHORITY));
		return auth;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return userPASS;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userID;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}

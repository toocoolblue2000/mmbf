package in.co.mmbf.loanstar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserService implements UserDetailsService {

	@Autowired
	private UserRestService userRestService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRestService.getUserByUsername(username);
	}
}

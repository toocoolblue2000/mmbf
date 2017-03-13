package in.co.mmbf.loanstar.service.fake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import in.co.mmbf.loanstar.model.User;
import in.co.mmbf.loanstar.service.UserRestService;

@Service
@Profile("fake")
public class FakeUserRestService implements UserRestService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails getUserByUsername(String username) {
		return getFakeUser(username);
	}

	private UserDetails getFakeUser(String username) {
		if (username.equals("invalid")) {
			throw new UsernameNotFoundException(username + " not found");
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(username));
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		user.setRoles(getRoles(username));
		return user;
	}

	private String[] getRoles(String username) {
		if ("admin".equals(username)) {
			return new String[]{"ROLE_USER", "ROLE_ADMIN"};
		}
		return new String[]{"ROLE_USER"};
	}
}

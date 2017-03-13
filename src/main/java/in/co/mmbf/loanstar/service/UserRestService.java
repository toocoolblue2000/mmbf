package in.co.mmbf.loanstar.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserRestService {

	UserDetails getUserByUsername(String username);

}

package in.co.mmbf.loanstar;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class ApplicationSecurity
extends WebSecurityConfigurerAdapter
implements AuthenticationSuccessHandler {

    @Autowired
    private UserDetailsService userService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
        .authorizeRequests()
            .antMatchers("/resources/**").permitAll()
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login").successHandler(this)
            .permitAll()
            .and()
        .logout()
            .permitAll();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
	  web.ignoring().antMatchers("/js/**", "/css/**", "/img/**", "favicon.ico");
	}


	@Override
    public void onAuthenticationSuccess(HttpServletRequest request,
            HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN")){
        	getRedirectStrategy().sendRedirect(request, response, "/admin");
            return;
        }
        getRedirectStrategy().sendRedirect(request, response, "/home");
    }

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authProvider());
//		auth.userDetailsService(userService);
//		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
//		auth.inMemoryAuthentication().withUser("admin").password("password").roles("USER", "ADMIN");
	}

	@Bean
	public DaoAuthenticationProvider authProvider() {
	    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	    authProvider.setUserDetailsService(userService);
	    authProvider.setPasswordEncoder(getPasswordEncoder());
	    return authProvider;
	}

	@Bean
	public RedirectStrategy getRedirectStrategy(){
		return new DefaultRedirectStrategy();
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}

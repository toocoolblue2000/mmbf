package in.co.mmbf.loanstar;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("in.co.mmbf.mmbf")
public class Application {

	public static void main(String[] args) throws Exception {
		// Set user password to "password" for demo purposes only
		new SpringApplicationBuilder(Application.class).properties(
				"security.user.password=password").run(args);
	}

	/*@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}*/
}

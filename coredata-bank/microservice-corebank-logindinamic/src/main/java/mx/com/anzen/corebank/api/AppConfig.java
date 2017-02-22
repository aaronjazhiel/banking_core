package mx.com.anzen.corebank.api;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.anzen.corebank.models.LoginBean;
 

@Configuration
public class AppConfig {
	
	@Bean(name="login")
	public LoginBean login(){
		return new LoginBean();
	}
	 
	

}

package mx.com.anzen.corebank.api;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

@Configuration
public class AppConfig {
	
	@Bean(name="login")
	public LoginBean login(){
		return new LoginBean();
	}
	 
	

}

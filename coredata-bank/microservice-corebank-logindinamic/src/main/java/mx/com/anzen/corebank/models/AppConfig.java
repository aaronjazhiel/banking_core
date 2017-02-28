package mx.com.anzen.corebank.models;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

@Configuration
public class AppConfig {
	
	@Bean(name="login")
	public LoginBean login(){
		return new LoginBean();
	}
	
	
	@Bean(name="loginEstatico")
	public LoginEstBean loginEstatico(){
		return new LoginEstBean();
	}
	
	@Bean(name="loginDinamico")
	public LoginDinBean loginDinamico(){
		return new LoginDinBean();
	}
	 
	
	
}

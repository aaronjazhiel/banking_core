package mx.com.anzen.corebank.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.anzen.corebank.services.LoginDinamicServices;
 

@Controller
public class LoginDinamicController {
	
@Autowired
 private  LoginDinamicServices loginDinamicServices;
 
 @RequestMapping("/LoginDinamic")
 @ResponseBody
 String home() {
 return "HolaMundo";
 }
 
}
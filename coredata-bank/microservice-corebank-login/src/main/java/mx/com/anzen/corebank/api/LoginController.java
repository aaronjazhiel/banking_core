package mx.com.anzen.corebank.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.anzen.corebank.services.LoginServices;
 

@RestController
public class LoginController {
	
 @Autowired
 private LoginServices loginServices;
	
 
 @RequestMapping("/login")
 @ResponseBody
 String home() {
 return "LoginAplication";
 }
 
}
package mx.com.anzen.corebank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 

@Controller
public class LoginController {
 
 @RequestMapping("/login")
 @ResponseBody
 String home() {
 return "LoginAplication";
 }
 
}
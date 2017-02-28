package mx.com.anzen.corebank.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.anzen.corebank.services.LoginOutServices;
import net.minidev.json.JSONObject;
 

@RestController
public class LogoutController {
	@Autowired
	 private  LoginOutServices loginOutServices;
 
 @RequestMapping("/logout")
 @ResponseBody
 String home() {
 return "logoutAplication";
 }
 
 
 /**
	 * 
	 * @param json
	 * @return
	 * 
	 * nombre del servicio: LogOut.
	 * 
	 * 
	 * Requiest.
	 * 
	 *   - Cliente.
	 *   - Usuario.
	 *   - Identificador de sesión.
	 *   
	 *   
	 *   Response.
	 *   
	 *   
	 *   respuest:  true
	 *   
	 */
	
	@RequestMapping(method = RequestMethod.POST, value = "/Logout")
	 public @ResponseBody JSONObject logindinamico(@RequestBody JSONObject  json ) {
			 
			JSONObject  jsonResponse =loginOutServices.solicitudLogOut(json);
				
	     return jsonResponse;
	 }
 
}
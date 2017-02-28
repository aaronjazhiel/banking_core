package mx.com.anzen.corebank.api;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
 
 
 /**
	 * 
	 * @param json
	 * @return
	 * 
	 * 
	 * nombre del servicio:  Login Estático.
	 * 
	 * Requiest
	 * - Cliente
	 * - Usuario
	 * - Password
	 * - IP
	 * 
	 * Response.
	 * 
	 * - Identificador de sesión
	 * - Hora de login
	 * - Fecha de login
	 * - Fecha de Vigencia de Clave
	 * - Razón Social
	 * - Hora login previo
	 * - Fecha login previo
	 * - Servicios contratados  
	 * 
	 */
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/LoginEstatico")
public @ResponseBody JSONObject loginestatico(@RequestBody JSONObject  json ) {
		 
		JSONObject  jsonResponse =loginServices.solicitudLoginEst(json);
			
  return jsonResponse;
}
 
}
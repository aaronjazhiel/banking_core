package mx.com.anzen.corebank.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.anzen.corebank.services.LoginDinamicServices;
import net.minidev.json.JSONObject;
 

@RestController
public class LoginDinamicController {
	  
	@Autowired
	 private  LoginDinamicServices loginDinamicServices;
	 
	 @RequestMapping("/LoginDinamic")
	 @ResponseBody
	 String home() {
	 return "loginDinamic";
	 } 
	
	/**
	 * 
	 * @param json
	 * @return
	 * Descripcion: clase que realiza la Solicitud de login dinámico ingresando los siguientes datos:
	 * 
	 * * Requiest.
	 *  - Cliente.
	 *  - Usuario.
	 *  - Identificador de sesión.
	 * * Response.
	 * 	- Valor de comparación
	 */
	 
	@RequestMapping(method = RequestMethod.POST, value = "/validalogin")
 public @ResponseBody JSONObject validalogin(@RequestBody JSONObject  json ) {
		 
		JSONObject  jsonResponse =loginDinamicServices.solicitudLogin(json);
			
     return jsonResponse;
 }
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/loginestatico")
 public @ResponseBody JSONObject loginestatico(@RequestBody JSONObject  json ) {
		 
		JSONObject  jsonResponse =loginDinamicServices.solicitudLoginEst(json);
			
     return jsonResponse;
 }
	
	@RequestMapping(method = RequestMethod.POST, value = "/logOut")
	 public @ResponseBody JSONObject logindinamico(@RequestBody JSONObject  json ) {
			 
			JSONObject  jsonResponse =loginDinamicServices.logOut(json);
				
	     return jsonResponse;
	 }
	
 
}
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
	 
	@RequestMapping(method = RequestMethod.POST, value = "/LoginDinamico")
 public @ResponseBody JSONObject validalogin(@RequestBody JSONObject  json ) {
		 
		JSONObject  jsonResponse =loginDinamicServices.solicitudLogin(json);
			
     return jsonResponse;
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
		 
		JSONObject  jsonResponse =loginDinamicServices.solicitudLoginEst(json);
			
     return jsonResponse;
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
			 
			JSONObject  jsonResponse =loginDinamicServices.solicitudLogOut(json);
				
	     return jsonResponse;
	 }
	
	
	
	/**
	 * 
	 * @param json
	 * @return
	 * 
	 * nombre del servicio: Validación de login dinámico
	 * 
	 * request.
	 * 
	 * -  Cliente.
	 * -  Usuario.
	 * -  Identificador de sesión.
	 * -  Valor dinámico.
	 * 
	 * Respuest.
	 * 
	 * -  "respuest": true
	 * 
	 */
	
	@RequestMapping(method = RequestMethod.POST, value = "/ValidaciónDeLoginDinámico")
	 public @ResponseBody JSONObject validaciónDeLoginDinámico(@RequestBody JSONObject  json ) {
			 
			JSONObject  jsonResponse =loginDinamicServices.solicitudLoginDinamico(json);
				
	     return jsonResponse;
	 }
	
 
}
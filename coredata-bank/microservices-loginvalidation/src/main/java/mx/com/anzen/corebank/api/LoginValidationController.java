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

import mx.com.anzen.corebank.services.LoginValidationServices;
import net.minidev.json.JSONObject;
 

@RestController
public class LoginValidationController {
	
@Autowired
 private LoginValidationServices loginValidationServices;

 
 @RequestMapping("/validation")
 @ResponseBody
 String home() {
 return "validationAplication";
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
			 
			JSONObject  jsonResponse =loginValidationServices.solicitudLoginDinamico(json);
				
	     return jsonResponse;
	 }
 
}
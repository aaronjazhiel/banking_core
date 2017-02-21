package mx.com.anzen.corebank.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.anzen.corebank.services.LoginDinamicServices;
import net.minidev.json.JSONObject;
 

@Controller
public class LoginDinamicController {
	
	 ApplicationContext appContext=null;
	 LoginBean beanLogin=null; 
	
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
 public @ResponseBody JSONObject insertPersona(@RequestBody JSONObject  json ) {
		 
			appContext=new AnnotationConfigApplicationContext(AppConfig.class);
			 
			beanLogin=(LoginBean) appContext.getBean("login");
			JSONObject jsonObject=null; 
			 try{
				 beanLogin.setCliente(json.get("cliente").toString());
				 beanLogin.setUsuario(json.get("usuario").toString());
				 beanLogin.setIdSesion(json.get("idSesion").toString());
				 
				 if( beanLogin.getCliente().equalsIgnoreCase("007")&&
						   beanLogin.getUsuario().equalsIgnoreCase("1990")&&
						   beanLogin.getIdSesion().equalsIgnoreCase("1233")){
							
						     jsonObject=new JSONObject();
					          
							jsonObject.put("codigo","200");
							jsonObject.put("valor comparativo","23141241412421"); 
						}else{
							jsonObject=new JSONObject();
					          
							jsonObject.put("codigo","300");
							jsonObject.put("descripcion","Ocurrio un problema al consultar"); 
						}
			 }catch(Exception e){
				 jsonObject=new JSONObject(); 
					 jsonObject.put("codigo","99");
						jsonObject.put("descripcion","JSON Incorrecto"); 
				  
			 } 
			/**
			 * Condicion para validar la existencia de los datos a consultar.
			 */
			 
			
			
	        
			 
			/**
			 * Cerramos el ApplicationContext
			 */
			
			((ConfigurableApplicationContext) appContext).close();
			
			
     return jsonObject;
 }
 
}
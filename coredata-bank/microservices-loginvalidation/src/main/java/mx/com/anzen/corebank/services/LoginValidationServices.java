package mx.com.anzen.corebank.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import mx.com.anzen.corebank.models.AppConfig;
import mx.com.anzen.corebank.models.LoginDinBean;
import net.minidev.json.JSONObject;

@Service
public class LoginValidationServices {
	
	ApplicationContext appContext=null; 
	 LoginDinBean beanDinLogin=null;
	 
	
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

	public JSONObject solicitudLoginDinamico(JSONObject json) {
		

		appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		 
		beanDinLogin=(LoginDinBean) appContext.getBean("loginDinamico");
		JSONObject jsonObject=null; 
		 try{
			 beanDinLogin.setCliente(json.get("cliente").toString());
			 beanDinLogin.setUsuario(json.get("usuario").toString());
			 beanDinLogin.setIdSesion(json.get("identificador de sesion").toString());
			 beanDinLogin.setValorDinamico(json.get("valor-dinamico").toString());
			 
			 if( beanDinLogin.getCliente().equalsIgnoreCase("werwer12321")&&
					 beanDinLogin.getUsuario().equalsIgnoreCase("12wined")&&
					 beanDinLogin.getIdSesion().equalsIgnoreCase("12we2345rwfw")&&beanDinLogin.getValorDinamico().equalsIgnoreCase("12-23-sd-x")){
						
					jsonObject=new JSONObject();
				           
					jsonObject.put("respuest",true); 
			}else{
					jsonObject=new JSONObject();
				           
					jsonObject.put("Error","Error en la autenticacion"); 
			}
		 }catch(Exception e){
			 jsonObject=new JSONObject();  
					jsonObject.put("error","no response from server"); 
			  
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

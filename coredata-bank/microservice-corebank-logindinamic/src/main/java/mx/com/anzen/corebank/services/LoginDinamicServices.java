package mx.com.anzen.corebank.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import mx.com.anzen.corebank.models.AppConfig;
import mx.com.anzen.corebank.models.LoginBean; 
import net.minidev.json.JSONObject;

@Service
public class LoginDinamicServices {
	
			ApplicationContext appContext=null;
			 LoginBean beanLogin=null; 
			 
			 
			 
			 /**
			  * 
			  * @param json
			  * @return
			  * 
			  * 
			  * 
			  * Solicitud de login dinámico.
			  * 
			  * 
			  * - Cliente.
			  * - Usuario.
			  * - Identificador de sesión.
			  * 
			  */
			
		
			public JSONObject solicitudLogin(@RequestBody JSONObject  json ) {
				 
				appContext=new AnnotationConfigApplicationContext(AppConfig.class);
				 
				beanLogin=(LoginBean) appContext.getBean("login");
				JSONObject jsonObject=null; 
				 try{
					 beanLogin.setCliente(json.get("cliente").toString());
					 beanLogin.setUsuario(json.get("usuario").toString());
					 beanLogin.setIdSesion(json.get("identificador-de-sesion").toString());
					 
					 if( beanLogin.getCliente().equalsIgnoreCase("qwertywined12345")&&
							   beanLogin.getUsuario().equalsIgnoreCase("wined")&&
							   beanLogin.getIdSesion().equalsIgnoreCase("qwerty12345")){
								
							   jsonObject=new JSONObject();
						           
							   jsonObject.put("valor-de-comparacion",true); 
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

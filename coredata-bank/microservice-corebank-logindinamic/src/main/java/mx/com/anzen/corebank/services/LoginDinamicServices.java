package mx.com.anzen.corebank.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import mx.com.anzen.corebank.models.AppConfig;
import mx.com.anzen.corebank.models.LoginBean;
import mx.com.anzen.corebank.models.LoginDinBean;
import mx.com.anzen.corebank.models.LoginEstBean;
import net.minidev.json.JSONObject;

@Service
public class LoginDinamicServices {
	
			ApplicationContext appContext=null;
			 LoginBean beanLogin=null;
			 LoginEstBean beanEstLogin=null; 
			 LoginDinBean beanDinLogin=null;
			 
			 
			 
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
			
			
			
			public JSONObject solicitudLoginEst(@RequestBody JSONObject  json ) {
				 
				appContext=new AnnotationConfigApplicationContext(AppConfig.class);
				 
				beanEstLogin=(LoginEstBean) appContext.getBean("loginEstatico");
				JSONObject jsonObject=null;  
				 try{
					 beanEstLogin.setCliente(json.get("cliente").toString());
					 beanEstLogin.setUsuario(json.get("usuario").toString()); 
					 beanEstLogin.setPassword(json.get("password").toString());
					 beanEstLogin.setIp(json.get("ip").toString());
					 
					 if( beanEstLogin.getCliente().equalsIgnoreCase("Mutiva")&&beanEstLogin.getUsuario().equalsIgnoreCase("Edwin")&&
							 beanEstLogin.getPassword().equalsIgnoreCase("1234")&&beanEstLogin.getIp().equalsIgnoreCase("192.168.1.2")){
						   
							   jsonObject=new JSONObject(); 
							   
							   jsonObject.put("identificador-de-sesion", "werwer12321");
							   jsonObject.put("hora-de-login", "780");
							   jsonObject.put("fecha-login", "12/12/12");
							   jsonObject.put("Fecha-de-Vigencia-de-Clave", "12/12/12");
							   jsonObject.put("Razon-Social", "Multiva");
							   jsonObject.put("Hora-login-previo", "720");
							   jsonObject.put("Fecha-Login-previo", "12/12/12"); 
							   jsonObject.put("Servicios-contratados", "3"); 
							   
							    
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
			
			
			public JSONObject logOut(@RequestBody JSONObject  json ) {
				 
				appContext=new AnnotationConfigApplicationContext(AppConfig.class);
				 
				beanLogin=(LoginBean) appContext.getBean("login");
				JSONObject jsonObject=null; 
				 try{
					 beanLogin.setCliente(json.get("cliente").toString());
					 beanLogin.setUsuario(json.get("usuario").toString());
					 beanLogin.setIdSesion(json.get("identificador de sesion").toString());
					 
					 if( beanLogin.getCliente().equalsIgnoreCase("Banamexico")&&
							   beanLogin.getUsuario().equalsIgnoreCase("wined")&&
							   beanLogin.getIdSesion().equalsIgnoreCase("asd123qwe123")){
								
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

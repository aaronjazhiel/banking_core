package mx.com.anzen.corebank.services;

import org.json.simple.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import mx.com.anzen.corebank.models.AppConfig;
import mx.com.anzen.corebank.models.LoginEstBean; 

@Service
public class LoginServices {
	
	
	ApplicationContext appContext=null; 
	 LoginEstBean beanEstLogin=null;  
	 
	
	@SuppressWarnings("unchecked")
	public JSONObject solicitudLoginEst(@RequestBody JSONObject  json ) {
		 
		appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		 
		beanEstLogin=(LoginEstBean) appContext.getBean("loginEstatico");
		JSONObject jsonObject=null;  
		 try{
			 beanEstLogin.setCliente(json.get("cliente").toString());
			 beanEstLogin.setUsuario(json.get("usuario").toString()); 
			 beanEstLogin.setPassword(json.get("pasword").toString());
			 beanEstLogin.setIp(json.get("ip").toString());
			 
			 if( beanEstLogin.getCliente().equalsIgnoreCase("Mutiva")&&beanEstLogin.getUsuario().equalsIgnoreCase("Edwin")&&
					 beanEstLogin.getPassword().equalsIgnoreCase("aqui-esta-el-password")&&beanEstLogin.getIp().equalsIgnoreCase("192.168.1.2")){
				   
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

}

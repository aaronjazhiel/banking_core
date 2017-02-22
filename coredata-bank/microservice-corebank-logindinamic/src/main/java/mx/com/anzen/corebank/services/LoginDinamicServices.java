package mx.com.anzen.corebank.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import mx.com.anzen.corebank.api.AppConfig;
import mx.com.anzen.corebank.models.LoginBean;
import net.minidev.json.JSONObject;

@Service
public class LoginDinamicServices {
	
			ApplicationContext appContext=null;
			 LoginBean beanLogin=null; 
			
		
			public JSONObject solicitudLogin(@RequestBody JSONObject  json ) {
				 
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

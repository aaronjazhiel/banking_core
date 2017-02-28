package mx.com.anzen.corebanck.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.anzen.corebanck.models.accountInterbank;
import mx.com.anzen.corebanck.models.accountOwn;
import mx.com.anzen.corebanck.models.accountThird;
import mx.com.anzen.corebanck.models.establishmentQuery;
import mx.com.anzen.corebanck.models.ordersInternational;
import mx.com.anzen.corebanck.models.ordersPayment;
import mx.com.anzen.corebanck.services.ServicesAcc;

@RestController
@EnableAutoConfiguration
public class AccountsRest {
	private static final Logger logger = LoggerFactory.getLogger(AccountsRest.class);
	
	@Autowired
	ServicesAcc serviceAcc ;
	
	@RequestMapping(value="/updateAccountsOwn",method = RequestMethod.PATCH)
	public void getAccount(){
         serviceAcc.updateAccount();
	}
	
	@RequestMapping(value="/deleteAccountOwn",method = RequestMethod.DELETE)
	public @ResponseBody int deleteAccountOwn(){
         return serviceAcc.deleteAccountOwn();
	}
	/**********************************  Select ******************************************/ 
	
	@RequestMapping(path="/getAllAccountsOwn",method = RequestMethod.GET)
	public @ResponseBody List<accountOwn> getAll(){
         return serviceAcc.getAllAccounts();
	}
	
	@RequestMapping(value="/getAccountOwn",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<accountOwn> getAccountOwn(@RequestBody accountOwn jsn){
		return serviceAcc.getAccountOwn(jsn);
	}
	
	@RequestMapping(value="/getAccountThird",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<accountThird> getAccountThird(@RequestBody accountThird jsn){
		return serviceAcc.getAccountThird(jsn);
	}
	
	@RequestMapping(value="/getOrdersPayment",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ordersPayment> getOrdersPayment(@RequestBody ordersPayment jsn){
		return serviceAcc.getOrdersPayment(jsn);
	}
	
	@RequestMapping(value="/getAccountInterbank",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<accountInterbank> getAccountInterbank(@RequestBody accountInterbank jsn){
		return serviceAcc.getAccountInterbank(jsn);
	}
	
	@RequestMapping(value="/getOrdersInternational",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ordersInternational> getOrdersInternational(@RequestBody ordersInternational jsn){
		return serviceAcc.getOrdersInternational(jsn);
	}
	
	@RequestMapping(value="/getEstablishmentQuery",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<establishmentQuery> getEstablishmentQuery(@RequestBody establishmentQuery jsn){
		return serviceAcc.getEstablishmentQuery(jsn);
	}
	
	/****************************************** SAVE  *****************************************/
	@RequestMapping(path="/saveAccountsOwn",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<accountOwn> insertAccountOwn(@RequestBody List<accountOwn> jsn){
         return serviceAcc.insertAccountOwn(jsn);
	}

	@RequestMapping(path="/saveAccountsThird",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<accountThird> insertAccountThird(@RequestBody List<accountThird> jsn){
         return serviceAcc.insertAccountThird(jsn);
	}
	
	@RequestMapping(path="/saveOrdersPayment",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ordersPayment> insertOrdersPayment(@RequestBody List<ordersPayment> jsn){
         return serviceAcc.insertOrdersPayment(jsn);
	}
	
	@RequestMapping(path="/saveAccountInterbank",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<accountInterbank> insertAccountInterbank(@RequestBody List<accountInterbank> jsn){
         return serviceAcc.insertAccountInterbank(jsn);
	}
	
	@RequestMapping(path="/saveOrdersInternational",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ordersInternational> insertOrdersInternational(@RequestBody List<ordersInternational> jsn){
         return serviceAcc.insertOrdersInternational(jsn);
	}
	
	@RequestMapping(path="/saveEstablishmentQuery",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<establishmentQuery> insertEstablishmentQuery(@RequestBody List<establishmentQuery> jsn){
         return serviceAcc.insertEstablishmentQuery(jsn);
	}
	
}

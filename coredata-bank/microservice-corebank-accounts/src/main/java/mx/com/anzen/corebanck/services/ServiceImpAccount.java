package mx.com.anzen.corebanck.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.anzen.corebanck.models.accountInterbank;
import mx.com.anzen.corebanck.models.accountOwn;
import mx.com.anzen.corebanck.models.accountThird;
import mx.com.anzen.corebanck.models.establishmentQuery;
import mx.com.anzen.corebanck.models.ordersInternational;
import mx.com.anzen.corebanck.models.ordersPayment;

@Service
@Transactional
public class ServiceImpAccount implements ServicesAcc{
	private static final Logger logger = LoggerFactory.getLogger(ServiceImpAccount.class);
	@Autowired
	GetImplAccountOwn          implAccountOwn ;
	@Autowired
	GetImplAccountThird        implAccountThird ;
	@Autowired
	GetImplOrdersPayment       implOrdersPayment;
	@Autowired
	GetImplAccountInterbank    implAccountInterbank;
	@Autowired
	GetImplOrdersInternational implOrdersInternational;
	@Autowired
	GetImplEstablishmentQuery  implEstablishmentQuery;
	
	@Override
	public List<accountOwn> getAllAccounts() {
		List<accountOwn> listAcc = implAccountOwn.findAll();
		return listAcc;
	}

	public void updateAccount() {
		implAccountOwn.updateAccount();
	}

	@Override
	public int deleteAccountOwn() {
		return implAccountOwn.deleteAccountOwn();
	}
	/************************* INSERCION ****************************/
	@Override
	public List<accountOwn> insertAccountOwn(List<accountOwn> jsns) {
      logger.info("procesando ......... save AccountOwn "+jsns);
	  return implAccountOwn.save(jsns);
	}
	
	@Override
	public List<accountThird> insertAccountThird(List<accountThird> jsns) {
      logger.info("procesando ......... save AccountThirds "+jsns);
	  return implAccountThird.save(jsns);
	}
	
	@Override
	public List<ordersPayment> insertOrdersPayment(List<ordersPayment> jsn) {
		logger.info("procesando ......... save ordersPayment "+jsn);
		return implOrdersPayment.save(jsn);
	}
	
	
	/************************** SELECCION *************************************/
	@Override
	public List<accountOwn> getAccountOwn(accountOwn jsn) {
		return implAccountOwn.getAccountOwn(jsn.getClient(),jsn.getIdSession(),
				                                   jsn.getAccountType(),jsn.getSucursal(),jsn.getAccount());
	}

	@Override
	public List<accountThird> getAccountThird(accountThird jsn) {
	       return implAccountThird.getAccountThird(jsn.getClient(),jsn.getIdSession(),
				                                        jsn.getAccountType(),jsn.getSucursal(),jsn.getAccount());
	}

	@Override
 	public List<ordersPayment> getOrdersPayment(ordersPayment jsn) {
 		return implOrdersPayment.getAccountThird(jsn.getClient(),jsn.getIdSession(),jsn.getAccountType(),jsn.getName());
	}

	@Override
	public List<accountInterbank> insertAccountInterbank(List<accountInterbank> jsn) {
		return	implAccountInterbank.save(jsn);
	}

	@Override
	public List<accountInterbank> getAccountInterbank(accountInterbank jsn) {
		return implAccountInterbank.getAccountInterbank(jsn.getClient(),jsn.getIdSession(),jsn.getAccountType(),
				                                        jsn.getAccount());
	}

	@Override
	public List<ordersInternational> insertOrdersInternational(List<ordersInternational> jsn) {
		return this.implOrdersInternational.save(jsn);
	}

	@Override
	public List<ordersInternational> getOrdersInternational(ordersInternational jsn) {
		return implOrdersInternational.getOrdersInternational(jsn.getClient(),jsn.getIdSession(),jsn.getTypeOfPerson(),
				                                              jsn.getSwift(),jsn.getBeneficiary());
	}

	@Override
	public List<establishmentQuery> insertEstablishmentQuery(List<establishmentQuery> jsn) {
		return implEstablishmentQuery.save(jsn);
	}

	@Override
	public List<establishmentQuery> getEstablishmentQuery(establishmentQuery jsn) {
		return implEstablishmentQuery.getEstablishmentQuery(jsn.getClient(),jsn.getIdSession(),jsn.getAccountType(),jsn.getEstablishment());
	}
}



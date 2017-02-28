package mx.com.anzen.corebanck.services;

import java.util.List;

import mx.com.anzen.corebanck.models.accountInterbank;
import mx.com.anzen.corebanck.models.accountOwn;
import mx.com.anzen.corebanck.models.accountThird;
import mx.com.anzen.corebanck.models.establishmentQuery;
import mx.com.anzen.corebanck.models.ordersInternational;
import mx.com.anzen.corebanck.models.ordersPayment;

public interface ServicesAcc {
	
	public  List<accountOwn>    getAllAccounts();
    void                        updateAccount();
    public  int                 deleteAccountOwn();
    
    /********************** INSERCION *************************/
     public  List<accountOwn>           insertAccountOwn(List<accountOwn> jsn);
     public  List<accountThird>         insertAccountThird(List<accountThird> jsn);
     public  List<ordersPayment>        insertOrdersPayment(List<ordersPayment> jsn);
     public  List<accountInterbank>     insertAccountInterbank(List<accountInterbank> jsn);
     public  List<establishmentQuery>   insertEstablishmentQuery(List<establishmentQuery> jsn);
     public  List<ordersInternational>  insertOrdersInternational(List<ordersInternational> jsn);
    
    /********************** SELECCION *************************/
     public  List<accountOwn>           getAccountOwn(accountOwn jsn);
     public  List<accountThird>         getAccountThird(accountThird jsn);
     public  List<ordersPayment>        getOrdersPayment(ordersPayment jsn);
     public  List<accountInterbank>     getAccountInterbank(accountInterbank jsn);
     public  List<establishmentQuery>   getEstablishmentQuery(establishmentQuery jsn);
     public  List<ordersInternational>  getOrdersInternational(ordersInternational jsn);
     
    

}

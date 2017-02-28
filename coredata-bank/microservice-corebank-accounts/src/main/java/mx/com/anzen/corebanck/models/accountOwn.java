package mx.com.anzen.corebanck.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "ACCOUNTOWN")
public class accountOwn implements Serializable{

   
   @Column(name="CLIENT")
   private String client;                //cliente
   @Column(name="IDSESSION")
   private String idSession;             //id de session
   @Column(name="ACCOUNTTYPE")
   private String accountType;           //tipo de cuenta
   @Column(name="SUCURSAL")
   private String sucursal;				 //sucurssal
   @Id
   @Column(name="ACCOUNT")
   private String account;               //cuenta
   @Column(name="ACCOUNTNAME")
   private String accountName;           //nombre de cuenta
   @Column(name="ACCOUNTALIAS")
   private String accountAlias;          //Alias de cuenta
   @Column(name="STATUS")
   private String status;                //status
   @Column(name="CURRENCY")
   private String currency;              //moneda
   @Column(name="DATELASTPAYMENT")
   private String dateLastPayment;       //fecha de ultimo pago
   @Column(name="AMOUNTLASTPAYMENT")
   private String amountLastPayment;     //monto ultimo pago
   
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getIdSession() {
		return idSession;
	}
	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}
	/*public String getTypeLastAccount() {
		return typeLastAccount;
	}
	public void setTypeLastAccount(String typeLastAccount) {
		this.typeLastAccount = typeLastAccount;
	}
	public String getBranchLastAccount() {
		return  branchLastAccount;
	}
	public void setBranchLastAccount(String branchLastAccount) {
		this.branchLastAccount = branchLastAccount;
	}
	public String getLastAcoount() {
		return lastAcoount;
	}
	public void setLastAcoount(String lastAcoount) {
		this.lastAcoount = lastAcoount;
	}*/
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountAlias() {
		return accountAlias;
	}
	public void setAccountAlias(String accountAlias) {
		this.accountAlias = accountAlias;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDateLastPayment() {
		return dateLastPayment;
	}
	public void setDateLastPayment(String dateLastPayment) {
		this.dateLastPayment = dateLastPayment;
	}
	public String getAmountLastPayment() {
		return amountLastPayment;
	}
	public void setAmountLastPayment(String amountLastPayment) {
		this.amountLastPayment = amountLastPayment;
	}
	   
	   //private int    numberAccounts;        //numero de cuentass
	   //private int    Repetitions;           //repeticiones
   	
}
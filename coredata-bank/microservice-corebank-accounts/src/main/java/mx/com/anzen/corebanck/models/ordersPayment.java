package mx.com.anzen.corebanck.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERSPAYMENT")
public class ordersPayment implements Serializable{

	@Column(name="CLIENT")
	private String	client;
	@Column(name="IDSESSION")
	private String	idSession; 
	
	@Id
	@Column(name="ACCOUNTTYPE")
	private String	accountType;
	@Column(name="NAME")
	private String	name; 
	@Column(name="ALIAS")
	private String	alias;
	@Column(name="STATUS")
	private String	status;
	@Column(name="CURRENCY")
	private String	currency;
	@Column(name="DATELASTPAYMENT")
	private String	dateLastPayment;
	@Column(name="AMOUNTLASTPAYMENT")
	private String	amountLastPayment;
	@Column(name="TYPEOFPERSON")
	private String	typeOfPerson;
	@Column(name="PHONE")
	private String	phone;
	@Column(name="EMAIL")
	private String	email;
	@Column(name="PERIODICITY")
	private String	periodicity;
	@Column(name="MAXAMOUNT")
	private String	maxAmount;
	@Column(name="RFC")
	private String	rfc;
	
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
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
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
	public String getTypeOfPerson() {
		return typeOfPerson;
	}
	public void setTypeOfPerson(String typeOfPerson) {
		this.typeOfPerson = typeOfPerson;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}
	public String getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
}

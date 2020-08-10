package com.tcj.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value = "All details abount Transaction")
public class Transaction {
	@Id
	@ApiModelProperty(value = "transaction id")
	private String tranId;
	
	@ApiModelProperty(value = "transaction amount")
	private BigDecimal amt;
	
	@ApiModelProperty(value = "transaction time")
	private Date time;
	
	@ApiModelProperty(value = "transaction status")
	private boolean status;
	
	@ApiModelProperty(value = "transaction currency")
	private String currency;
	
	@ApiModelProperty(value = "customer cif")
	private String cif;
	
	@ApiModelProperty(value = "customer bank account number")
	private String accNo;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Transaction(String tranId) {
		super();
		this.tranId = tranId;
	}

	public Transaction(String tranId, BigDecimal amt, Date time, boolean status, String currency) {
		super();
		this.tranId = tranId;
		this.amt = amt;
		this.time = time;
		this.status = status;
		this.currency = currency;
	}



	public String getTranId() {
		return tranId;
	}



	public void setTranId(String tranId) {
		this.tranId = tranId;
	}



	public BigDecimal getAmt() {
		return amt;
	}



	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}



	public Date getTime() {
		return time;
	}



	public void setTime(Date time) {
		this.time = time;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public String getCif() {
		return cif;
	}



	public void setCif(String cif) {
		this.cif = cif;
	}



	public String getAccNo() {
		return accNo;
	}



	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}



}

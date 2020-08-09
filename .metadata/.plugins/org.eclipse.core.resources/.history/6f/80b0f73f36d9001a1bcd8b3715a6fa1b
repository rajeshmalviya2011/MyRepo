package com.tcj.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	private String tranId;
	private BigDecimal amt;
	private Timestamp time;
	private boolean status;
	private String currency;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Transaction(String tranId) {
		super();
		this.tranId = tranId;
	}

	public Transaction(String tranId, BigDecimal amt, Timestamp time, boolean status, String currency) {
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



	public Timestamp getTime() {
		return time;
	}



	public void setTime(Timestamp time) {
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



}

package com.tcj.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
@Entity
@ApiModel(value = "All details about Bank Account")
public class BankAccount {
	@Id
	@ApiModelProperty(value = "customer account number")
	private String accNo;
	
	@ApiModelProperty(value = "customer account opening date")
	private Date openingDate;
	
	@ApiModelProperty(value = "customer account balance")
	private BigDecimal balance;
	
	@ApiModelProperty(value = "customer account status")
	private boolean status;
	
	@ApiModelProperty(value = "customer cif")
	private String cif;
	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accNo) {
		super();
		this.accNo = accNo;
	}

	public BankAccount(String accNo, Date openingDate, BigDecimal balance, boolean status) {
		super();
		this.accNo = accNo;
		this.openingDate = openingDate;
		this.balance = balance;
		this.status = status;
	}


	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", openingDate=" + openingDate + ", balance=" + balance + ", status="
				+ status + ", cif=" + cif + "]";
	}
	
	

	
}

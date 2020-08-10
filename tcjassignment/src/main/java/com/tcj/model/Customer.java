package com.tcj.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value = "All details about Customer")
public class Customer {
	@Id
	@ApiModelProperty(value = "customer cif")
	private String cif;
	
	@ApiModelProperty(value = "customer name")
	private String name;
	
	@ApiModelProperty(value = "customer date of birth")
	private Date dob;
	
	@ApiModelProperty(value = "customer onboarding date")
	private Date onBoardingDate;
	
	@ApiModelProperty(value = "customer phone number")
	private String phone;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(String cif) {
		super();
		this.cif = cif;
	}

	public Customer(String cif, String name, Date dob, Date onBoardingDate, String phone) {
		super();
		this.cif = cif;
		this.name = name;
		this.dob = dob;
		this.onBoardingDate = onBoardingDate;
		this.phone = phone;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getOnBoardingDate() {
		return onBoardingDate;
	}

	public void setOnBoardingDate(Date onBoardingDate) {
		this.onBoardingDate = onBoardingDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}

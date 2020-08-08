package com.tcj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcj.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>{

	
	
}

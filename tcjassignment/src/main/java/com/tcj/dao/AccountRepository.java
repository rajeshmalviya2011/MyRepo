package com.tcj.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tcj.model.BankAccount;

public interface AccountRepository extends JpaRepository<BankAccount,String>{

	  @Query("from BankAccount where cif=?1 and openingDate=?2")	
	   List<BankAccount> findByCifOpeningDate(String cif,Date openingDate);


	  @Query("from BankAccount where openingDate=?1")	
	   List<BankAccount> findByOpeningDate(Date openingDate);

	  
}

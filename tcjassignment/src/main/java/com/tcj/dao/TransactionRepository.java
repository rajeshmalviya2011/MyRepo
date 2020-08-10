package com.tcj.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tcj.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String>{

	List<Transaction> findByCif(String cif);
	
	@Query("from Transaction where cif=?1 and time=?2")
	List<Transaction> findByCifDate(String cif,Timestamp time);
}

package com.tcj.service.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tcj.dao.AccountRepository;
import com.tcj.dao.CustomerRepository;
import com.tcj.dao.TransactionRepository;
import com.tcj.model.BankAccount;
import com.tcj.model.Customer;
import com.tcj.model.Transaction;
import com.tcj.service.MyService;

@Service
public class MyServiceImpl implements MyService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	TransactionRepository transactionRepository;
	
	public Customer registerCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}
	
	
	
	public BankAccount registerAccount(BankAccount account)
	{
		return accountRepository.save(account);
	}


	
	public List<BankAccount> queryBankAccounts(@PathVariable("cif") String cif,@PathVariable("openingDate") Date openingDate)
	{
		List<BankAccount> bankAccounts = accountRepository.findByCifOpeningDate(cif,openingDate);
		System.out.println("bankAccounts size:"+bankAccounts.size());
		return bankAccounts;
	}
	

	public List<Customer> queryCustomers(@PathVariable("openingDate") Date openingDate)
	{
		List<BankAccount> bankAccounts = accountRepository.findByOpeningDate(openingDate);
		List<Customer> customers = new ArrayList<>();
		for(BankAccount ba : bankAccounts) {
			Customer customer = customerRepository.findById(ba.getCif()).orElse(new Customer());
			customers.add(customer);
		}
		System.out.println("customers size:"+customers.size());
		return customers;
	}
	
	
	public Transaction createTx(Transaction tx)
	{
		return transactionRepository.save(tx);
	}

	
	public List<Transaction> queryTransaction(String cif){
		List<Transaction> transactions=transactionRepository.findByCif(cif);
		
		return transactions;
	}
	
	public List<Transaction> queryTransaction(String cif,Timestamp time){
		List<Transaction> transactions=transactionRepository.findByCifDate(cif,time);
		
		return transactions;
	}
}

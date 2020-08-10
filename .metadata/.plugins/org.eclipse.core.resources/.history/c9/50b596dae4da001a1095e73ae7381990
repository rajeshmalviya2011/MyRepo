package com.tcj.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcj.dao.AccountRepository;
import com.tcj.dao.CustomerRepository;
import com.tcj.dao.TransactionRepository;
import com.tcj.model.BankAccount;
import com.tcj.model.Customer;
import com.tcj.model.Transaction;

@Service
public class MyService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	TransactionRepository transactionRepository;
	
	public void registerCustomer(Customer customer)
	{
		customerRepository.save(customer);
	}
	
	
	
	public void registerAccount(BankAccount account)
	{
		accountRepository.save(account);
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
	
	
	public void createTx(Transaction tx)
	{
		transactionRepository.save(tx);
	}

	
	public List<Transaction> queryTransaction(String cif){
		List<Transaction> transactions=transactionRepository.findByCif(cif);
		
		return transactions;
	}
	
	public List<Transaction> queryTransaction(String cif,Date time){
		List<Transaction> transactions=transactionRepository.findByCifDate(cif,time);
		
		return transactions;
	}
}

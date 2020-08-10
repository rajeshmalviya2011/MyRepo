

package com.tcj.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcj.model.BankAccount;
import com.tcj.model.Customer;
import com.tcj.model.Transaction;
import com.tcj.service.MyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "MyController for customer,bankaccount and transaction")
	public class MyController {

	
		@Autowired
		MyService myService;
	
		@RequestMapping("/")
		@ApiOperation(value="to to homepage")
		public String home()
		{
			return "home.jsp";
		}
		
		@RequestMapping("/register")
		@ApiOperation(value="to to register")
		public String register()
		{
			return "registration.jsp";
		}
		
		@RequestMapping("/createTransaction")
		@ApiOperation(value="to to transaction")
		public String createTransaction()
		{
			return "transaction.jsp";
		}
		
		@RequestMapping("/registerCustomer")
		@ApiOperation(value="register customer")
		public String registerCustomer(Customer customer)
		{
			myService.registerCustomer(customer);
			return "bankaccount.jsp";
		}
		
		
		
		@RequestMapping("/registerAccount")
		@ApiOperation(value="Register a Customer with a BankAccount")	
		public String registerAccount(BankAccount account)
		{
			myService.registerAccount(account);
			return "home.jsp";
		}
		
		@RequestMapping("/queryBankAccounts/{cif}/{openingDate}")
		@ApiOperation(value="Query all BankAccounts of a Customer with a particular openingDat")
		@ResponseBody
		public List<BankAccount> queryBankAccounts(@PathVariable("cif") String cif,@PathVariable("openingDate") Date openingDate)
		{
			List<BankAccount> bankAccounts = myService.queryBankAccounts(cif, openingDate);
			System.out.println("bankAccounts size:"+bankAccounts.size());
			return bankAccounts;
		}
		

		@RequestMapping("/queryCustomers/{openingDate}")
		@ApiOperation(value = "Query all Customers opening a BankAccount on a particular openingDate")
		@ResponseBody
		public List<Customer> queryCustomers(@PathVariable("openingDate") Date openingDate)
		{
			List<Customer> customers = myService.queryCustomers(openingDate);
			System.out.println("customers size:"+customers.size());
			return customers;
		}
		
		@RequestMapping("/createTx")
		@ApiOperation(value="Create a Transaction")
		public String createTx(Transaction tx)
		{
			myService.createTx(tx);
			return "home.jsp";
		}
		
		@RequestMapping("/queryTransaction/{cif}")
		@ApiOperation(value = "Query all Transactions of a particular Custome")
		@ResponseBody
		public List<Transaction> queryTransaction(@PathVariable("cif") String cif)
		{
			List<Transaction> transactions = myService.queryTransaction(cif);
			System.out.println("transactions size:"+transactions.size());
			return transactions;
		}
		
		@RequestMapping("/queryTransaction/{cif}/{time}")
		@ApiOperation(value = "Query all Transactions of a particular Customer of a particular Date")
		@ResponseBody
		public List<Transaction> queryTransaction(@PathVariable("cif") String cif,@PathVariable("time") Date time)
		{
			List<Transaction> transactions = myService.queryTransaction(cif,time);
			System.out.println("transactions size:"+transactions.size());
			return transactions;
		}


		
	

	}


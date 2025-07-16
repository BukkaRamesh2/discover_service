package com.discover.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.discover.entity.Transaction;
import com.discover.service.Transactionservice;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/transaction")   //transaction in the url path it comes to the class controller
public class TransactionController
{
	
	@Autowired
	Transactionservice transactionservice; //object
	
	
	@PostMapping("/addTransaction")
	public Transaction addTransaction(@RequestBody Transaction transaction)
	{
	  return transactionservice.addTransaction(transaction);
	}
	
	@GetMapping("/gettransaction/{transactionId}")	
	public Transaction gettransaction(@PathParam("transactionId") Long transactionID)
	{
		return transactionservice.gettransaction(transactionID);
	}
	
	@GetMapping("/getAllTransaction")
	public List<Transaction> getAllTransaction()
	{
		return transactionservice.getAllTransaction();
	}
	
	@PutMapping("/updateTransaction")
	public Transaction updateTransaction(@RequestBody Transaction transaction)
	{
		return transactionservice.updateTransaction(transaction);
	}
	
	@DeleteMapping("/deleteCustomer/{transactionID}")
	public void deleteCustomer (@PathParam("transactionID") Long transactionID) {
}
}


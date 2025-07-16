package com.discover.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.discover.entity.Transaction;

import jakarta.websocket.server.PathParam;

public interface Transactionservice {
	public Transaction addTransaction(Transaction transaction);
	
	public Transaction gettransaction(Long transactionID);
	
	public List<Transaction> getAllTransaction();
	
	public Transaction updateTransaction(Transaction transaction);
}
	



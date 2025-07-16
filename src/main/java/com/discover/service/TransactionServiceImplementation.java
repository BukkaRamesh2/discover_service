package com.discover.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.	Transaction;
import com.discover.repository.TransactionRepository;

@Service
public class TransactionServiceImplementation implements Transactionservice
{
	
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepository.save(transaction);
	}

	@Override
	public Transaction gettransaction(Long transactionId) {
		// TODO Auto-generated method stub
		return 	transactionRepository.getById(transactionId);
	}

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return transactionRepository.findAll();
	}

	@Override
	public Transaction updateTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepository.save(transaction);
	}
	
}

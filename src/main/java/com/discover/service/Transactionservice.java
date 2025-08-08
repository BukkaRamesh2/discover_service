package com.discover.service;

import java.util.List;
import com.discover.entity.Transaction;

public interface Transactionservice {
    public Transaction addTransaction(Transaction transaction);

    public Transaction getTransactionById(Long transactionID);  

    public List<Transaction> getAllTransaction();

    public void deleteTransaction(Long transactionID);

    public Transaction updateTransaction(Transaction transaction);
}

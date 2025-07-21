package com.discover.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.discover.entity.Customer;
import com.discover.entity.Transaction;
import com.discover.exception.TransactionNotFoundException;
import com.discover.repository.TransactionRepository;

import jakarta.transaction.Transactional;

@Service
public class TransactionServiceImplementation implements Transactionservice {

    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    @Override
    public Transaction addTransaction(Transaction transaction) {
        if (transaction.getTransactionId() != null || transaction.getVersion() != null) {
            throw new IllegalArgumentException("No ID/version allowed when creating");
        }
        return transactionRepository.save(transaction);
    }

    @Transactional
    @Override
    public Transaction updateTransaction(Transaction transaction) {
        if (transaction.getTransactionId() == null || transaction.getVersion() == null) {
            throw new IllegalArgumentException("ID and version required for update");
        }

        Transaction existing = transactionRepository.findById(transaction.getTransactionId())
            .orElseThrow(() -> new TransactionNotFoundException("Transaction ID " + transaction.getTransactionId() + " not found"));

        if (!existing.getVersion().equals(transaction.getVersion())) {
            throw new ObjectOptimisticLockingFailureException(Transaction.class, transaction.getTransactionId());
        }

        BeanUtils.copyProperties(transaction, existing, "transactionId", "version");
        return transactionRepository.save(existing);
    }

    @Override
    public Transaction getTransactionById(Long transactionID) {
        return transactionRepository.findById(transactionID)
            .orElseThrow(() -> new TransactionNotFoundException("Transaction ID " + transactionID + " not found"));
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }

    @Transactional
    @Override
    public void deleteTransaction(Long transactionID) {
        if (!transactionRepository.existsById(transactionID)) {
            throw new TransactionNotFoundException("Transaction ID " + transactionID + " not found");
        }
        transactionRepository.deleteById(transactionID);
    }
}

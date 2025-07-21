package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/transaction")
@Tag(name = "Transaction API", description = "Operations related to transactions")
public class TransactionController {

    @Autowired
    private Transactionservice transactionservice;

    @PostMapping("/addTransaction")
    @Operation(summary = "Create a new transaction")
    public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
        Transaction saved = transactionservice.addTransaction(transaction);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/gettransaction/{transactionId}")
    @Operation(summary = "Get transaction by ID")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable("transactionId") Long transactionID) {
        Transaction transaction = transactionservice.getTransactionById(transactionID);
        return ResponseEntity.ok(transaction);
    }

    @GetMapping("/getAllTransaction")
    @Operation(summary = "Get all transactions")
    public List<Transaction> getAllTransaction() {
        return transactionservice.getAllTransaction();
    }

    @PutMapping("/updateTransaction")
    @Operation(summary = "Update transaction")
    public ResponseEntity<Transaction> updateTransaction(@RequestBody Transaction transaction) {
        Transaction updated = transactionservice.updateTransaction(transaction);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/deleteTransaction/{transactionID}")
    @Operation(summary = "Delete transaction by ID")
    public ResponseEntity<Void> deleteTransaction(@PathVariable("transactionID") Long transactionID) {
        transactionservice.deleteTransaction(transactionID);
        return ResponseEntity.noContent().build();
    }
}

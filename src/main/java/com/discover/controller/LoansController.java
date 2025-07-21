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

import com.discover.entity.Loans;
import com.discover.service.LoansService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/loans")
@Tag(name = "Loans API", description = "Operations realted to loans")
public class LoansController {
	
	 @Autowired
	    private LoansService loanService;

	    @PostMapping("/addLoan")
	    @Operation(summary = "create loan")
	    public ResponseEntity<Loans> addLoan(@RequestBody Loans loan) {
	        Loans saved = loanService.addLoan(loan);
	        return new ResponseEntity<>(saved, HttpStatus.CREATED);
	    }

	    @GetMapping("/getLoan/{loanId}")
	    @Operation(summary = "Get loan by ID")
	    public ResponseEntity<Loans> getLoan(@PathParam("loanId") Long loanId) {
	        Loans loan = loanService.getLoanById(loanId);
	        return ResponseEntity.ok(loan);
	    }

	    @GetMapping("/getAllLoans")
	    @Operation(summary = "Get all loans")
	    public List<Loans> getAllLoans() {
	        return loanService.getAllLoans();
	    }

	    @PutMapping("/updateLoan")
	    @Operation(summary = "Update loan")
	    public ResponseEntity<Loans> updateLoan(@RequestBody Loans loan) {
	        Loans updated = loanService.updateLoan(loan);
	        return ResponseEntity.ok(updated);
	    }

	    @DeleteMapping("/deleteLoan/{loanId}")
	    @Operation(summary = "Delete loan by ID")
	    public ResponseEntity<Void> deleteLoan(@PathParam("loanId") Long loanId) {
	        loanService.deleteLoan(loanId);
	        return ResponseEntity.noContent().build();
	    }
	

}

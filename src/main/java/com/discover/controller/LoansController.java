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

import com.discover.entity.Loans;
import com.discover.service.LoansService;

@RestController
@RequestMapping("/loans")
public class LoansController {
	
	 @Autowired
	    private LoansService loanService;

	    @PostMapping("/addLoan")
	    public Loans addLoan(@RequestBody Loans loan) {
	        return loanService.addLoan(loan);
	    }

	    @GetMapping("/getLoan/{loanId}")
	    public Loans getLoan(@PathVariable("loanId") int loanId) {
	        return loanService.getLoanById(loanId);
	    }

	    @GetMapping("/getAllLoans")
	    public List<Loans> getAllLoans() {
	        return loanService.getAllLoans();
	    }

	    @PutMapping("/updateLoan")
	    public Loans updateLoan(@RequestBody Loans loan) {
	        return loanService.updateLoan(loan);
	    }

	    @DeleteMapping("/deleteLoan/{loanId}")
	    public void deleteLoan(@PathVariable("loanId") int loanId) {
	        loanService.deleteLoan(loanId);
	    }
	

}

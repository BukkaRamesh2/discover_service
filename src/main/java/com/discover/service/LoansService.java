package com.discover.service;

import com.discover.entity.Loans;
import java.util.List;


public interface LoansService {

	public Loans addLoan(Loans loan);

	public Loans getLoanById(Long loanId); 

	public List<Loans> getAllLoans();

	public Loans updateLoan(Loans loan);

	public void deleteLoan(Long loanId);

}

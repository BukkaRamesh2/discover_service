package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Loans;
import com.discover.repository.LoansRepository;

@Service
public class LoansServiceImpl implements LoansService{
	
	@Autowired
	private LoansRepository loansRepo;

	@Override
	public Loans addLoan(Loans loan) {
		// TODO Auto-generated method stub
		return loansRepo.save(loan);
	}

	@Override
	public Loans getLoanById(long loanId) {
		// TODO Auto-generated method stub
		return loansRepo.getById(loanId);
	}

	@Override
	public List<Loans> getAllLoans() {
		// TODO Auto-generated method stub
		return loansRepo.findAll();
	}

	@Override
	public Loans updateLoan(Loans loan) {
		// TODO Auto-generated method stub
		return loansRepo.save(loan);
	}

	@Override
	public void deleteLoan(int loanId) {
		// TODO Auto-generated method stub
		
	}
	
	
}
package com.discover.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.discover.entity.Loans;
import com.discover.exception.LoanNotFoundException;
import com.discover.repository.LoansRepository;

import jakarta.transaction.Transactional;

@Service
public class LoansServiceImpl implements LoansService {

    @Autowired
    private LoansRepository loansRepo;

    @Transactional
    @Override
    public Loans addLoan(Loans loan) {
        if (loan.getLoanId() != null || loan.getVersion() != null) {
            throw new IllegalArgumentException("No ID or version allowed when creating");
        }
        return loansRepo.save(loan);
    }


    @Transactional
    @Override
    public Loans updateLoan(Loans loan) {
        if (loan.getLoanId() == 0 || loan.getVersion() == null) {
            throw new IllegalArgumentException("Loan ID and version required for update");
        }

        Loans existing = loansRepo.findById(loan.getLoanId())
            .orElseThrow(() -> new LoanNotFoundException("Loan ID " + loan.getLoanId() + " not found"));

        if (!existing.getVersion().equals(loan.getVersion())) {
            throw new ObjectOptimisticLockingFailureException(Loans.class, loan.getLoanId());
        }

        BeanUtils.copyProperties(loan, existing, "loanId", "version");
        return loansRepo.save(existing);
    }

    @Override
    public Loans getLoanById(Long loanId) {
        return loansRepo.findById(loanId)
            .orElseThrow(() -> new LoanNotFoundException("Loan ID " + loanId + " not found"));
    }

    @Override
    public List<Loans> getAllLoans() {
        return loansRepo.findAll();
    }

    @Override
    public void deleteLoan(Long loanId) {
        if (!loansRepo.existsById(loanId)) {
            throw new LoanNotFoundException("Loan ID " + loanId + " not found");
        }
        loansRepo.deleteById(loanId);
    }
}

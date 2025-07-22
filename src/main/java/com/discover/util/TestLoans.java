package com.discover.util;

import com.discover.entity.Loans;
import java.util.Date;
import java.util.*;

public class TestLoans {
	
    public static void main(String[] args) {
    	Loans myLoan = new Loans(2001, "Home", 710, 500000, 6.5, "Pending", new Date());

        LoanProcessor processor = new LoanProcessor(myLoan);

        processor.displayLoanInfo();

        System.out.println();
        System.out.println("Checking Eligibility:");
        processor.checkEligibility();

        System.out.println();
        System.out.println("Approving Loan:");
        processor.approveLoan();

        System.out.println();
        System.out.println("Updated Loan Info:");
        processor.displayLoanInfo();

        System.out.println();
        System.out.println("Interest Calculation:");
        processor.calculateInterest();

        System.out.println();
        System.out.println("Compound Interest Breakdown:");
        processor.calculateCompoundInterest(5);

        System.out.println();
        System.out.println("Loan Type Details:");
        processor.loanTypeDetails();

        System.out.println();
        processor.displayLoanInfo();
        
        Loans loan1 = new Loans(1001, "Home", 710, 500000, 6.5, "Pending", new Date());
        Loans loan2 = new Loans(1002, "Education", 680, 200000, 5.0, "Pending", new Date());
        Loans loan3 = new Loans(1003, "Personal", 580, 100000, 8.5, "Approved", new Date());

        List<Loans> loanList = new ArrayList<>();
        loanList.add(loan1);
        loanList.add(loan2);
        loanList.add(loan3);

        System.out.println("Loans from ArrayList:");
        for (Loans loan : loanList) {
            System.out.println("Loan ID: " + loan.getLoanId() + ", Type: " + loan.getLoanType());
        }

        System.out.println("\nUnique Loan IDs using HashSet:");
        Set<Long> loanIdSet = new HashSet<>();
        for (Loans loan : loanList) {
            loanIdSet.add(loan.getLoanId());
        }
        for (long id : loanIdSet) {
            System.out.println("Loan ID: " + id);
        }

        System.out.println("\nLoan Details using LinkedHashMap:");
        Map<Long, Loans> loanMap = new LinkedHashMap<>();
        for (Loans loan : loanList) {
            loanMap.put(loan.getLoanId(), loan); 
        }

        for (Map.Entry<Long, Loans> entry : loanMap.entrySet()) {
            Loans l = entry.getValue();
            System.out.println("Loan ID: " + l.getLoanId() + ", Type: " + l.getLoanType() + ", Status: " + l.getStatus());
        }

        }
    }

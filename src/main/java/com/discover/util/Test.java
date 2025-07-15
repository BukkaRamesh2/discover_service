package com.discover.util;

import com.discover.entity.Loans;
import java.util.Date;

public class Test {
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
    }
}

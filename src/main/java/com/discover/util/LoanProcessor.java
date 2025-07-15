package com.discover.util;

import com.discover.entity.Loans;

public class LoanProcessor extends LoanActions {

    public LoanProcessor(Loans loan) {
        super(loan);
    }

    @Override
    public void checkEligibility() {
        int score = loan.getCreditScore();
        if (score >= 750) {
            System.out.println("Eligible for loan: Excellent Credit");
        } else if (score >= 600) {
            System.out.println("Eligible with conditions: Moderate Credit");
        } else {
            System.out.println("Not eligible for loan: Poor Credit");
        }
    }

    @Override
    public void approveLoan() {
        if (loan.getCreditScore() >= 750) {
            loan.setStatus("Approved");
            System.out.println("Loan Approved");
        } else if (loan.getCreditScore() >= 600) {
            loan.setStatus("Pending Review");
            System.out.println("Loan needs manual review");
        } else {
            loan.setStatus("Rejected");
            System.out.println("Loan Rejected");
        }
    }

    public void displayLoanInfo() {
        System.out.println("Loan Details");
        System.out.println("Loan ID      : " + loan.getLoanId());
        System.out.println("Loan Type    : " + loan.getLoanType());
        System.out.println("Loan Amount  : ₹" + loan.getLoanAmount());
        System.out.println("Credit Score : " + loan.getCreditScore());
        System.out.println("APR          : " + loan.getApr() + "%");
        System.out.println("Status       : " + loan.getStatus());
    }

    public void calculateCompoundInterest(int years) {
        double principal = loan.getLoanAmount();
        double rate = loan.getApr() / 100;
        double amount = principal;

        System.out.println("Compound Interest for " + years + " years:");
        for (int i = 1; i <= years; i++) {
            amount = amount * (1 + rate);
            System.out.printf("Year %d: ₹%.2f\n", i, amount);
        }
        double totalInterest = amount - principal;
        System.out.printf("Total Compound Interest after %d years: ₹%.2f\n", years, totalInterest);
    }
}

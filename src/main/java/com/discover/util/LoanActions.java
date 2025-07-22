package com.discover.util;

import com.discover.entity.Loans;

public abstract class LoanActions {
    protected Loans loan;

    public LoanActions(Loans loan) {
        this.loan = loan;
    }

    public abstract void checkEligibility();
    public abstract void approveLoan();

    public void calculateInterest() {
        double interest = (loan.getLoanAmount() * loan.getApr()) / 100;
        System.out.println("Simple Interest: ₹" + interest);
    }

    public void loanTypeDetails() {
        switch (loan.getLoanType().toLowerCase()) {
            case "home":
                System.out.println("Loan Type: Home Loan - Tenure: 20 years");
                break;
            case "education":
                System.out.println("Loan Type: Education Loan - Tenure: 5 years");
                break;
            case "personal":
                System.out.println("Loan Type: Personal Loan - Tenure: 3 years");
                break;
            default:
                System.out.println("Unknown Loan Type - Tenure to be decided");
        }
    }
}

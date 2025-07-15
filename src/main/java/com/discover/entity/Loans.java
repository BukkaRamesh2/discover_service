package com.discover.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loans {

	@Id
    private long loanId;
    private String loanType;
    private int creditScore;
    private double loanAmount;
    private double apr;
    private String status;
    private Date loanDate;

    public Loans(int loanId, String loanType, int creditScore, double loanAmount, double apr, String status, Date loanDate) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.apr = apr;
        this.status = status;
        this.loanDate = loanDate;
    }

    public long getLoanId() {
        return loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getApr() {
        return apr;
    }

    public String getStatus() {
        return status;
    }

    public Date getLoanDate() {
        return loanDate;
    }


    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

}

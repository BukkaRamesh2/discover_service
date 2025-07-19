package com.discover.util;

import java.time.LocalDate;

public class FeeTest {

    // Encapsulation
    private String feeId;
    private String feeName;
    private long amount;
    private LocalDate deadline;
    private boolean Active;
    private String description;
    private double balance;
    private int daysOverdrawn;

    public FeeTest() {
    }

    public FeeTest(String feeId, String feeName, long amount, LocalDate deadline,
               boolean Active, String description, double balance, int daysOverdrawn) {
        this.feeId = feeId;
        this.feeName = feeName;
        this.amount = amount;
        this.deadline = deadline;
        this.Active = Active;
        this.description = description;
        this.balance = balance;
        this.daysOverdrawn = daysOverdrawn;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean getActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDaysOverdrawn() {
        return daysOverdrawn;
    }

    public void setDaysOverdrawn(int daysOverdrawn) {
        this.daysOverdrawn = daysOverdrawn;
    }
}
/*check git connection in new PC*/
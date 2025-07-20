package com.discover.entity;

import java.time.LocalDate;

public class Account {

    private Long accountId;
    private String accountNumber;
    private String accountType;
    private double balance;   // primitive double, no null
    private LocalDate createdDate;
    private String status;

    // Getters and setters (only for balance here for brevity)
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // You can add other getters/setters similarly or generate them using IDE
}

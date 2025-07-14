package com.discover.util;

import java.util.Date;

public class AccTest {

    // Encapsulation: Account class with private fields and public getters/setters
    static class Account {
        private int accountId;
        private String accountNumber;
        private String accountType;
        private double balance;
        private Date createdDate;
        private String status;

        // Getters and Setters
        public int getAccountId() { return accountId; }
        public void setAccountId(int accountId) { this.accountId = accountId; }

        public String getAccountNumber() { return accountNumber; }
        public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

        public String getAccountType() { return accountType; }
        public void setAccountType(String accountType) { this.accountType = accountType; }

        public double getBalance() { return balance; }
        public void setBalance(double balance) { this.balance = balance; }

        public Date getCreatedDate() { return createdDate; }
        public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public void displayDetails() {
            System.out.println("Account ID: " + accountId);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Type: " + accountType);
            System.out.println("Balance: $" + balance);
            System.out.println("Status: " + status);
            System.out.println("Created: " + createdDate);
            
        }
    }

    // Abstraction: Abstract class with abstract method
    abstract static class AccountValidator {
        public abstract void validate(Account acc);
    }

    // Inheritance: Child classes override validate()
    static class SavingsAccountValidator extends AccountValidator {
        public void validate(Account acc) {
            if (acc.getBalance() < 1000) {
                System.out.println("Low balance for savings account: " + acc.getAccountNumber());
            } else {
                System.out.println("Savings account valid: " + acc.getAccountNumber());
            }
        }
    }

    static class CurrentAccountValidator extends AccountValidator {
        public void validate(Account acc) {
            if (!"Active".equals(acc.getStatus())) {
                System.out.println("Inactive current account: " + acc.getAccountNumber());
            } else {
                System.out.println("Current account valid: " + acc.getAccountNumber());
            }
        }
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[4];
        int i = 0;

        // do-while loop: create 3 accounts
        do {
            accounts[i] = new Account();
            accounts[i].setAccountId(i + 1);
            accounts[i].setAccountNumber("ACC00" + (i + 1));
            accounts[i].setAccountType((i % 2 == 0) ? "Savings" : "Current");
            accounts[i].setBalance(500 + (i * 800));
            accounts[i].setStatus((i % 2 == 0) ? "Active" : "Inactive");
            accounts[i].setCreatedDate(new Date());
            i++;
        } while (i < 3);

        // while loop: validate accounts using polymorphism
        int j = 0;
        while (j < 3) {
            Account acc = accounts[j];
            AccountValidator validator;

            // Polymorphism + if-else
            if ("Savings".equals(acc.getAccountType())) {
                validator = new SavingsAccountValidator();
            } else {
                validator = new CurrentAccountValidator();
            }

            validator.validate(acc);
            j++;
        }

        // for loop + switch-case
        for (int k = 0; k < 4; k++) {
            if (accounts[k] != null) {
                accounts[k].displayDetails();
                switch (accounts[k].getStatus()) {
                    case "Active":
                        System.out.println("Status check: Active");
                        break;
                    case "Inactive":
                        System.out.println("Status check: Inactive");
                        break;
                    default:
                        System.out.println("Status unknown");
                }
            } else {
                System.out.println("Account at index " + k + " is null.");
            }
        }
    }
}

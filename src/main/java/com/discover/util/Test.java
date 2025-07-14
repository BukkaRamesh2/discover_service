package com.discover.util;

public class Test {

    // Account class
    static class Account {
        int accountId;
        String accountNumber;
        String accountType;
        double balance;
        String status;

        void displayDetails() {
            System.out.println("Account ID: " + accountId);
            System.out.println("Number: " + accountNumber);
            System.out.println("Type: " + accountType);
            System.out.println("Balance: $" + balance);
            System.out.println("Status: " + status);
            
        }
    }

    // Inheritance and method overriding
    static class SavingsAccount extends Account {
        void validateBalance() {
            if (balance < 1000) {
                System.out.println(accountNumber + " - Balance is below minimum");
            } else {
                System.out.println(accountNumber + " - Balance is sufficient");
            }
        }
    }

    public static void main(String[] args) {
        // Create two accounts
        SavingsAccount acc1 = new SavingsAccount();
        acc1.accountId = 1;
        acc1.accountNumber = "ACC101";
        acc1.accountType = "Savings";
        acc1.balance = 800.0;
        acc1.status = "Active";

        SavingsAccount acc2 = new SavingsAccount();
        acc2.accountId = 2;
        acc2.accountNumber = "ACC102";
        acc2.accountType = "Savings";
        acc2.balance = 1500.0;
        acc2.status = "Inactive";

        // Array of accounts
        SavingsAccount[] accounts = { acc1, acc2 };

        // Loop to display details and check status
        for (SavingsAccount acc : accounts) {
            acc.displayDetails();
            acc.validateBalance();
            
            if (acc.status.equals("Active")) {
                System.out.println("This account is currently active.\n");
            } else {
                System.out.println("This account is currently inactive.\n");
            }
        }
    }
}

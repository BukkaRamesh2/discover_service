package com.discover.entity;

public class MLthreads {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000.0);  // initialize balance

        Runnable depositTask = () -> {
            for (int i = 0; i < 3; i++) {
                synchronized (account) {
                    double newBalance = account.getBalance() + 150;
                    account.setBalance(newBalance);
                    System.out.println(Thread.currentThread().getName() + " deposited $150. Balance: " + newBalance);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 3; i++) {
                synchronized (account) {
                    double currentBalance = account.getBalance();
                    if (currentBalance >= 100) {
                        double newBalance = currentBalance - 100;
                        account.setBalance(newBalance);
                        System.out.println(Thread.currentThread().getName() + " withdrew $100. Balance: " + newBalance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " failed to withdraw $100 (insufficient balance)");
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t1 = new Thread(depositTask, "Deposit-Thread");
        Thread t2 = new Thread(withdrawTask, "Withdraw-Thread");

        t1.start();
        t2.start();
    }
}

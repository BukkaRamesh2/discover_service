package com.discover.util;

import com.discover.entity.Loans;

public class LoanThreadsImpl {

    public static void main(String[] args) {

        Loans loan1 = new Loans(1001L, "Home", 710, 500000, 6.5, "Pending", new java.util.Date());
        Loans loan2 = new Loans(1002L, "Education", 680, 200000, 5.0, "Pending", new java.util.Date());

        Runnable task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " processing loan: " + loan1.getLoanType());
        };

        Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " processing loan: " + loan2.getLoanType());
        };

        Thread t1 = new Thread(task1, "Thread-Loan1");
        Thread t2 = new Thread(task2, "Thread-Loan2");

        t1.start();
        t2.start();
    }
}


package com.discover.util;

import java.sql.Date;

public class DeadLockSolution {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    private CreditCard card1;
    private CreditCard card2;

    public DeadLockSolution(CreditCard card1, CreditCard card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public void thread1Task() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " locked card1");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " locked card2");
                card1.activateCard();
                card2.activateCard();
            }
        }
    }
	// Acquired the locks in the same order same like thread1Task method
    public void thread2Task() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " locked card2");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " locked card1");
                card2.deactivateCard();
                card1.deactivateCard();
            }
            
        }
    }
    
    public static void main(String[] args) {
 
        CreditCard card1 = new CreditCard(86876, "1234-5678-9012-3456", 5000.0, Date.valueOf("2020-01-20"), Date.valueOf("2028-01-19"));
        CreditCard card2 = new CreditCard(34534, "9876-5432-1098-7654", 10000.0,Date.valueOf("2020-01-20"), Date.valueOf("2028-01-19"));
        DeadLockSolution simulator = new DeadLockSolution(card1, card2);
        Thread t1 = new Thread(() -> simulator.thread1Task(), "Thread-1");
        Thread t2 = new Thread(() -> simulator.thread2Task(), "Thread-2");

        t1.start();
        t2.start();
    }
    
}

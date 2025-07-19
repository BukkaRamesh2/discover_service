
package com.discover.util;

import java.sql.Date;

public class ThreadsImplementation {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    private CreditCard card1;
    private CreditCard card2;

    public ThreadsImplementation(CreditCard card1, CreditCard card2) {
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
    

    public void thread2Task() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " locked card2");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}

            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " locked card1");
                card2.deactivateCard();
                card1.deactivateCard();
            }
            
        }
    }
    //Here Thread 1 locks card1 then waits on card2
    //Thread 2 locks card2 then waits for card1
    
    public static void main(String[] args) {
 
        CreditCard card1 = new CreditCard(86876, "1234-5678-9012-3456", 5000.0, Date.valueOf("2020-01-20"), Date.valueOf("2028-01-19"));
        CreditCard card2 = new CreditCard(34534, "9876-5432-1098-7654", 10000.0,Date.valueOf("2020-01-20"), Date.valueOf("2028-01-19"));
        ThreadsImplementation simulator = new ThreadsImplementation(card1, card2);
        Thread t1 = new Thread(() -> simulator.thread1Task(), "Thread-1");
        Thread t2 = new Thread(() -> simulator.thread2Task(), "Thread-2");

        t1.start();
        t2.start();
    }
    
}

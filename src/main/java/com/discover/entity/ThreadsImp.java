package com.discover.entity;
import com.discover.entity.Transaction;
public class ThreadsImp 
{

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    private Transaction transaction1;
    private Transaction transaction2;

    public ThreadsImp(Transaction t1, Transaction t2) {
        this.transaction1 = t1;
        this.transaction2 = t2;
    }

    public void thread1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + "thread1 locked with transaction");
            try { 
            	Thread.sleep(100); 
            	} 
            catch (InterruptedException ignored) {}

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " thread2 locked with transaction");

                transaction1.setAmount(420f);
                transaction2.setAmount(300f);

                System.out.println("Transaction1 updated" + transaction1.getAmount());
                System.out.println("Transaction2 updated" + transaction2.getAmount());
            }
        }
    }

    public void thread2() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + "thread2 locked with transaction");
            try { 
            	Thread.sleep(100); 
            	} 
            catch (InterruptedException ignored) {}

            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "thread1 locked with transaction");

                transaction2.setAmount(400f);
                transaction1.setAmount(500f);

                System.out.println("Transaction1 updated" + transaction2.getAmount());
                System.out.println("Transaction1 updated" + transaction1.getAmount());
            }
        }
    }

    public static void main(String[] args) { 
       Transaction t1 = new Transaction(120L, 100.0f);
        Transaction t2 = new Transaction(220L, 150.0f);

        ThreadsImp threads = new ThreadsImp (t1, t2);

        Thread threads1 = new Thread(() -> threads.thread1());
        Thread threads2 = new Thread(() -> threads.thread2());

        // Start threads
        threads1.start();
        threads2.start();
    }
}


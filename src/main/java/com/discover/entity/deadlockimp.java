package com.discover.entity;

public class deadlockimp {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    private Transaction transaction1;
    private Transaction transaction2;

    public deadlockimp(Transaction t1, Transaction t2) {
        this.transaction1 = t1;
        this.transaction2 = t2;
    }

    public void thread1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " locked lock1");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " locked lock2");

                transaction1.setAmount(200f);
                transaction2.setAmount(300f);

                System.out.println("Transaction1 updated to " + transaction1.getAmount());
                System.out.println("Transaction2 updated to " + transaction2.getAmount());
            }
        }
    }

    public void thread2() {
        synchronized (lock1) {  
            System.out.println(Thread.currentThread().getName() + " locked lock1");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " locked lock2");

                transaction1.setAmount(500f);
                transaction2.setAmount(600f);

                System.out.println("Transaction1 updated to " + transaction1.getAmount());
                System.out.println("Transaction2 updated to " + transaction2.getAmount());
            }
        }
    }
}

   /* public static void main(String[] args) {
        Transaction t1 = new Transaction(1L, 100f);
        Transaction t2 = new Transaction(2L, 150f);

        deadlockimp d1 = new deadlockimp(t1, t2);

        Thread thread1 = new Thread(d1::thread1);
        Thread thread2 = new Thread(d1::thread2);

        thread1.start();
        thread2.start();
    }
}*/

package com.discover.util;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LoanDeadlockSolution {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void simulateDeadlockAvoidance() {

        Thread t1 = new Thread(() -> {
            while (true) {
                if (lock1.tryLock()) {
                    try {
                        Thread.sleep(100);
                        if (lock2.tryLock()) {
                            try {
                                System.out.println("Thread-1 approved Home and Car loan");
                                break;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock1.unlock();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (lock2.tryLock()) {
                    try {
                        Thread.sleep(100);
                        if (lock1.tryLock()) {
                            try {
                                System.out.println("Thread-2 approved Education and Personal loan");
                                break;
                            } finally {
                                lock1.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock2.unlock();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        LoanDeadlockSolution solution = new LoanDeadlockSolution();
        solution.simulateDeadlockAvoidance();
    }
}

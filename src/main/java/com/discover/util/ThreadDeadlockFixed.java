package com.discover.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class ThreadDeadlockFixed {

    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Runnable task1 = () -> {
            try {
                if (lock1.tryLock(1, TimeUnit.SECONDS)) {
                    System.out.println("Thread 1: Locked lock1");
                    Thread.sleep(100);

                    if (lock2.tryLock(1, TimeUnit.SECONDS)) {
                        System.out.println("Thread 1: Locked lock2");
                        // critical section
                        lock2.unlock();
                    } else {
                        System.out.println("Thread 1: Could not acquire lock2");
                    }

                    lock1.unlock();
                } else {
                    System.out.println("Thread 1: Could not acquire lock1");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable task2 = () -> {
            try {
                if (lock2.tryLock(1, TimeUnit.SECONDS)) {
                    System.out.println("Thread 2: Locked lock2");
                    Thread.sleep(100);

                    if (lock1.tryLock(1, TimeUnit.SECONDS)) {
                        System.out.println("Thread 2: Locked lock1");
                        // critical section
                        lock1.unlock();
                    } else {
                        System.out.println("Thread 2: Could not acquire lock1");
                    }

                    lock2.unlock();
                } else {
                    System.out.println("Thread 2: Could not acquire lock2");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
        
    }
}

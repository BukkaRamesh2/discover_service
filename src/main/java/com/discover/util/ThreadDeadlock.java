package com.discover.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDeadlock {

    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            lock1.lock();
            System.out.println("Thread 1: Locked lock1");

            try { Thread.sleep(100); } catch (Exception e) {}

            lock2.lock();
            System.out.println("Thread 1: Locked lock2");

            // critical section
            lock2.unlock();
            lock1.unlock();
        });

        Thread t2 = new Thread(() -> {
            lock2.lock();
            System.out.println("Thread 2: Locked lock2");

            try { Thread.sleep(100); } catch (Exception e) {}

            lock1.lock();
            System.out.println("Thread 2: Locked lock1");

            // critical section
            lock1.unlock();
            lock2.unlock();
        });

        t1.start();
        t2.start();
    }
}

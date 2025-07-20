package com.discover.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CreateDeadlock {

    public static final Lock lockA = new ReentrantLock();
    public static final Lock lockB = new ReentrantLock();

    public static void main(String[] args) {
        /* Thread 1 will try to lock lockA then lockB*/
        Thread thread1 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();

            /*Got lock on lockA*/
            lockA.lock();
            try {
                System.out.println(threadName + ": Locked lock A");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(threadName + ": Trying to lock lock B...");
                lockB.lock();
                try {
                    System.out.println(threadName + ": Locked lock B");
                } finally {
                    lockB.unlock();
                }
            } finally {
                
                System.out.println(threadName + ": Unlocking lock A");
                lockA.unlock();
            }
        }, "Thread 1"); 

        /*Thread 2 will try to lock lockB then lockA*/
        Thread thread2 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();

            /*got lock on lockB*/
            lockB.lock();
            try {
                System.out.println(threadName + ": Locked lock B");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(threadName + ": Trying to lock lock A...");
                lockA.lock();
                try {
                    System.out.println(threadName + ": Locked lock A");
                } finally {
                    /*This unlock is inside the  try and won't happen*/
                    lockA.unlock();
                }
            } finally {
                System.out.println(threadName + ": Unlocking lock B");
                lockB.unlock();
            }
        }, "Thread 2"); 

        // Start both threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread finished starting threads.");
    }
}
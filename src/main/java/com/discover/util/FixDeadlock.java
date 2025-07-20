package com.discover.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FixDeadlock {

    public static final Lock lockA = new ReentrantLock();
    public static final Lock lockB = new ReentrantLock();

    public static void main(String[] args) {
        /*Thread 1 will try to lock lockA then lockB*/
        Thread thread1 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + ": Attempting to lock lockA...");
            lockA.lock();
            try {
                System.out.println(threadName + ": Locked lockA");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(threadName + ": Attempting to lock lockB...");
                lockB.lock();
                try {
                    System.out.println(threadName + ": Locked lockB");
                } finally {
                    System.out.println(threadName + ": Unlocking lockB");
                    lockB.unlock();
                }
            } finally {
                System.out.println(threadName + ": Unlocking lockA");
                lockA.unlock();
            }
        }, "Thread 1");

        /*Thread 2 will also try to lock lockA then lockB*/
        Thread thread2 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + ": Attempting to lock lockA...");
            lockA.lock();
            try {
                System.out.println(threadName + ": Locked lockA");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(threadName + ": Attempting to lock lockB...");
                lockB.lock();
                try {
                    System.out.println(threadName + ": Locked lockB");
                } finally {
                    System.out.println(threadName + ": Unlocking lockB");
                    lockB.unlock();
                }
            } finally {
                System.out.println(threadName + ": Unlocking lockA");
                lockA.unlock();
            }
        }, "Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread finished starting threads.");
    }
}


/* in dealock situation each threads are focusing on 2 different locks and when they are try to lock another lock 
 * they are reaching dealock. to fix this we are making both threads focus on one lock first then reach another lock to avaoid deadlock
 * 
*/
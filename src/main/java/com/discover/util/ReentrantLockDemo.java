package com.discover.util;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class ReentrantLockDemo {

    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> runTask("Thread-1", lock1, lock2));
        Thread thread2 = new Thread(() -> runTask("Thread-2", lock2, lock1));

        thread1.start();
        thread2.start();
    }

    public static void runTask(String name, ReentrantLock firstLock, ReentrantLock secondLock) {
        while (true) {
            try {
                // Try to acquire first lock
                if (firstLock.tryLock(100, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println(name + " acquired " + firstLock);

                        // Try to acquire second lock
                        if (secondLock.tryLock(100, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println(name + " acquired both locks and is working...");
                                break; // Both locks acquired — done
                            } finally {
                                secondLock.unlock();
                                System.out.println(name + " released " + secondLock);
                            }
                        }
                    } finally {
                        firstLock.unlock();
                        System.out.println(name + " released " + firstLock);
                    }
                }

                // Wait before retrying to avoid busy loop
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " completed task without deadlock.");
    }
}

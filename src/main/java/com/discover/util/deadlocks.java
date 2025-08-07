package com.discover.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {

    private static final Lock firstLock = new ReentrantLock();
    private static final Lock secondLock = new ReentrantLock();

    private static final List<String> sharedList = new ArrayList<>();

    private final Thread threadA = new Thread(() -> {
        try {
            firstLock.lock();
            System.out.println("Thread-A acquired firstLock");

            Thread.sleep(100); // Simulate processing

            try {
                secondLock.lock();
                System.out.println("Thread-A acquired secondLock");
                sharedList.add("Added by Thread-A");
            } finally {
                secondLock.unlock();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread-A was interrupted");
        } finally {
            firstLock.unlock();
        }
    });

    private final Thread threadB = new Thread(() -> {
        try {
            secondLock.lock();
            System.out.println("Thread-B acquired secondLock");

            Thread.sleep(100); // Simulate processing

            try {
                firstLock.lock();
                System.out.println("Thread-B acquired firstLock");
                sharedList.add("Added by Thread-B");
            } finally {
                firstLock.unlock();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread-B was interrupted");
        } finally {
            secondLock.unlock();
        }
    });

    public void runThreads() {
        threadA.start();
        threadB.start();
    }

    public static List<String> getSharedList() {
        return sharedList;
    }
}

package com.discover.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadlockSolution {

 
    private static final Lock firstLock = new ReentrantLock();
    private static final Lock secondLock = new ReentrantLock();
    private static final List<String> sharedData = new ArrayList<>();

    
    private final Thread workerOne;
    private final Thread workerTwo;

    public DeadlockSolution() {
        workerOne = new Thread(this::processByThreadOne, "Worker-1");
        workerTwo = new Thread(this::processByThreadTwo, "Worker-2");
    }

    
    private void processByThreadOne() {
        firstLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired firstLock");

            simulateWork();

            secondLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired secondLock");
                sharedData.add("Entry from Thread-1");
            } finally {
                secondLock.unlock();
                System.out.println(Thread.currentThread().getName() + " released secondLock");
            }
        } finally {
            firstLock.unlock();
            System.out.println(Thread.currentThread().getName() + " released firstLock");
        }
    }

   
    private void processByThreadTwo() {
        firstLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired firstLock");

            simulateWork();

            secondLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired secondLock");
                sharedData.add("Entry from Thread-2");
            } finally {
                secondLock.unlock();
                System.out.println(Thread.currentThread().getName() + " released secondLock");
            }
        } finally {
            firstLock.unlock();
            System.out.println(Thread.currentThread().getName() + " released firstLock");
        }
    }

    
    public void runThreads() {
        workerOne.start();
        workerTwo.start();
    }

   
    private void simulateWork() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // Proper interruption handling
            System.err.println(Thread.currentThread().getName() + " was interrupted");
        }
    }

    
    public static List<String> getSharedData() {
        return sharedData;
    }
}

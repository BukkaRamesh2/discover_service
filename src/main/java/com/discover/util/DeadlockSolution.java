package com.discover.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSolution {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();
    private static final List<String> myList = new ArrayList<>();

    public Thread t1 = new Thread(() -> {
        try {
            lock1.lock();
            System.out.println("Thread-1 locked Lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                lock2.lock();
                System.out.println("Thread-1 locked Lock2");
                myList.add("I am added by Thread-1");
            } finally {
                lock2.unlock();
            }
        } finally {
            lock1.unlock();
        }
    });

    public Thread t2 = new Thread(() -> {
        try {
            lock1.lock();  // Lock1 first here as well
            System.out.println("Thread-2 locked Lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                lock2.lock();
                System.out.println("Thread-2 locked Lock2");
                myList.add("I am added by Thread-2");
            } finally {
                lock2.unlock();
            }
        } finally {
            lock1.unlock();
        }
    });

    public List<String> getMylist() {
        return myList;
    }
}

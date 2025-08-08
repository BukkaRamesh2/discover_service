package com.discover.util;
public class DeadLockUP {

    // Two resources
static final Object lock1 = new Object();
static final Object lock2 = new Object();

public static void main(String[] args) {
    
    // Thread 1
    Thread t1 = new Thread(() -> {
        synchronized (lock1) {
            System.out.println("Thread 1: Locked lock1");

            try { Thread.sleep(100); } catch (Exception e) {}

            System.out.println("Thread 1: Waiting for lock2...");
            synchronized (lock2) {
                System.out.println("Thread 1: Locked lock2");
            }
        }
    });

    // Thread 2
    Thread t2 = new Thread(() -> {
        synchronized (lock2) {
            System.out.println("Thread 2: Locked lock2");

            try { Thread.sleep(100); } catch (Exception e) {}

            System.out.println("Thread 2: Waiting for lock1...");
            synchronized (lock1) {
                System.out.println("Thread 2: Locked lock1");
            }
        }
    });

    t1.start();
    t2.start();
}
}



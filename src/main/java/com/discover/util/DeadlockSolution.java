package com.discover.util;

public class DeadlockSolution {
    public static void main(String[] args) {

        final Object resource1 = "resource1";
        final Object resource2 = "resource2";

        // Thread 1: Locks resource1, then resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        // Thread 2: Also locks in the same order (resource1 then resource2)
        Thread t2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2: locked resource 1");

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

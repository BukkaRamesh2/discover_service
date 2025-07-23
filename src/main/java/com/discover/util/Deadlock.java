package com.discover.util;

public class Deadlock {

	    private final Object lock1 = new Object();
	    private final Object lock2 = new Object();

	    public void startDeadlock() {
	        Thread thread1 = new Thread(() -> {
	            try {
	                synchronized (lock1) {
	                    System.out.println("Thread 1: Holding lock1...");
	                    Thread.sleep(25); 
	                    synchronized (lock2) {
	                        System.out.println("Thread 1: Holding lock1 and lock2...");
	                    }
	                }
	            } catch (InterruptedException e) {
	                System.out.println("Thread 1 interrupted: " + e.getMessage());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            try {
	                synchronized (lock2) {
	                    System.out.println("Thread 2: Holding lock2...");
	                    Thread.sleep(25); 

	                    synchronized (lock1) {
	                        System.out.println("Thread 2: Holding lock2 and lock1...");
	                    }
	                }
	            } catch (InterruptedException e) {
	                System.out.println("Thread 2 interrupted: " + e.getMessage());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });

	        thread1.start();
	        thread2.start();
	    }
	}

	
	
	


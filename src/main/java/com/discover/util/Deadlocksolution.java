package com.discover.util;

public class Deadlocksolution {

	    private final Object lockA = new Object();
	    private final Object lockB = new Object();

	    public void processSafeA() {
	        try {
	            synchronized (lockA) {
	                System.out.println("Thread " + Thread.currentThread().getName() + " acquired lockA");

	                Thread.sleep(25); 
	                synchronized (lockB) {
	                    System.out.println("Thread " + Thread.currentThread().getName() + " acquired lockB");
	                    
	                    System.out.println("Thread " + Thread.currentThread().getName() + " processed both locks safely");
	                }
	            }
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }
	    }

	    public void processSafeB() {
	        try {
	            synchronized (lockA) { 
	                System.out.println("Thread " + Thread.currentThread().getName() + " acquired lockA");

	                Thread.sleep(25); 
	                synchronized (lockB) {
	                    System.out.println("Thread " + Thread.currentThread().getName() + " acquired lockB");
	                    
	                    System.out.println("Thread " + Thread.currentThread().getName() + " processed both locks safely");
	                }
	            }
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }
	    }
	}

	
	
	


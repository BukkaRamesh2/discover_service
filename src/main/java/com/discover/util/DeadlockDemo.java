package com.discover.util;

/**
 * deadlock situation.
 * Two threads try to acquire two locks in different orders, causing deadlock.
 */
public class DeadlockDemo {

    // Two resource objects to lock
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public void createDeadlock() {
        // Thread 1 locks resource1 then tries to lock resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread-1 locked resource1");

                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Waiting for resource2 (which thread 2 might have locked)
                synchronized (resource2) {
                    System.out.println("Thread-1 locked resource2");
                }
            }
        });

        // Thread 2 locks resource2 then tries to lock resource1
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread-2 locked resource2");

                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Waiting for resource1 (which thread 1 might have locked)
                synchronized (resource1) {
                    System.out.println("Thread-2 locked resource1");
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        DeadlockDemo demo = new DeadlockDemo();
        demo.createDeadlock();
    }
	
	
	private final Object r1 = new Object();
	private final Object r2 = new Object();
	
	public void simulateDeadLock() {
		
		Thread t1 = new Thread( () -> {
			synchronized (r1) {
				System.out.println("Thread-1 locked resource 1");
			   try {
				   Thread.sleep(100);
			   }catch(Exception e) {
				   
			   }
			}
		});
		
		Thread t2 = new Thread( () -> {
			synchronized (r2) {
				System.out.println("Thread-2 locked resource 2");
			   try {
				   Thread.sleep(100);
			   }catch(Exception e) {
				   
			   }
			}
		});
		
		t1.start();
		t2.start();
	}


}

package com.discover.util;

public class DeadlockDemo {


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
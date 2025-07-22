package com.discover.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockResolution {
	

	private final Lock r1 = new ReentrantLock();
	private final Lock r2 = new ReentrantLock();
	
	public void resolvedDeadLock() {
		
		Thread t1 = new Thread( () -> {
			
			while(true)
			{
				if(r1.tryLock()) {
					try {
						if(r2.tryLock()) {
							try {
								System.out.println("Thread-1 got both locks");
								break;
							} finally {
								r2.unlock();
							}
						}
					}finally {
						r1.unlock();
					}
				}
				
			}
				
				
			
		});
		
     Thread t2 = new Thread( () -> {
			
			while(true)
			{
				if(r2.tryLock()) {
					try {
						if(r1.tryLock()) {
							try {
								System.out.println("Thread-2 got both locks");
								break;
							} finally {
								r1.unlock();
							}
						}
					}finally {
						r2.unlock();
					}
				}
				
			}
				
				
			
		});
		
		t1.start();
		t2.start();
	}

}

package com.discover.util;



public class TestH {
    public static void main(String[] args) {
    	
    	System.out.println("------------------Deadlock------------------");
    	Deadlock dead = new Deadlock();
        dead.t1.start();
        dead.t2.start();
        try {
			dead.t1.join(1000);
			dead.t2.join(1000);
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        dead.getMylist().forEach(System.out::println);
        
        System.out.println("--------------DeadlockSolution--------------");
        DeadlockSolution deadS = new DeadlockSolution();
        deadS.t1.start();
        deadS.t2.start();
        try{
        	deadS.t2.join(1000);
        	deadS.t2.join(1000);
        }
        catch(InterruptedException e) {
        	e.printStackTrace();
        }
        
        deadS.getMylist().forEach(System.out::println);
    }
}




package com.discover.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo_1 
{

    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args)
    {
    	DeadlockDemo_1 deadlock = new DeadlockDemo_1();
        Thread t1 = new Thread(deadlock::operation1, "T1");
        Thread t2 = new Thread(deadlock::operation2, "T2");

        t1.start();
        t2.start();

        try 
        {
            t1.join(1000);
            t2.join(1000);
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("\n[MAIN] Test finished. If it hangs, it's a deadlock.");
    }

    public void operation1() 
    {
        lock1.lock();
        print("lock1 acquired, waiting to acquire lock2.");
        sleep(100);

        lock2.lock(); 
        print("lock2 acquired");

        print("executing operation1.");

        lock2.unlock();
        lock1.unlock();
    }

    public void operation2() 
    {
        lock2.lock();
        print("lock2 acquired, waiting to acquire lock1.");
        sleep(100);

        lock1.lock(); 
        print("lock1 acquired");

        print("executing operation2.");

        lock1.unlock();
        lock2.unlock();
    }

    private void sleep(long millis) 
    {
        try 
        { 
        	Thread.sleep(millis); 
        } 
        catch (InterruptedException ignored) {}
    }

    private void print(String msg) 
    {
        System.out.printf("[%s] %s%n", Thread.currentThread().getName(), msg);
    }

}

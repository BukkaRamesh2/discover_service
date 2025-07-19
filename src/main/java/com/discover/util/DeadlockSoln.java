package com.discover.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSoln 
{

    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) 
    {
    	DeadlockSoln example = new DeadlockSoln();
        Thread t1 = new Thread(example::operation1, "T1");
        Thread t2 = new Thread(example::operation2, "T2");

        t1.start();
        t2.start();

        try 
        {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("\n[MAIN] No deadlock occurred. Both operations completed successfully.");
    }

    public void operation1() 
    {
        acquireLocks(lock1, lock2);
        try 
        {
            print("Both locks acquired by T1. Executing operation1.");
            sleep(100);
        } 
        finally 
        {
            lock2.unlock();
            lock1.unlock();
            print("T1 released both locks.");
        }
    }

    public void operation2() 
    {
        acquireLocks(lock1, lock2);
        try 
        {
            print("Both locks acquired by T2. Executing operation2.");
            sleep(100);
        } 
        finally 
        {
            lock2.unlock();
            lock1.unlock();
            print("T2 released both locks.");
        }
    }

    private void acquireLocks(Lock first, Lock second) 
    {
        while (true) 
        {
            boolean gotFirst = false;
            boolean gotSecond = false;

            try 
            {
                gotFirst = first.tryLock();
                gotSecond = second.tryLock();

                if (gotFirst && gotSecond) 
                {
                    return;
                }
            } 
            finally 
            {
                if (!gotFirst && gotSecond) second.unlock();
                if (gotFirst && !gotSecond) first.unlock();
            }

            sleep(10);
        }
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

package com.discover.util;

public class Deadlock {
  public static void main(String[] args){
    
    final Object resource1 = "resource1";
    final Object resource2 = "resource2";
    //Here's the first thread.
    //It tries to lock resource1 then resource2
    Thread t1 = new Thread() {
      public void run() {
       
        synchronized(resource1){
          System.out.println("Thread 1: locked resource 1");
          //Pause for a bit, 
          //something. Basically, we just want to give the 
          
          //deadlock to happen here...
          try{ 
            Thread.sleep(50); 
          } catch (InterruptedException e) {}

          //Now wait 'till we can get a lock on resource 2
          synchronized(resource2){
            System.out.println("Thread 1: locked resource 2");
          }
        }
      }
    };

    
    Thread t2 = new Thread(){
      public void run(){
        //This thread locks resource 2 right away
        synchronized(resource2){
          System.out.println("Thread 2: locked resource 2");
          //Then it pauses, for the same reason as the first 
          //thread does
          try{
            Thread.sleep(50); 
          } catch (InterruptedException e){}

          //Then it tries to lock resource1.  
          //But wait!  Thread 1 locked resource1, and 
          //won't release it till it gets a lock on resource2.  
         
          synchronized(resource1){
            System.out.println("Thread 2: locked resource 1");
          }
        }
      }
    };

   
    t1.start(); 
    t2.start();
  }
}
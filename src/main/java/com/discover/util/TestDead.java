package com.discover.util;

public class TestDead {
    public static void main(String[] args) {
        System.out.println("------------------Deadlock Example------------------");
        Deadlock deadlock = new Deadlock();
        deadlock.t1.start();
        deadlock.t2.start();
        try {
            deadlock.t1.join(1000);
            deadlock.t2.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deadlock.getMylist().forEach(System.out::println);

        System.out.println("--------------Deadlock Solution Example--------------");
        DeadlockSolution solution = new DeadlockSolution();
        solution.t1.start();
        solution.t2.start();
        try {
            solution.t1.join(1000);
            solution.t2.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        solution.getMylist().forEach(System.out::println);
    }
}

package com.discover.util;

import com.discover.entity.Rewards;
import java.time.LocalDate;

/**
 * Multithreading using the Rewards entity.
 * Two threads will access the same Rewards object using synchronization.
 */
public class RewardsThread extends Thread {

    private final Rewards rewards;

    public RewardsThread(Rewards rewards) {
        this.rewards = rewards;
    }

    @Override
    public void run() {
        // Synchronizing on the shared rewards object
        synchronized (rewards) {
            System.out.println(Thread.currentThread().getName() + " started processing reward ID: " + rewards.getRewardsId());

            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " processing points: " + rewards.getRewardsPoints());
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }

            System.out.println(Thread.currentThread().getName() + " finished processing reward: " + rewards.getRewardsName());
        }
    }

    public static void main(String[] args) {
        // Create a single shared Rewards object
        Rewards rewards = new Rewards(101L, "Diwali Bonus", 5000, LocalDate.now(), "Active");

        // Create two threads sharing the same rewards object
        RewardsThread t1 = new RewardsThread(rewards);
        RewardsThread t2 = new RewardsThread(rewards);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}

package com.discover.util;

import com.discover.entity.Rewards;
import java.time.LocalDate;

//Abstraction
abstract class RewardsBase {
    abstract void evaluateReward(Rewards reward);
}

// Inheritance
public class RewardsUtil extends RewardsBase {

    //Polymorphism: Method Overloading
    public void printRewardDetails(Rewards reward) {
        System.out.println("Reward ID: " + reward.getRewardsId());
        System.out.println("Reward Name: " + reward.getRewardsName());
        System.out.println("Points: " + reward.getRewardsPoints());
        System.out.println("Issue Date: " + reward.getIssueDate());
        System.out.println("Status: " + reward.getStatus());
    }

    public void printRewardDetails(String name, int points) {
        System.out.println("Reward Info -> Name: " + name + ", Points: " + points);
    }

    // Overridden method from RewardsBase abstract class
    @Override
    public void evaluateReward(Rewards reward) {
        int points = reward.getRewardsPoints();
        String status = reward.getStatus();

        //if
        if (points == 0) {
            System.out.println("No rewards earned.");
        }

        //if-else
        if (points >= 1000) {
            System.out.println("You earned a gold reward!");
        } else {
            System.out.println("Keep earning more points.");
        }

        //if-else-if 
        if (points >= 1000) {
            System.out.println("Gold reward member");
        } else if (points >= 500) {
            System.out.println("Silver reward member");
        } else if (points >= 100) {
            System.out.println("Bronze reward member");
        } else {
            System.out.println("Not a reward member");
        }

        //nested if
        if (status != null) {
            if (status.equalsIgnoreCase("active")) {
                System.out.println("Reward is currently active.");
            } else {
                System.out.println("Reward is not active.");
            }
        } else {
            System.out.println("Status is unknown.");
        }

        //switch-case
        switch (status != null ? status.toLowerCase() : "") {
            case "active":
                System.out.println("Reward can be used.");
                break;
            case "expired":
                System.out.println("Reward has expired.");
                break;
            case "pending":
                System.out.println("Reward is pending approval.");
                break;
            default:
                System.out.println("Reward status unknown.");
        }
    }

    public static void main(String[] args) {
        Rewards reward = new Rewards();
        reward.setRewardsId(123456789L);
        reward.setRewardsName("Super Saver Bonus");
        reward.setRewardsPoints(750);
        reward.setIssueDate(LocalDate.now());
        reward.setStatus("active");

        RewardsUtil util = new RewardsUtil();
        util.printRewardDetails(reward);
        util.printRewardDetails("Holiday Bonus", 1200);
        util.evaluateReward(reward);
    }
}

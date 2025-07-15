package com.discover.util;


import com.discover.entity.Rewards;
import java.time.LocalDate;
import java.util.*;                 // For List, Set, Map, Queue


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
        
        Rewards r1 = new Rewards(1L, "Welcome Bonus", 1200, LocalDate.now(), "active");
        Rewards r2 = new Rewards(2L, "Holiday Gift", 700, LocalDate.now(), "expired");
        Rewards r3 = new Rewards(3L, "Referral Reward", 500, LocalDate.now(), "pending");
        Rewards r4 = new Rewards(4L, "Loyalty Points", 200, LocalDate.now(), "active");

        RewardsUtil util1 = new RewardsUtil();
        
     //List - Ordered, allows duplicates
        //ArrayList
        List<Rewards> rewardList = new ArrayList<>();
        rewardList.add(r1);
        rewardList.add(r2);
        rewardList.add(r2); // Duplicate allowed

        System.out.println("\n List Example:");
        for(Rewards r : rewardList) {
            util.printRewardDetails(r);
            util.evaluateReward(r);
            System.out.println("-----------------------------");
        }
        
        //LinkedList - similar to ArrayList but with different internal structure (nodes)
        List<Rewards> rewardLinkedList = new LinkedList<>();
        rewardLinkedList.add(r1);
        rewardLinkedList.add(r2);

        System.out.println("\n LinkedList Example: ");
        for (Rewards r : rewardLinkedList) {
            util.printRewardDetails(r);
            util.evaluateReward(r);
            System.out.println("-----------------------------");
        }

      //set
        //HashSet
        Set<Rewards> rewardSet = new HashSet<>(rewardList);

        System.out.println("\n Set Example (no duplicates):");
        for (Rewards r : rewardSet) {
            util.printRewardDetails(r);
            System.out.println("-----------------------------");
        }
        
        //TreeSet (sorted by points using Comparator)
        Set<Rewards> sortedRewards = new TreeSet<>(Comparator.comparingInt(Rewards::getRewardsPoints));
        sortedRewards.add(r1);
        sortedRewards.add(r2);
        
        System.out.println("\n TreeSet Example (Sorted by Points):");
        for (Rewards r : sortedRewards) {
            System.out.println("Points: " + r.getRewardsPoints() + " - " + r.getRewardsName());
            System.out.println("-----------------------------");
        }
        
        
        //Map - Key-value pairs
        Map<Long, Rewards> rewardMap = new HashMap<>();
        rewardMap.put(r1.getRewardsId(), r1);
        rewardMap.put(r2.getRewardsId(), r2);
      
        System.out.println("\n Map Example (ID -> Reward):");
        for (Map.Entry<Long, Rewards> entry : rewardMap.entrySet()) {
            System.out.println("Key (ID): " + entry.getKey());
            util.printRewardDetails(entry.getValue());
            System.out.println("-----------------------------");
            }
        
     
    }
}


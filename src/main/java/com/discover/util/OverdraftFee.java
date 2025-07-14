package com.discover.util;

// Abstraction
abstract class FeeCheck {
    public abstract void checkOverdraft(FeeTest fee);
}

// Inheritance
public class OverdraftFee extends FeeCheck {

    private static int feeCounter = 101;

    // Polymorphism
    @Override
    public void checkOverdraft(FeeTest fee) {
        double balance = fee.getBalance();
        int days = fee.getDaysOverdrawn();

        // If-Else
        if (balance >= 0) {
            System.out.println("No overdraft fee applicable. Balance is $" + balance);
            System.out.println("Status: Account in good standing.\n");
        } else {
            if (fee.getFeeId() == null) {
                fee.setFeeId("OD" + feeCounter);
                feeCounter++;
            }

            System.out.println("Fee ID: " + fee.getFeeId());
            double overdraftAmount = Math.abs(balance);
            System.out.println("Overdraft usage: $" + overdraftAmount + " (Grace period: 3 days)");

            if (days <= 3) {
                System.out.println("Please pay within " + (4 - days) + " day(s) to avoid fees.");
            } else {
                double totalDue = 50 + overdraftAmount;
                System.out.println("Grace period crossed. Please pay $50 and $" + overdraftAmount +
                        " overdraft to avoid further fines. Total due: $" + totalDue);
            }

            // Switch
            String status = (days <= 3) ? "Grace" : "Fined";
            switch (status) {
                case "Grace":
                    System.out.println("Status: Within grace period.\n");
                    break;
                case "Fined":
                    System.out.println("Status: Fine applied.\n");
                    break;
                default:
                    System.out.println("Status: Unknown.\n");
            }
        }
    }

    
    public static void main(String[] args) {
        FeeTest fee1 = new FeeTest();
        FeeTest fee2 = new FeeTest();
        FeeTest fee3 = new FeeTest();

        fee1.setBalance(100.0);
        fee1.setDaysOverdrawn(0);

        fee2.setBalance(-200.0);
        fee2.setDaysOverdrawn(2);

        fee3.setBalance(-400.0);
        fee3.setDaysOverdrawn(5);

        // Polymorphism
        FeeCheck checker = new OverdraftFee();

        // For Loop
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                checker.checkOverdraft(fee1);
            } else if (i == 2) {
                checker.checkOverdraft(fee2);
            } else {
                checker.checkOverdraft(fee3);
            }
        }
    }
}














/*tried using all OOPS concepts and loops in Overdraft scenario.
 * 1.encapsulation- used to keep date private and access
 * 2. abstraction is performed using abstract class FeeCheck
 * 3. inheritance inherited feecheck to overdarft using extend 
 * 4. Polymorphism overrriding feecheck's checker witj Overdaftfee function
 * loops
 * if else used to check foer balance assiging overdraft and feeID
 * switch used for grace period
 * for used apply checkoverdraft() for 3 fee senarios*/

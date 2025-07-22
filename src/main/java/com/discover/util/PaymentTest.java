package com.discover.util;

import com.discover.entity.Payments;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentTest {
    public static void main(String[] args) {
    	
        Payments payment1 = new Payments(101L, "Card", "Processing", new Date());
        Payments payment2 = new Payments(102L, "UPI", "Completed", new Date());
        Payments payment3 = new Payments(103L, "NetBanking", "Failed", new Date());

        List<Payments> paymentList = new ArrayList<>();
        paymentList.add(payment1);
        paymentList.add(payment2);
        paymentList.add(payment3);

        System.out.println("All Payments:");
        for (Payments p : paymentList) {
            System.out.println(p);  // uses toString() from Payments class
        }

        System.out.println("\nPayments still processing:");
        for (Payments p : paymentList) {
            if ("Processing".equalsIgnoreCase(p.getStatus())) {
                System.out.println("Payment ID: " + p.getPaymentid()
                        + ", Mode: " + p.getPaymentmode());
            }
        }
    }
}

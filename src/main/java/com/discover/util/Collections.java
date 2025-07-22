package com.discover.util;

import com.discover.entity.Payments;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
       
        Payments p1 = new Payments(1L, "Credit Card", "Completed", null);
        Payments p2 = new Payments(2L, "PayPal", "Pending", null);
        Payments p3 = new Payments(3L, "Cash", "Completed", null);

        ArrayList<Payments> paymentList = new ArrayList<>();
        paymentList.add(p1);
        paymentList.add(p2);
        paymentList.add(p3);
        System.out.println("ArrayList contents:");
        for (Payments p : paymentList) {
            System.out.println(p);
        }

        TreeSet<Payments> paymentSet = new TreeSet<>((a, b) -> a.getPaymentid().compareTo(b.getPaymentid()));
        paymentSet.addAll(paymentList);
        System.out.println("\nTreeSet contents (sorted by paymentid):");
        for (Payments p : paymentSet) {
            System.out.println(p);
        }

        LinkedHashMap<Long, Payments> paymentMap = new LinkedHashMap<>();
        for (Payments p : paymentSet) {
            paymentMap.put(p.getPaymentid(), p);
        }

        System.out.println("\nLinkedHashMap contents:");
        for (Map.Entry<Long, Payments> entry : paymentMap.entrySet()) {
            System.out.println("Payment ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
}

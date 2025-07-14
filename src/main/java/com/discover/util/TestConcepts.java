package com.discover.util;
import java.sql.Date;
import java.util.*;

import com.discover.entity.Cards;

public class TestConcepts {

    public static void main(String[] args) {

        // CreditCard object created
        System.out.println("---------------------------------------------------------");

        CreditCard card1 = new CreditCard(2121, "9876-4321-1111-0000", 8000.00, Date.valueOf("2020-01-20"), Date.valueOf("2028-01-19"));
        CreditCard card2 = new CreditCard(2122, "1234-5678-9012-3456", 4000.00, Date.valueOf("2019-06-26"), Date.valueOf("2027-06-25"));
        CreditCard card3 = new CreditCard(2123, "1111-2222-3333-4444", 6000.00, Date.valueOf("2018-11-07"), Date.valueOf("2025-11-06"));

        // ----------------- USING ARRAY LIST----------------------------------
        System.out.println("Initial Status:");
        System.out.print("CARD 1: ");
        card1.checkStatus(card1);

        System.out.print("CARD 2: ");
        card2.checkStatus(card2);

        System.out.print("CARD 3: ");
        card3.checkStatus(card3);

        System.out.println();

        card1.activateCard();
        card2.activateCard();
        card3.activateCard();

        LinkedList<Cards> cardList1 = new LinkedList<>();
        cardList1.add(card1);
        cardList1.add(card2);
        cardList1.add(card3);

        System.out.println("------------------- Using LinkedList --------------------------------------");
        System.out.println();

        // Method Overloading --- displaying details
        System.out.println("Card ID - Credit Limit");
        for (Cards c : cardList1) {
            System.out.println(c.getCardId() + " - " + c.getCardLimit());
        }

        System.out.println("---------------------------------------------------------");

        System.out.println("Displaying Card 1 details info with credit Limit.");
        card1.displayCardInfo(card1, true);
        System.out.println();

        System.out.println("------------------ Using HashMap ---------------------------------------");

        Map<String, Cards> cardMap = new HashMap<>();
        cardMap.put(card1.getCardNumber(), card1);
        cardMap.put(card2.getCardNumber(), card2);
        cardMap.put(card3.getCardNumber(), card3);

        for (String key : cardMap.keySet()) {
            System.out.println("Card Number: " + key + ", Status: " + cardMap.get(key).getStatus());
        }

        System.out.println();
        System.out.println("------------------ Using TreeSet --------------------------------------");

        Set<String> cardSet = new TreeSet<>();
        cardSet.add(card1.getCardNumber());
        cardSet.add(card2.getCardNumber());
        cardSet.add(card2.getCardNumber()); // duplicate entry
        cardSet.add(card3.getCardNumber());

        cardSet.forEach(System.out::println);

        System.out.println("---------------------------------------------------------");
    }
}
        // Limit check usin

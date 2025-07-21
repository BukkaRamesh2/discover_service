package com.discover.util;
import com.discover.entity.Transaction;
import java.util.*;

public class Transcollection {
public static void main(String[] args) {

 //      Transaction t1 = new Transaction(101L, 1000);
   //     Transaction t2 = new Transaction(102L, 2000);
   //    Transaction t3 = new Transaction(103L, 1500);
      

        List<Transaction> arrayList = new ArrayList<>();
     //   arrayList.add(t1);
      //  arrayList.add(t2);
       // arrayList.add(t3);
  System.out.println("ArrayList:");
        for (Transaction t : arrayList) {
            System.out.println(t.getTransactionId());
        }

        LinkedList<Transaction> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);

        System.out.println("LinkedList:");
        for (Transaction t : linkedList) {
            System.out.println(t.getTransactionId());
      }

 
        Set<Transaction> Transhash = new HashSet<>();
   //     Transhash.add(t1);
   //     Transhash.add(t2);
   //     Transhash.add(t3);
      

        System.out.println("nHashSet:");
        for (Transaction t : Transhash) {
            System.out.println(t.getTransactionId());
        }
      Set<Long> transtree = new TreeSet<>();
 //       transtree.add(t1.getTransactionId());
   //     transtree.add(t2.getTransactionId());
   //     transtree.add(t3.getTransactionId());
  
          System.out.println("TreeSet");
        for (Long id : transtree) {
            System.out.println(id);
   }
    }
}

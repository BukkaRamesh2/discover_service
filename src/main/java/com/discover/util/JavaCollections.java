package com.discover.util;

import java.time.LocalDate;
import java.util.*;

public class JavaCollections {

    static class Account {
        Long id; String number, type, status;
        Double balance; LocalDate date;

        Account(Long id, String number, String type, Double balance, LocalDate date, String status) {
            this.id = id; this.number = number; this.type = type;
            this.balance = balance; this.date = date; this.status = status;
        }

        public String toString() {
            return id + " | " + number + " | " + type + " | " + balance + " | " + date + " | " + status;
        }

        public boolean equals(Object o) {
            return (o instanceof Account a) && Objects.equals(this.id, a.id);
        }

        public int hashCode() { return Objects.hash(id); }
    }

    public static void main(String[] args) {
        Account a1 = new Account(1L, "ACC01", "Savings", 1000.0, LocalDate.now(), "Active");
        Account a2 = new Account(2L, "ACC02", "Current", 3000.0, LocalDate.now(), "Inactive");
        Account a3 = new Account(3L, "ACC03", "Savings", 2000.0, LocalDate.now(), "Active");

        List<Account> arrayList = List.of(a1, a2, a3);
        List<Account> linkedList = new LinkedList<>(arrayList);
        Set<Account> hashSet = new HashSet<>(arrayList);
        Set<Account> treeSet = new TreeSet<>(Comparator.comparing(a -> a.balance));
        treeSet.addAll(arrayList);
        Map<Long, Account> hashMap = new HashMap<>();
        arrayList.forEach(a -> hashMap.put(a.id, a));

        System.out.println(" ArrayList:"); arrayList.forEach(System.out::println);
        System.out.println("\n LinkedList:"); linkedList.forEach(System.out::println);
        System.out.println("\n HashSet:"); hashSet.forEach(System.out::println);
        System.out.println("\n TreeSet (Sorted by Balance):"); treeSet.forEach(System.out::println);
        System.out.println("\n HashMap (ID → Account):");
        hashMap.forEach((k, v) -> System.out.println("Key: " + k + " | Value: " + v));
    }
}

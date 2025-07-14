package com.discover.util;

import com.discover.entity.Employees;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class DemoCollections {
	public static void main(String[] args) {
		ArrayList<Employees> empList = new ArrayList<>();
        empList.add(new Employees(1L, "John", "Smith", "Mango Dr", "smith@gmail.com", 1234567890L, "Male", "Active"));
        empList.add(new Employees(2L, "John", "Doe", "Apple Dr", "doe@gmail.com", 9876543210L, "Male", "Inactive"));
        System.out.println("---------------------------------------------------------------");
        System.out.println("ArrayList contents:");
        for (Employees emp : empList) {
            System.out.println(emp);
        }
        
        TreeSet<Employees> empSet = new TreeSet<>((s1,s2)->s1.getEmployeeID().compareTo(s2.getEmployeeID()));
        empSet.addAll(empList);
        empSet.add(new Employees(3L,"Karen","Waters","Grape Dr","waters@gmail.com",5473666733L,"Female","Active"));
        System.out.println("---------------------------------------------------------------");
        System.out.println("TreeSet contents:");
        for(Employees emp : empSet) {
        	System.out.println(emp);
        }
        
        LinkedHashMap<Long, Employees> empMap = new LinkedHashMap<>();
        for (Employees emp : empSet) {
            empMap.put(emp.getEmployeeID(), emp);
        }
        
        empMap.put(4L,new Employees(4L,"Mary","Weathers","Orange Dr","weathers@gmail.com",8997541733L,"Female","Active"));
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("LinkedHashMap contents:");
        for (Map.Entry<Long, Employees> emp : empMap.entrySet()) {
        	System.out.println("Employee ID: " + emp.getKey());
        	System.out.println("Details: " + emp.getValue());
        }
	}

}

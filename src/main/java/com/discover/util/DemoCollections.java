package com.discover.util;

import com.discover.entity.Employee;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class DemoCollections {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1L, "John", "Smith", "Mango Dr", "smith@gmail.com", 1234567890L, "Male", "Active"));
        empList.add(new Employee(2L, "John", "Doe", "Apple Dr", "doe@gmail.com", 9876543210L, "Male", "Inactive"));
        System.out.println("---------------------------------------------------------------");
        System.out.println("ArrayList contents:");
        for (Employee emp : empList) {
            System.out.println(emp);
        }
        
        TreeSet<Employee> empSet = new TreeSet<>((s1,s2)->s1.getEmployeeID().compareTo(s2.getEmployeeID()));
        empSet.addAll(empList);
        empSet.add(new Employee(3L,"Karen","Waters","Grape Dr","waters@gmail.com",5473666733L,"Female","Active"));
        System.out.println("---------------------------------------------------------------");
        System.out.println("TreeSet contents:");
        for(Employee emp : empSet) {
        	System.out.println(emp);
        }
        
        LinkedHashMap<Long, Employee> empMap = new LinkedHashMap<>();
        for (Employee emp : empSet) {
            empMap.put(emp.getEmployeeID(), emp);
        }
        
        empMap.put(4L,new Employee(4L,"Mary","Weathers","Orange Dr","weathers@gmail.com",8997541733L,"Female","Active"));
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("LinkedHashMap contents:");
        for (Map.Entry<Long, Employee> emp : empMap.entrySet()) {
        	System.out.println("Employee ID: " + emp.getKey());
        	System.out.println("Details: " + emp.getValue());
        }
	}

}

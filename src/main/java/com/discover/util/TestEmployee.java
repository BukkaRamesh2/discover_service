package com.discover.util;
import java.util.ArrayList;
import java.util.List;

import com.discover.entity.Employees;


//Inheritance
class humanCheck extends Verify{
	public void check() {
		System.out.println("Hi I am human"); 
	}
}
	
//	method override
class employeeCheck extends humanCheck{
	public void check() {
		System.out.println("Hi I am an employee");
		
	}
}

public class TestEmployee{
	
	
	
	public static void main(String[] args) {
//		polymorphism
		humanCheck x = new humanCheck();
		humanCheck y = new employeeCheck();
		x.check();
		y.check();
		Employees[] emp = new Employees[4];
		List<Employees> empList = new ArrayList<>();
		
		
		
		int i = 0;
		
//		do while
		do {
			emp[i] = new Employees();
			i++;
		}
		while (i<3);
		
//		while
		int k = 0;
		while (k<3) {
			emp[k].setFirstName("Alex"+"'" + k +"'");
			k++;
		}
		
		emp[0].setStatus("Active");
		emp[1].setStatus("Inactive");
		emp[2].setStatus("N/A");
		
//		for loop
		for (int j = 0; j < 4; j++) {
//			if-else
			if(emp[j]!=null) {
				switch (emp[j].getStatus()){
					case "Active":
						System.out.println("Hi " + emp[j].getFirstName() + ". you are an active employee.");
						break;
					case "Inactive":
						System.out.println("Hey " + emp[j].getFirstName() + ". you are an inactive employee!!");
						break;
				    default:
						System.out.println("Hey " + emp[j].getFirstName() + ".you are not an employee!!!");
				}
			}
			else {
				System.out.println("You passed a Null object");
			}
		}
		
		
	}

}



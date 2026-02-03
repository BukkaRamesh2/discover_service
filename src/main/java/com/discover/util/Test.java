//package com.discover.util;
//
//import com.discover.entity.Customer;
//import com.discover.entity.DiscoverCustomer;
//import com.discover.service.CustomerServiceImpl;
//
//public class Test extends Customer{
//	
//	
//	public String testData;  //
//	
//	
//	public DiscoverCustomer customer;    // aggrigation 
//	
//	
//	public void testMethod() {
//		System.out.println("inside test class");
//	}
//	
//	
//	public Test(Long customerID, String firstName, String lastName, String address, String email, Long phoneNumber,
//			boolean gender, boolean status, String name, Integer age, DiscoverCustomer customer) {
//		super(customerID, firstName, lastName, address, email, phoneNumber, gender, status, name, age);
//		this.customer = customer;
//	}
//
//
//	public Test() {
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public static void main(String[] args){
//		//Customer c = new Customer();   // 4% , 5%, 7%
//		//Test  t = new Test();
//		//t.customer.getDiscCustomer(); //  
//		
//		try {
//			
//		//CustomerServiceImpl service = new CustomerServiceImpl();
//		
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		
//		
//		Customer c1 = new Customer(1L, "Roger", "A","B","C",1457L,true,true,"test",1234523);
//		Customer c2 = new Customer(2L, "Sam", "A","B","C",1457L,true,true,"test",1234523);
//	
////		service.addCustomer(c1);
////		service.addCustomer(c2);
////		
////		
////			Thread.sleep(1000);
////		
////		
////		System.out.println("All Customers : ");
////		
////		service.getAllCustomers().forEach(System.out::println);
////		
////		service.updateCustomer(new Customer(1L, "Roger New", "A","B","C",1457L,true,true,"test",114477895));
////		
////		service.deleteCustomer(2L);
////		 
//		System.out.println("Calling Simulating Deadlock objcest from main: ");
//	 
//		//new DeadlockDemo().simulateDeadLock();
//		
//		new DeadLockResolution().resolvedDeadLock();
//
//		
//		Thread.sleep(2000);
//		
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	
//	public void test(){
//	}
//
//}
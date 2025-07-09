package com.discover.entity;

public class Customer {


	public Long customerID;
	private static String firstName = "Carol";
	private String lastName;
	protected String address;
	private String email;
	private static Long phoneNumber;
	boolean status;
	
	
	String name = "123";
	
	Integer age =  18;   // global variable
	
	



	public Customer(Long customerID2, String firstName2, String lastName2, String address2, String email2,
			Long phoneNumber2, boolean gender, boolean status2, String name2, Integer age2) {
		// TODO Auto-generated constructor stub
	}







	public Customer() {
		// TODO Auto-generated constructor stub
	}







	public Long getCustomerID () {
		Integer number =  18;   // local variable
		return this.customerID;
	}
	
	public void setCustomerID(Long customerId) {
		age = 21;
		this.customerID = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void testMethod() {
		System.out.println("inside customer class");
	}



	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("customer Id: "+customerID + "Name : " + firstName);
	}
	
	public static void applyBonus() {
		if(firstName != null && firstName == "alex" && phoneNumber == 123454545L) {
				System.out.println("Alex you got a bonus");
		} else if(firstName == "Bob"){
			System.out.println("Bob got bonus");
		} else {
			System.out.println("You are not correct member");
		}
		
		switch (firstName) {
		case "alex" :
			System.out.println("Alex you got a bonus");
            break;
		case "bob" :
			System.out.println("bob you got a bonus");
            break;
		case "Carol" :
			System.out.println("Carol you got a bonus");
            break;  
         default: 
 			System.out.println("You are not correct member");
		}
	}
	
	
	public static void main(String[] args) {
		applyBonus();
	}
	
	
	
	          
	
	/*
	 * 
	 *    datatypes  
	 *       arrays -- 0 index
	 *       
	 *       int  == 123456789900123123
	 *       long ==
	 *       
	 *       double  == 12312123.12321300
	 *       float == 10.32f
	 *       
	 *       boolean  == true/false yes/no 0/1
	 *       
	 *       char   == single character
	 *       string  == combination of multiple chars together 
	 *       
	 *       short
	 *       
	 *         primitive data types
	 *         non primitive data types
	 *         
	 *         wrapper classes  --- convertion of data from one tyoe to aother type easy 
	 *          
	 *     
	 *     
	 *    access specifiers
	 *    
	 *       scopes who can access and till where it can be accessed
	 *       
	 *         public -- anywhere in project 
	 *         private -- inside a class 
	 *         protected   -- inside a pakage
	 *         default  -- 
	 *         
	 *       
	 *    
	 *    variables 
	 *    getter 
	 *    setter
	 *    constructor 
	 *        
	 *        operators
	 *         Arithmetic   (/ + - * %)
	 *         logical   = < > || &&
	 *         assignemnt 
	 *         relational
	 *         
	 *         
	 *         Decison making 
	 *         
	 *           if(conditon) 
	 *           else 
	 *           
	 *           if
	 *           else if()
	 *           else
	 *           
	 *           if(){
	 *             if(){
	 *              if(){
	 *              }
	 *              
	 *              }
	 *              }
	 *              
	 *              
	 *           
	 *           
	 *           switch (condition)
	 *           case 1
	 *              sdasd
	 *              break;
	 *              
	 *              
	 *           Loop control 
	 *           
	 *              do  
	 *              process business logic 
	 *              
	 *              while(condition)
	 *              
	 *              for (initalise; condition check; inc/dec)
	 *              
	 *              foreach (datatype referce: collection)
	 *              
	 *              
	 *              
	 *           // OOPS 
	 *           
	 *           Inheritance   -- parent class properties are acquired by child class -- extends , aggrigation -- 
	 *           polymorphism   --- methods oversloading and method overriding  
	 *           
	 *           compile time and runtime  
	 *            methodname with differnet signature   method is over laoding 
	 *            method overriding -- same name same signiture but always the latest data assigned will be called 
	 *           
	 *           abstraction  --- hiding the data 
	 *           encapsulation  -- binding of data memenbers objects togeteher -- entity class 
	 *           
	 *           class
	 *           object
	 *           constructor 
	 *           
	 *           
	 *           
	 *    
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
//	customerID;
//	firstName;
//	lastName;
//	address;
//	email;
//	phoneNumber;
//	gender;
//	status;


}

package com.discover.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    
	@Id
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

	
	@Override
	public int hashCode() {
		return Objects.hash(address, age, customerID, email, lastName, name, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(age, other.age)
				&& Objects.equals(customerID, other.customerID) && Objects.equals(email, other.email)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name)
				&& status == other.status;
	}







	public void testMethod() {
		System.out.println("inside customer class");
	}



	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("customer Id: "+customerID + "Name : " + firstName);
	}
	
	public static void applyBonus() throws Exception{
	    
		// create constructorr and add a data 
		
		
		Long currentime = System.currentTimeMillis(); // cureeent time 
		
		List<Customer> custList = new ArrayList<Customer>();
	      custList.add(null);  /// pass const 
	      
	      for (Customer customer : custList) {
			  if(customer.getFirstName().contains("Hari")) {
				  
			  }
		}
	      
	      Long endtime = System.currentTimeMillis(); // cureeent time 
	      System.out.println("Actual time taken for array: "+ (endtime - currentime)); // time tak

	      
	      
	      Long currentime1 = System.currentTimeMillis(); // cureeent time 
			
			List<Customer> custList2 = new LinkedList<Customer>();
		      custList.add(null);
		      
		      for (Customer customer : custList) {
				  if(customer.getFirstName().contains("Hari")) {
					  
				  }
			}
		      
		      Long endtime2 = System.currentTimeMillis(); // cureeent time 
		      System.out.println("Actual time taken for array: "+ (endtime2 - currentime1)); // time tak
	      
	
	
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
		//applyBonus();
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
	 *           Collections ///  -- to store the data java.util
	 *           Exceptions
	 *           MultiThreading
	 *           
	 *           List  --- interface --- it allows duplicate values to store 
	 *           Set  -- interface   --- it wont allow duplicates   it un ordered 
	 *           Map  -- interface  -- the data will be stored in a key value format of data 
	 *           
	 *           
	 *           int name[100]={1, 2, 3, 4, 5}   ///  100 -- 5 d
	 *           
	 *           ArrayList  --  [100]  []  -- dynamic array, size automatic --  
	 *           
	 *           store / insert your data data the array list is fast 
	 *           99th element in array list -- 0 traverse till 99 and get the data  -- slow 
	 *           
	 *           2000 -- 
	 *           
	 *           
	             LinkedList  --  double linked list  -- [0, 0, 1][1, 1, 2]
	             -- retreival of data -- faster  
	             
	             Stack -- LIFO 
	 *           
	 *           HashSet  -- the order of insertion  not stored same as we inserted -- random 
	 *           LinkedHashset  -- store insertion order 
	 *           Treeset  -- natural sorting order -- a,b,c,
	 *           
	 *           
	 *           HashMap   -- the data stores in a key value format 
	 *           LinkedHashMap --
	 *           TreeMap  -- 
	 *           
	 *           hashtable -- objectes used tos store hascode and quals 
	 *           
	 *           
	 *           
	 *           {
	 *            key : value 
	 *            
	 *           }
	 *           
	 *           exceptions  --  errors came 
	 *           
	 *           try  -- block of code as part of your business logic 
	 *           catch  -- give you  proper error meeaage and handle your exceptions
	 *           throw  -- to call custom exception classes  
	 *           throws  -- this is used as followed by method signiture 
	 *           finally   --- block we used if excpetion occurec the logic will not execture it will break but what ever 
	 *           you write in finally block if the exception occures or not the finally block willl execute 
	 *           
	 *           
	 *           
	 *           compile time -- will not allow me to write a program 
	 *           run time -- will allow an user to write a program while executing you will get an error
	 *           
	 *           IOExecpetions
	 *           ArrayIndex
	 *           StackOverFllow
	 *           NullPointer
	 *           
	 *           NumberFormat
	 *           
	 *           
	 *           try {
	 *           
	 *             process business logic
	 *           } catch(Exception e){
	 *              e.printStarackTrace();
	 *           }
	 *           
	 *           
	 *      Spring MVC architecture   -- Backend , Frontend withn database 
	 *      You will get a form Data 
	 *      
	 *      Spring boot Rest API applicaiton   -- Backend , database 
	 *      type of a data input might be JSON format or XML format 
	 *      
	 *      
	 *      libraries -- are require to communicate with any of your external component -- Pom.xml 
	 *       
	 *      properties -- the connection strings, port numbers and other info related to config -- applicaion.properties / applicatipon.yml  
	 *  
	 *      
	 *      Customer
	 *      
	 *      
	 *      Packages  -- Model/Entity, Controller/RestController, Service, Repository, Exceptions, util 
	 *      Classes     ---  Customer, CustomerController, customerServiceImpl
	 *      INterfaces  -- CustomerService, CustomerRepository
	 *      Methods   ---- addCustomer, getCustomer, getListCustomer, updateCustomer, DeleteCustomer 
	 *      Return Types --  entity, list objects, void 
	 *      
	 *      https://wwww.gmail.com/signup  -- POST 
	 *      https://wwww.gmail.com/getUserInfo/Alex  -- Get 
	 *      
	 *      annotations --- 
	 *       
	 *       @entity -- data jpa object 
	 *       @id -- primary key -- long 
	 *       @generationtype -- int, alphanumberic, 
	 *       @column -- 
	 *       
	 *       @RestController  -- it a combination of data input
	 *       @RequestMapping -- is part of application URL 
	 *       
	 *       @GetMapping -- get customer
	 *       @PostMapping -- create
	 *       @PutMapping -- update the record
	 *       @DeleteMapping -- to  delelet the record
	 *       
	 *       @RequestBody -- ready entire data object from postman or swagger 
	 *       @ResponseBody  --- return data
	 *       
	 *       @PathParam / PathVariable  --- read single input from your URL 
	 *      
	 *       @Service -- in your serviceImpl layer -- to make bean register as part of DI
	 *       
	 *       @Reposoitory --- data jpa to connect with Database components
	 *       
	 *       @Autowired -- to create objects - to call other classses 
	 *       
	 *       
	 *       Entity
	 *       //the data comes to controller
	 *       then process it to service
	 *       then modify the objects accordingly and send it to repository 
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

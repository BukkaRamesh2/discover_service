package com.discover.entity;

import java.util.Objects;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerID;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private Long phoneNumber;
	private boolean status;
	  
	@Version
	private Integer version; // Used for optimistic locking
	
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
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
	
	
	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	


//	public static void applyBonus() throws Exception{
//	    
//		// create constructorr and add a data 
//		
//		
//		Long currentime = System.currentTimeMillis(); // cureeent time 
//		
//		List<Customer> custList = new ArrayList<Customer>();
//	      custList.add(null);  /// pass const 
//	      
//	      for (Customer customer : custList) {
//			  if(customer.getFirstName().contains("Hari")) {
//				  
//			  }
//		}
//	      
//	      Long endtime = System.currentTimeMillis(); // cureeent time 
//	      System.out.println("Actual time taken for array: "+ (endtime - currentime)); // time tak
//
//	      
//	      
//	      Long currentime1 = System.currentTimeMillis(); // cureeent time 
//			
//			List<Customer> custList2 = new LinkedList<Customer>();
//		      custList.add(null);
//		      
//		      for (Customer customer : custList) {
//				  if(customer.getFirstName().contains("Hari")) {
//					  
//				  }
//			}
//		      
//		      Long endtime2 = System.currentTimeMillis(); // cureeent time 
//		      System.out.println("Actual time taken for array: "+ (endtime2 - currentime1)); // time tak
//	      
//	
//	
//		if(firstName != null && firstName == "alex" && phoneNumber == 123454545L) {
//				System.out.println("Alex you got a bonus");
//		} else if(firstName == "Bob"){
//			System.out.println("Bob got bonus");
//		} else {
//			System.out.println("You are not correct member");
//		}
//		
//		switch (firstName) {
//		case "alex" :
//			System.out.println("Alex you got a bonus");
//            break;
//		case "bob" :
//			System.out.println("bob you got a bonus");
//            break;
//		case "Carol" :
//			System.out.println("Carol you got a bonus");
//            break;  
//         default: 
// 			System.out.println("You are not correct member");
//		}
//	}
//	
//	

	
	
	
	          
	
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
	 *      Datatypes
	 *      variables
	 *      wrapperclasses
	 *      constructors
	 *      OOPS 
	 *      Exception handling
	 *      MultiThreds
	 *      Loops & Conditional statments
	 *      Access specifiers
	 *      Collections
	 *      Operators
	 *      
	 *      
	 *      
	 *      Spring boot structure
	 *      DB connection 
	 *      Global exception 
	 *      
	 *      Library pom.xml
	 *      add the properties 
	 *      establish connection
	 *      
	 *      
	 *      
	 *      
	 *       Spring security and JWT token 
	 *       where the applicaion is going to be authenticated with username and password 
	 *       spring securoty lib is part of CustomUserDetailsService class    implementrs UserDetailsService
	 *       jwt api
	 *       jwt impl 
	 *       jwt jackson
	 *       
	 *       token -- bearer token 
	 *       applicaion.prop / applicaion.yml
	 *       jwt token session -- 60 
	 *       secret : hash256
	 *       
	 *       entire controllers to access any methods we use jsonwebtoken -- with out bearer token if you access the api it has to give 403 error
	 *       
	 *       1. CustomUserDetailsService(PasswordEncoder Hash256)  // crypto spring secuirty 
	 *       user username - password
	 *       
	 *       @Overriden
	 *       loadUSerByUserName(username)
	 *        password
	 *        
	 *        autheusers
	 *        
	 *       2. JWTUtil class-- component 
	 *          secret
	 *          expiration
	 *          
	 *          extractUserName()
	 *          extractExipration()
	 *          extractClaim()
	 *          isTokenExpired()
	 *          generateToekn()  --- bearer token once user name and password is correct then the this method witll be called
	 *          createToken()
	 *          validateToken()
	 *          getSignKey(base64 encoder )
	 *       3.  JWTAuthenticationFilter class -- onceperRequestFilter
	 *          
	 *          @override
	 *          doFilterInternal()request, response, httpservlet, 
	 *        4.SpringSecurity class 
	 *          @Configutration
	 *          @EnableWebSecurity
	 *            
	 *            JWTAuthenticationFilter
	 *            filterChain() ---- 
	 *            /swagger-ui.html ----  permital
	 *            /v3/api-docs  -- permitAll()
	 *        5. AuthController
	 *           /auth
	 *           /login  -- loginuser object entity class  -- 
	 *           username -- passowrd 
	 *           validate the users      
	 *          
	 *          
	 *          
	 *          My DCU application   -- 8080
	 *           // customers
	 *          
	 *          My Chase Service -- 8081
	 *            //getcustomer list 
	 *           
	 *           
	 *          define ports in applicaiont.properties
	 *          
	 *          
	 *          
	 *          Rest Templete 
	 *          
	 *          The communication between multiple service of spring boot applicaions we call it as sync / async
	 *          
	 *          sync 
	 *          --RestTemplete   --- simple entity 
	 *          --Webclient ---  library (Webflux) -- reactive way of rest template design -- entites -- Mono, 
	 *          
	 *          Async --  non blocking way 
	 *           
	 *          Kafka    -- lot of configuration
	 *          ActiveMQ  -- less configuration
	 *          RabbitMQ  -- 
	 *          
	 *          Publisher  -- publish the API calls
	 *          subscriber -- -- subscribe the data 
	 *          
	 *          
	 *          1. library added
	 *          2. configuration class
	 *          3. Rest tempate service   -- calling externaml service from service a to service b 
	 *          4. try hitting the API via controller 
	 *          
	 *          @configuration 
	 *          @bean 
	 *          RestTempate
	 *          
	 *          @WebClient 
	 *          
	 *          
	 *          service -- 
	 *          callExternamAPI -- 
	 *          string -- entire object 
	 *          url -- http://localhost:8080/callExternalMethod
	 *          
	 *          
	 *          
	 *          
	 *          
	 *          Spring boot applicaiton 
	 *          
	 *          Discover service -- localhost:8080/
	 *          chase_service  -- locahost: 9091
	 *          
	 *          Swagger  -- to view all the endpoints 
	 *          
	 *          Spring security -- USerDetailService     
	 *          
	 *          jwt authentication -- bearer token 
	 *          
	 *          Rest Template   -- sync 
	 *          
	 *          kafka -- async 
	 *          
	 *          
	 *          Eureka discover server -- health of the services
	 *          Eureka discover client -- 
	 *          spring cloud gateway -- global point to accesss the api's 
	 *          zipkin --  logging 
	 *          
	 *          
	 *          retry mechanism -- 
	 *          
	 *          logging mechanism  -- slf4j   // log4j
	 *          
	 *          logger  -- create object
	 *          
	 *          info
	 *          Debug
	 *          Error
	 *          
	 *          retry and what's circuit breaker
	 *          
	 *          
	 *          
	 *          
	 *          spring -cloud-starter-netflix
	 *          
	 *          @EnableEurekaServer
	 *          
	 *          --8761
	 *          
	 *          
	 *          @enableEurekaClient
	 *          
	 *          
	 *          
	 *          sping cloud registry 
	 *          
	 *          spring cloud starter gateway 
	 *          
	 *          
	 *          yaml
	 *          
	 *          spring 
	 *          cloud '
	 *          gateway 
	 *          routes 
	 *          --id :discover-service
	 *          url lb://discover-service
	 *          predicates 
	 *             -  path= /api/customers/**
	 *            --id : bofa-service
	 *          url lb://bofa-service
	 *          predicates 
	 *               -path=
	 *            --id 
	 *          url
	 *          predicates
	 *          
	 *          
	 *          
	 *          
	 *          Kafka -- Download 
	 *          
	 *          Core components 
	 *          
	 *          -- Producer  -- Sends  -- publish -- message to kafka topic   -- Async -- batch process 
	 *          -- Consumer --  Receive -- subscribe -- read message from kafka topic  -- Consumer group -- each mesaage is ready by one consumer with in a groupp
	 *          -- Topic -- each topic is split into multiple partitions -- to achive scalabilty and parallelism
	 *          -- Partition -- subset of topic   -- unique offset address easy to TRACK -- scale up with multiple brokers
	 *          -- Broker -- handles topics storage and p/c requests -- each broker is unique broker id  -- 
	 *          -- Zookeeper  -- distributed brokers -- maintains metadata for brokers 
	 *          -- Replication -- falut tolerance 
	 *          -- Consumer Group -- load balancing y only one memebr of the group 
	 *          
	 *          
	 *          
	 *          9092 is default port 
	 *          add library 
	 *          add properties 
	 *          create configuraion file 
	 *          create publisher / subscriber 
	 *          read and write data 
	 *          
	 *          
	 *          	<!-- Kafka -->
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>	


  kafka:
    bootstrap-servers: localhost:9092
    consumer:
      group-id: my-group
      auto-offset-reset: earliest
    producer:
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.apache.kafka.common.serialization.StringSerializer
    #consumer:
    #  key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
    #  value-deserializer: org.apache.kafka.common.serialization.StringDeserializer


produce we neeed to serializer to encrypt

consumer / read we need to deserializer and read the data 


@Configuraion



@KafkaListener  -- consumer 

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
	 *     *       1. library   -- kakfka 
	 *       2. properties   -- consumer, consumer group, seralizie and deserilize your objeescts  
	 *       3. config file 
	 *       4. producer and consumer 
	 *       5.
	 *       
	 *       
	 *       Database  concepts 
	 *       
	 *       Relation   -- SQL    -- MySQL, Oracle DB, PostgresSQL,  SQL Server
	 *       
	 *       primary key -- unique key or each table 
	 *       Foreign key   -- refernce key of a primary keu used in other tables
	 *       
	 *        --  Customer  -- customerId
	 *        -- Address -- addressId 
	 *        
	 *        == Foreign key
	 *        
	 *        
	 *        Alex   -- 1
	 *        
	 *        Texas -- 1000 
	 *        address -- cousterId (foreignkey) -- 2 
	 *        
	 *       
	 *       Non relational -- NOSQL   --    MongoDB  -- Document ,  DynamoDB - Key value , Cassandra -- column based  
	 *          
	 *          SQL BASIC  
	 *          
	 *          Create
	 *          Select 
	 *          Update   // Alter 
	 *          Delete  // Drop  
	 *          
	 *          1. DDL -- Data Definiation Language
	 *          Create, Alter, Drop 
	 *          
	 *          2.DML -- Data manipulation Langugage
	 *          Select, Insert, delete, Update
	 *          
	 *          3. DCL -- Data Control Language
	 *          GRANT, REVOKE
	 *          
	 *          4. TCL -- Transaction control Langiuage
	 *          Commit, Rollback   
	 *          
	 *          Joins 
	 *          
	 *          Inner  == matching rows 
	 *          Left  -- all the customer and matchoing address 
	 *          Right  -- all the addresses amnd maythching customers
	 *          FULL  --  sll rows and matched 
	 *          SELF  
	 *          
	 *          
	 *          Stroed proec
	 *          triggers
	 *       
	 *       
	 *         -- Filter acitve custoomers
	 *         --use AND oR NOT
	 *         -- IS null and Is not null  , sorting ot limit 
	 *         
	 *         
	 *       
	 *         select * from customer where status = 1 -- active 
	 *         select * from customer where status = 1 AND email  = 'test@gmail.com'  --     one employee if email is unique   
	 *         select * from customer where status = 1 OR email  = 'test@gmail.com'  --  active or email 
	 *         select * from customer where status = 1 AND NOT email  = 'test@gmail.com'  --  active customers and there email is different
	 *         
	 *         
	 *         select * from customer where email IS NOT NULL; -- all customers with email exists will be pulled 
	 *         
	 *          limit  for only few records 
	 *          
	 *          select * from customers order by customerid desc LIMIT 5 -- fetch all the records from table 
	 *         
	 *          SELECT TOP(5) from customers
	 *          
	 *          --  total transactions by each customer -- total_txns
	 *          
	 *          select COUNT(*) from transaction where customerid = 1  -- single 
	 *          UNION
	 *          select COUNT(*) from transaction GROUP BY customerid;   -- all the customer transactions
	 *          
	 *          select AVG(amount) from transaction; -- average amount 
	 *          
	 *          -- customer whose total amount is > 1000
	 *          
	 *          select SUM(amount) AS total  from transaction group by customerid HAVING total > 1000
	 *          
	 *          select DISTINCT txn_type from transaction;   -- unique records with out duplicaites 
	 *          
	 *          
	 *          customer
	 *          transaction
	 *          
	 *          Joins 
	 *          
	 *          -- Inner join 
	 *          
	 *          SELECT c.name, t.amount FROM customer c 
	 *          INNER JOIN transaction t ON  c.customerid = t.customerid;
	 *          
	 *          
	 *          SELECT c.name, t.amount FROM customer c 
	 *          LEFT JOIN transaction t ON  c.customerid = t.customerid;
	 *          
	 *          
	 *          SELECT c.name, t.amount FROM customer c 
	 *          RIGHT JOIN transaction t ON  c.customerid = t.customerid;
	 * 
	 *           
	 *           --sub query 
	 *           
	 *           SELECT name FROM customer WHERE customerid IN (SELECT customerid FROM transaction WHERE amount > 1000);  -- getting name of the customer
	 *           whose transaction is > 1000
	 * 
	 *            -- Trigger, transactions, views, stored procedures 
	 *            
	 *            
	 *            BEGIN transaction;
	 *            
	 *            Update customer set customername='a' wheere id =1;
	 *            
	 *            SAVEPOINT before_insert;
	 *            
	 *            Insert into transaction values ();
	 *            
	 *            ROLLBACK TO SAVEPOINT before_insert;
	 *            
	 *            COMMIT:
	 *            
	 *            
	 *            BEGIN TRIGGER;
	 *            
	 *            Update customer set customername='a' wheere id =1;
	 *            
	 *            SAVEPOINT before_insert;
	 *            
	 *            Insert into transaction values ();
	 *            
	 *            ROLLBACK TO SAVEPOINT before_insert;
	 *            
	 *            COMMIT:
	 * 
	 * 
	 * 
	 * 
	 *             VPC
EC2
S3
Lambda
Fargate — huge data
IAM
Security Groups
ECS
EKS
CodeDeploy 
CloudWatch
RDS.  — database postgresql, Dynamodb --



VPC — virtual private cloud
EC2 — instances Windows, 
Linux, Ubuntu

Instance types. — m2, m5, Cx, 

IAM — policies  — User management 
Security Groups — internal, external, 
Inbound and outbound access 
8080 , 3306, 5432, 9090, 8761 

S3 service — storage service data of any format
Aws s3 sdk or create lambda functions

AWS Lamba — serverless function — python, javascript — auto triggers the jobs 
Manager the stroage


ECS — Linux 
You can maintain mupltiple applications insigne ECS with different instance servers

Docker —  blue and green strategoy 

Cloudwatch — service monitor your environment 
Huge
OOM
Slow shutter down 
Logs 


CodeDeploy — take your application from local and deploy it to EC2 ECS EKS 
	 *    
	 *    
	 *    
	 *    Upload data to RDS Database / S3 using AWS lambda 
	 *    
	 *     
	 *     
	 *     1. dependency
	 *     2. properties 
	 *     3. Configuration class
	 *     4. Service class
	 *     
	 *     
	 *     
	 *     EC2 instances you will get .pem file as a key 
	 *     
	 *     
	 *   To connect to EC2 instance via Remote Desktop Connection 
	 *   Using Mac Shell --- pass string
	 *   Putty
	 *   
	 *   instance pem fath username password --- linux / ubuntu
	 *   hostname
	 *   username
	 *   password 
	 *   
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/*
	 * 
	 *   gitbash installl
	 *   
	 *   git clone https://
	 *   
	 *   cd discover_service
	 *   
	 *   git checkout feature/ramesh
	 *   
	 *   import the project into eclipse
	 * 
	 * 
	 * 
	 *   Address  -- ganesh
	 *   
	 *      addressId
	 *      lane
	 *      city
	 *      state
	 *      zipcode
	 *      status
	 *   
	 *   
	 *   Transaction  -- bhargavi  
	 *      transactionId
	 *      transactionType
	 *      datetime
	 *      amount
	 *      branchCode
	 *   
	 *   Accounts  -- harika  -- intro
	 *     accountId
	 *     accountNumber
	 *     accountType
	 *     balance
	 *     createdDate
	 *     status
	 *   
	 *   Employees -- harsha
	 *     employeeId;
			firstName;
			lastName;
			address;
			email;
			phoneNumber;
			gender;
			status;
	 *    
	 *   Branches  -- srihari
	 *    branchId
	 *    branchName
	 *    branchManager
	 *    branchCode
	 *    timings
	 *    status
	 *   
	 *   Services  -- keerthi
	 *   
	 *    serviceId;
	 *    lendingServices
	 *    retailService
	 *    digitalService
	 *    createdDate
	 *    status
	 *   
	 *   Documents  -- lokesh
	 *     documentId
	 *     documentType
	 *     issueDate
	 *     status
	 *     
	 *   Cards -- sathya
	 *     cardId
	 *     cardType
	 *     issueDate
	 *     expiryDate
	 *     cardLimit
	 *     status
	 *   
	 *   Loans --  dinesh
	 *      lonaId
	 *      LonaType
	 *      creditScore
	 *      loanAmount
	 *      apr
	 *      loanDate
	 *      status
	 *      
	 *   support -- srinath
	 *         supportId
	 *         customerName
	 *         description
	 *         createdDate
	 *         status
	 *   
	 *    rewards -- vijaya
	 *      rewardsId
	 *      rewardsName
	 *      rewardsPoints
	 *      issueDate
	 *      status
	 *    
	 *    category -- vamshi  -- spending category
	 *      categoryId
	 *      categoryType
	 *      date
	 *      status
	 *      
	 *    
	 *     payments -- tilak
	 *        paymentId
	 *        paymentMode 
	 *        datetime
	 *        status
	 *     
	 *   
	 *     --- sai -- entity
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

}

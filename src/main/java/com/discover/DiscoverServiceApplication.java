package com.discover;

import com.discover.entity.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // annotation
public class DiscoverServiceApplication {

	public static void main(String[] args) {
		 
		System.out.println("Hello Team ");
		
//		Employees x = new Employees((long)1, "Thor", "Son of Odin", "255 heaven dr asgard", 
//				"odinson@gmail.com", (long)0000000000, "Male", "Active");
//		
//		System.out.println(x.toString());
//		x.setPhoneNumber((long)1987676769);
//		System.out.println(x.getPhoneNumber());
//		
		m1();
		SpringApplication.run(DiscoverServiceApplication.class, args);
	}
	
	
	public static void m1() {
		System.out.println("Hello Team 2 ");

	}

}


//

/*


public class classname{
   
   
   public -- access specifier
   static -- key word
   void -- return type of method 
   main -- name 
   method signature (string)
   method body 
   
     
}

  
*/
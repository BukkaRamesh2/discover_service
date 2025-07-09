package com.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // annotation
public class DiscoverServiceApplication {

	public static void main(String[] args) {
		 
		System.out.println("Hello Team ");
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
   void -- retyurn type of method 
   main -- name 
   method signature (string)
   method body 
   
     
}

  
*/
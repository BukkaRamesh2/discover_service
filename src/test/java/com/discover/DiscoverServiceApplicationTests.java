package com.discover;
import com.discover.entity.Address;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiscoverServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	public static void main(String a[])
	{
		Address addr = new Address(1, "MG Road", "Hyderabad", "Telangana", "500081", "Active");
		System.out.println("City: " + addr.getCity());
        addr.setCity("Warangal");
        System.out.println("Updated City: " + addr.getCity());
	}

}

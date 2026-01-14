package com.discover.util;

public class BaseAddress extends AbstractAddress 
{
    private int addressId;
    private String lane;
    private String city;
    private String state;
    private String zipcode;
    private String status;

    
    // Demo of Constructor Overloading
    //no-args constructor
    public BaseAddress() 
    {
    	// calls parameterized constructor
        this(0, "", "", "", "", "inactive");
    }

    // constructor with argumnts - parameterized constructor
    public BaseAddress(int addressId, String lane, String city, String state, String zipcode, String status) 
    {
        this.addressId = addressId;
        this.lane = lane;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.status = status;
    }

    // Demo of Encapsulation using Getters and Setters
    public int getAddressId() 
    { 
    	return addressId; 
    }
    public void setAddressId(int addressId) 
    { 
    	this.addressId = addressId; 
    }

    public String getLane() 
    { 
    	return lane; 
    }
    public void setLane(String lane) 
    { 
    	this.lane = lane; 
    }

    public String getCity() 
    { 
    	return city; 
    }
    public void setCity(String city) 
    { 
    	this.city = city; 
    }

    public String getState() 
    { 
    	return state; 
    }
    public void setState(String state) 
    { 
    	this.state = state;
    }

    public String getZipcode() 
    { 
    	return zipcode; 
    }
    // demo of if-else by zip code validation
    public void setZipcode(String zipcode) 
    {
    	// matching zip code with 5 digits
        if (zipcode.matches("\\d{5}")) 
        {
            this.zipcode = zipcode;
        } 
        else 
        {
            System.out.println("Invalid ZIP code format!");
        }
    }

    public String getStatus() 
    { 
    	return status; 
    }
    public void setStatus(String status) 
    { 
    	this.status = status; 
    }

    // Method Overriding
    // annotation for typo purpose
    @Override
    public void validate() 
    {
        if (lane.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty()) 
        {
            System.out.println("Validation Failed: Incomplete address.");
        } 
        else 
        {
            System.out.println("Address is valid.");
        }

        if (status.equalsIgnoreCase("active")) 
        {
            System.out.println("Status: Active");
        } 
        else 
        {
            System.out.println("Status: Inactive");
        }
        // simple demo of switch case
        switch (state.toUpperCase()) 
        {
            case "CA": System.out.println("Region: West"); 
            		break;
            case "NY": System.out.println("Region: East"); 
            		break;
            default: System.out.println("Region: Unknown");
        }
    }

    @Override
    public void printFullAddress() 
    {
        System.out.println("Address ID: " + addressId);
        System.out.println(lane + ", " + city + ", " + state + " - " + zipcode + " [" + status + "]");
        
        // demo of for each loop by printing the characters of city
        System.out.print("City characters: ");
        for (char ch : city.toCharArray()) 
        {
            System.out.print(ch + " ");
        }
        
        System.out.println();
    }
}

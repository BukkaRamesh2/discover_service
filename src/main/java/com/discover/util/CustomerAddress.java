package com.discover.util;

public class CustomerAddress extends BaseAddress 
{
    private String addressType;

    public CustomerAddress(int id, String lane, String city, String state, String zip, String status, String type) 
    {
        super(id, lane, city, state, zip, status);
        this.addressType = type;
    }

    public String getAddressType() 
    { 
    	return addressType; 
    }
    public void setAddressType(String type)
    {
        if (type.equalsIgnoreCase("home") || type.equalsIgnoreCase("work")) 
        {
            this.addressType = type;
        }
        else 
        {
            System.out.println("Invalid type : Use 'home' or 'work'");
        }
    }

    @Override
    public void printFullAddress() 
    {
        System.out.println("Customer " + addressType + " Address:");
        super.printFullAddress();
    }
}

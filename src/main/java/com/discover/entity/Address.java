package com.discover.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address 
{
	/* addressId
	 *      lane
	 *      city
	 *      state
	 *      zipcode
	 *      status
	*/
	//instance variables of Address class
	@Id
	private int addressId;
	private String lane;
	private String city;
	private String state;
	private String zipcode;
	private String status;
	
	
	//constructor for initializing instance variables
	public Address(int addressID, String lane, String city,String state,String zipcode, String status)
	{
		this.addressId = addressId;
        this.lane = lane;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.status = status;
	}
	
	
	public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
	
	
	
}

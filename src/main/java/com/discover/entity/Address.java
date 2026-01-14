package com.discover.entity;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String lane;
	private String city;
	private String state;
	private String zipcode;
	private String status;
	@Version
	private Integer version; // Used for optimistic locking
	
	public Integer getVersion() {
		return version;
	}


	public void setVersion(Integer version) {
		this.version = version;
	}


	//constructor for initializing instance variables
	public Address(Long addressID, String lane, String city,String state,String zipcode, String status)
	{
		this.addressId = addressId;
        this.lane = lane;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.status = status;
	}
	public Address()
	{
		
	}
	
	public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
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

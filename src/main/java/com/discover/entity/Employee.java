package com.discover.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee implements Comparable<Employee>{
	/*Employee -- harsha
	      employeeId;
			firstName;
			lastName;
			address;
			email;
			phoneNumber;
			gender;
			status;
	*/
	
//	Encapsulation - hiding data by making it private
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeID;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private Long phoneNumber;
	private String gender;
	private String status;
	
	
	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
		
	}
	
	public Long getEmployeeID() {
		return this.employeeID;
				
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public String getAddress() {
		return this.address;
	
	}
	public void setEmail(String email) {
		this.email = email;

	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
		
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	
//	method overriding - overrides toString method from the object class
	@Override
	public String toString() {
		return "Employee{" +
				"Employee ID=" + employeeID +
	            ", First Name = '" + firstName + '\'' +
	            ", Last Name = '" + lastName + '\'' +
	            ", Address = '" + address + '\'' +
	            ", Email = '" + email + '\'' +
	            ", Phone Number = " + phoneNumber +
	            ", Gender = '" + gender + '\'' +
	            ", Status = '" + status + '\'' +
	            '}';
	}
	
	@Override
	public int compareTo(Employee other){
		return this.employeeID.compareTo(other.employeeID);
	}
	

}

package com.discover.entity;

public class Employees {
	/*Employees -- harsha
	      employeeId;
			firstName;
			lastName;
			address;
			email;
			phoneNumber;
			gender;
			status;
	*/
	private int employeeID;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phoneNumber;
	private String gender;
	private String status;
	
	public Employees() {
		
	}
	
	public Employees(int employeeID, String firstName, String lastName, 
					String address, String email, String phoneNumber, String gender, 
					String status) {
		
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.status = status;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
		
	}
	
	public int getEmployeeID() {
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
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
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
	
	@Override
	public String toString() {
		return "Employees{" +
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

}

package com.discover.entity;

// Abstract Class - Abstraction
abstract class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String gender;
    private String status;

    // Constructor
    public User(String firstName, String lastName, String email, String phoneNumber, String gender, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.status = status;
    }

    // Encapsulation
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // Abstract Method
    public abstract void displayRole();
}

// Inheritance 
public class Customer extends User {
    private int customerID;
    private String address;

    // Constructor
    public Customer(int customerID, String firstName, String lastName, String email, String phoneNumber, String gender, String status, String address) {
        super(firstName, lastName, email, phoneNumber, gender, status);
        this.customerID = customerID;
        this.address = address;
    }

    // Encapsulation
    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Polymorphism 
    @Override
    public void displayRole() {
        System.out.println("Role: Customer");
    }

    public void checkStatusAndBenefits() {
        String status = getStatus();

        if ("Active".equalsIgnoreCase(status)) {
            System.out.println("Customer is active and eligible for rewards.");
        } else if ("Pending".equalsIgnoreCase(status)) {
            System.out.println("Customer verification is pending.");
        } else {
            System.out.println("Customer is inactive.");
        }

        
        switch (getGender().toLowerCase()) {
            case "male":
                System.out.println("Welcome Mr. " + getLastName());
                break;
            case "female":
                System.out.println("Welcome Ms. " + getLastName());
                break;
            default:
                System.out.println("Welcome " + getFirstName() + " " + getLastName());
        }
    }
}


class Utils {
    public int calculateRewardPoints(int transactions) {
        return transactions * 10;
    }

    public int calculateRewardPoints(int transactions, int multiplier) {
        return transactions * multiplier;
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(101, "John", "Doe", "john.doe@example.com", "1234567890", "Male", "Active", "123 Main St");

        System.out.println("Customer ID: " + cust.getCustomerID());
        System.out.println("Name: " + cust.getFirstName() + " " + cust.getLastName());
        System.out.println("Email: " + cust.getEmail());
        System.out.println("Address: " + cust.getAddress());

        cust.displayRole();

        cust.checkStatusAndBenefits();

        Utils util = new Utils();
        System.out.println("Reward Points (default): " + util.calculateRewardPoints(5));
        System.out.println("Reward Points (custom multiplier): " + util.calculateRewardPoints(5, 20));
    }
}

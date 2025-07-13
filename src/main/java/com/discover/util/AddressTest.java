package com.discover.util;
import java.util.*;

public class AddressTest
{
    public static void main(String[] args) 
    {
    	
    	
    	// storing objects using arraylist
    	List<CustomerAddress> customerAddresses = new ArrayList<>();
        List<BranchAddress> branchAddresses = new ArrayList<>();

        // -------------------- Customer Addresses --------------------
        customerAddresses.add(new CustomerAddress(101, "45 Elm St", "Dallas", "TX", "75201", "Active", "Home"));
        customerAddresses.add(new CustomerAddress(102, "99 Oak Ave", "Austin", "TX", "73301", "Active", "Work"));
        customerAddresses.add(new CustomerAddress(103, "10 Main Blvd", "Houston", "TX", "77001", "Inactive", "Home"));
        customerAddresses.add(new CustomerAddress(104, "12 Pine Street", "Dallas", "TX", "75202", "Active", "Work"));
        customerAddresses.add(new CustomerAddress(105, "500 Maple Ave", "San Antonio", "TX", "78205", "Inactive", "Home"));
        customerAddresses.add(new CustomerAddress(106, "1 River Rd", "El Paso", "TX", "79901", "Active", "Home"));
        customerAddresses.add(new CustomerAddress(107, "400 Canyon Pkwy", "Fort Worth", "TX", "76102", "Active", "Work"));
        customerAddresses.add(new CustomerAddress(108, "88 Hilltop Dr", "Arlington", "TX", "76010", "Inactive", "Work"));
        customerAddresses.add(new CustomerAddress(109, "33 Sunset Blvd", "Plano", "TX", "75023", "Active", "Home"));
        customerAddresses.add(new CustomerAddress(110, "777 Lone Star Ln", "Irving", "TX", "75038", "Active", "Work"));
        customerAddresses.add(new CustomerAddress(111, "900 Tech Ridge Blvd", "Austin", "TX", "73301", "Inactive", "Home"));
        customerAddresses.add(new CustomerAddress(112, "22 Coastal Way", "Corpus Christi", "TX", "78401", "Active", "Work"));
        customerAddresses.add(new CustomerAddress(113, "100 Market St", "San Francisco", "CA", "94105", "Active", "Home"));
        customerAddresses.add(new CustomerAddress(114, "500 Broadway", "Los Angeles", "CA", "90001", "Inactive", "Work"));
        customerAddresses.add(new CustomerAddress(115, "777 Wall St", "New York", "NY", "10005", "Active", "Work"));
        customerAddresses.add(new CustomerAddress(116, "123 Empire Blvd", "Buffalo", "NY", "14201", "Inactive", "Home"));

        // -------------------- Branch Addresses --------------------
        branchAddresses.add(new BranchAddress(201, "1 Bank Lane", "Chicago", "IL", "60601", "Active", 3001));
        branchAddresses.add(new BranchAddress(202, "2 Finance St", "New York", "NY", "10001", "Inactive", 3002));
        branchAddresses.add(new BranchAddress(203, "3 Loan Rd", "San Diego", "CA", "92101", "Active", 3003));
        branchAddresses.add(new BranchAddress(204, "4 Savings Ave", "Austin", "TX", "73301", "Active", 3004));
        branchAddresses.add(new BranchAddress(205, "5 Vault Blvd", "Dallas", "TX", "75201", "Inactive", 3005));
        
        
        
        
     // -------------------- Printing all Customer Addresses --------------------
        System.out.println("=== All Customer Addresses ===");
        for (CustomerAddress addr : customerAddresses) {
            addr.validate();
            addr.printFullAddress();
            System.out.println();
        }

        // -------------------- Printing all Branch Addresses --------------------
        System.out.println("=== All Branch Addresses ===");
        for (BranchAddress branch : branchAddresses) {
            branch.validate();
            branch.printFullAddress();
            branch.notifyBranch();
            System.out.println();
        }
        
        
        //Demo of Tree Set - printing unique zip codes in sorting order
        TreeSet<String>  zipcodes = new TreeSet<String>();
        
        for (CustomerAddress addr : customerAddresses) 
        {
            zipcodes.add(addr.getZipcode());
            
        }
        System.out.println("\n=== Unique zipcodes sorted using TreeSet ===");
        for(String t: zipcodes)
        {
        	System.out.println(t);
        }

        
        // Demo of Hash map - mapping customers address state wise
        HashMap<String, List<CustomerAddress>> customersByState = new HashMap<>();
        for (CustomerAddress addr : customerAddresses) 
        {
            customersByState.putIfAbsent(addr.getState(), new ArrayList<>());
            customersByState.get(addr.getState()).add(addr);
        }

        System.out.println("\n=== Customers Grouped by State using HashMap ===");
        for (Map.Entry<String, List<CustomerAddress>> entry : customersByState.entrySet()) 
        {
            System.out.println("State: " + entry.getKey());
            for (CustomerAddress addr : entry.getValue()) 
            {
                System.out.println(" - " + addr.getCity() + " [" + addr.getZipcode() + "] (" + addr.getStatus() + ")");
            }
        }
           
    }
}

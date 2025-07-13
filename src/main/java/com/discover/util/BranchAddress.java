package com.discover.util;

public class BranchAddress extends BaseAddress 
{
    private int branchCode;

    public BranchAddress(int id, String lane, String city, String state, String zip, String status, int branchCode) 
    {
        super(id, lane, city, state, zip, status);
        this.branchCode = branchCode;
    }

    public int getBranchCode() 
    { 
    	return branchCode; 
    }
    public void setBranchCode(int branchCode) 
    { 
    	this.branchCode = branchCode; 
    }

    @Override
    public void printFullAddress() 
    {
        System.out.println("Branch Address - Code: " + branchCode + ":-");
        super.printFullAddress();
    }

    public void notifyBranch() 
    {
        int i = 0;
        while (i < 3) 
        {
            System.out.println("Notification " + (i + 1) + " sent to branch.");
            i++;
        }
    }
}

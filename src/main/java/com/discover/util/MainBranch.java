package com.discover.util;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MainBranch implements ModelBranch {
	private int branchId;
	private String branchName;
	private String branchManager;
	private String branchCode;
	private int timings;
	private String status;
	private String contact;
	
	// Method Overloading
	public MainBranch(int branchId, String branchName, String branchManager, String branchCode, int timings,String status,String contact)
	{
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchManager = branchManager;
		this.branchCode = branchCode;
		this.timings = timings;
		this.status = status;
		this.contact = contact;
	}
	
	public MainBranch() {
		super();
	}
	
	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchManager() {
		return branchManager;
	}
	public void setBranchManager(String branchManager) {
		this.branchManager = branchManager;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchCode(){
		return branchCode;
	}

	public void setTimings(int timings) {
		this.timings = timings;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Override
	public String getTimings() {
		LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String day = dayOfWeek.toString().toLowerCase();
        
        String res;
        switch(day)
        {
        	case "monday":
	        	res="Today this branch "+branchName+"-"+branchCode+" is open from 9AM to 5PM";
	        	break;
        	case "tuesday":
        		res="Today this branch "+branchName+"-"+branchCode+" is open from 9AM to 5PM";
	        	break;
        	case "wednesday":
        		res="Today this branch "+branchName+"-"+branchCode+" is open from 9AM to 5PM";
	        	break;
        	case "thursday":
        		res="Today this branch "+branchName+"-"+branchCode+" is open from 9AM to 5PM";
	        	break;
        	case "friday":
        		res="Today this branch "+branchName+"-"+branchCode+" is open from 9AM to 3PM";
	        	break;
        	default:
        		res="On Saturday/Sunday the branch "+branchName+"-"+branchCode+" is closed.\n please call to customer care for more assitance";
        		this.branchCode="Inactive";
	        	break;
        }
        
		return res;
	}
	
	@Override
	public String getBranchCodeName() {
		
		return branchCode + "-"+branchName;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchManager=" + branchManager
				+ ", branchCode=" + branchCode + ", timings=" + timings + ", status=" + status + "]";
	}


	@Override
	public int knowOpenClose() {
		LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String day = dayOfWeek.toString().toLowerCase();
        if(day=="Saturday" || day =="Sunday")
        {
        	return 0;
        }
		return 1;
	}

}

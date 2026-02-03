package com.discover.util;

import java.time.DayOfWeek;
import java.time.LocalDate;

// Inheritance
public class SubBranch extends MainBranch {
	private int subBranchId;
	private String subbranchName;
	private int subtimings;
	
	public SubBranch(int branchId, String branchName, String branchManager, String branchCode, int timings,
			String status, String contact, int subBranchId, String subbranchName, int subtimings) {
		super(branchId, branchName, branchManager, branchCode, timings, status, contact);
		this.subBranchId = subBranchId;
		this.subbranchName = subbranchName;
		this.subtimings = subtimings;
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
	        	res="Today this branch "+subbranchName+"-"+getBranchCode()+" is open from 9AM to 3PM";
	        	break;
        	case "tuesday":
        		res="Today this branch "+subbranchName+"-"+getBranchCode()+" is open from 9AM to 3PM";
	        	break;
        	case "wednesday":
        		res="Today this branch "+subbranchName+"-"+getBranchCode()+" is open from 9AM to 3PM";
	        	break;
        	case "thursday":
        		res="Today this branch "+subbranchName+"-"+getBranchCode()+" is open from 9AM to 3PM";
	        	break;
        	case "friday":
        		res="Today this branch "+subbranchName+"-"+getBranchCode()+" is open from 9AM to 2PM";
	        	break;
        	default:
        		res="On Saturday/Sunday the branch "+subbranchName+"-"+getBranchCode()+" is closed.\n please call to customer care for more assitance";
        		setBranchCode("Inactive");
	        	break;
        }
        
		return res;
	}


	public int getSubBranchId() {
		return subBranchId;
	}


	public void setSubBranchId(int subBranchId) {
		this.subBranchId = subBranchId;
	}


	public String getSubbranchName() {
		return subbranchName;
	}


	public void setSubbranchName(String subbranchName) {
		this.subbranchName = subbranchName;
	}


	public int getSubtimings() {
		return subtimings;
	}


	public void setSubtimings(int subtimings) {
		this.subtimings = subtimings;
	}

}

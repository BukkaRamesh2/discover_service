package com.discover.entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.DayOfWeek;


@Entity
public class Branch {
	
	@Id
	private int branchId;
	private String branchName;
	private String branchManager;
	private String branchCode;
	private int timings;
	private String status;
	private String contact;
	
	public Branch(int branchId, String branchName, String branchManager, String branchCode, int timings,String status,String contact)
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
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public int getTimings() {
		return timings;
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
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchManager=" + branchManager
				+ ", branchCode=" + branchCode + ", timings=" + timings + ", status=" + status + "]";
	}



	
}

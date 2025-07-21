package com.discover.entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long branchId;
	private String branchName;
	private String branchManager;
	private String branchCode;
	private int timings;
	private String status;
	private String contact;
	
	@Version
	private Integer version;
	
	public Branch()
	{
		
	}
	
	public Branch(Long branchId, String branchName, String branchManager, String branchCode, int timings,String status,String contact)
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
	
	
	public Long getBranchId() {
		return branchId;
	}
	public void setBranchId(Long branchId) {
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
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
}

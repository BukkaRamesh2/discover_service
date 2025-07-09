package com.discover.entity;

import java.time.LocalDate;

public class Services {
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getLendingService() {
		return lendingService;
	}
	public void setLendingService(String lendingService) {
		this.lendingService = lendingService;
	}
	public String getRetailService() {
		return retailService;
	}
	public void setRetailService(String retailService) {
		this.retailService = retailService;
	}
	public String getDigitalService() {
		return digitalService;
	}
	public void setDigitalService(String digitalService) {
		this.digitalService = digitalService;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String serviceId;
	private String lendingService; // loan or credit
	private String retailService; // accounts or cards or ATMS
	private String digitalService; // Mobile apps or internet banking
	private LocalDate createdDate;
	private String status; // ACTIVE or INACTIVE
	
}

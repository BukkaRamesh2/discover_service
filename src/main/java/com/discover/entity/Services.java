package com.discover.entity;

import java.time.LocalDate;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Services {
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
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
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long serviceId;
	private String lendingService; // loan or credit
	private String retailService; // accounts or cards or ATMS
	private String digitalService; // Mobile apps or internet banking
	private LocalDate createdDate;
	private String status; // ACTIVE or INACTIVE
	
}

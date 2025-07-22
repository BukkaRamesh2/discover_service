package com.discover.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Documents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long documentid ;
	private String documenttype ;
	private Date issuedate ;
	private String status;
	private Date expirydate;
	
	@Version
	private Integer version; // Used for optimistic locking
	
	public Documents() { }
	
	public Long getDocumentid() {
		return documentid;
	}
	public Documents(Long documentid, String documenttype, Date issuedate, String status, Date expirydate) {
		super();
		this.documentid = documentid;
		this.documenttype = documenttype;
		this.issuedate = issuedate;
		this.status = status;
		this.expirydate = expirydate;
	}
	

	
	public String toString() {
		return "Documents [documentid=" + documentid + ", documenttype=" + documenttype + ", issuedate=" + issuedate
				+ ", status=" + status + ", expirydate=" + expirydate + "]";
	}
	public void setDocumentid(Long documentid) {
		this.documentid = documentid;
	}
	public String getDocumenttype() {
		return documenttype;
	}
	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}
	public Date getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	 
	

}

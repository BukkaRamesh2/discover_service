package com.discover.entity;

public class Documents {
	private int documentid ;
	private String documenttype ;
	private int issuedate ;
	private String status;
	private int expirydate;
	
	public int getDocumentid() {
		return documentid;
	}
	public Documents(int documentid, String documenttype, int issuedate, String status, int expirydate) {
		super();
		this.documentid = documentid;
		this.documenttype = documenttype;
		this.issuedate = issuedate;
		this.status = status;
		this.expirydate = expirydate;
	}
	@Override
	public String toString() {
		return "Documents [documentid=" + documentid + ", documenttype=" + documenttype + ", issuedate=" + issuedate
				+ ", status=" + status + ", expirydate=" + expirydate + "]";
	}
	public void setDocumentid(int documentid) {
		this.documentid = documentid;
	}
	public String getDocumenttype() {
		return documenttype;
	}
	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}
	public int getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(int issuedate) {
		this.issuedate = issuedate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(int expirydate) {
		this.expirydate = expirydate;
	}
	 
	

}

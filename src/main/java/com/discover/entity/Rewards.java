package com.discover.entity;

import java.time.LocalDate;

public class Rewards {

	//encapsulation
	private long rewardsId; 
	private String rewardsName;
	private int rewardsPoints;
    private LocalDate issueDate;
	private String status;

	
    public Rewards() {
		super();
	}

	public Rewards(long rewardsId, String rewardsName, int rewardsPoints, LocalDate issueDate, String status) {
        this.rewardsId = rewardsId;
        this.rewardsName = rewardsName;
        this.rewardsPoints = rewardsPoints;
        this.issueDate = issueDate;
        this.status = status;
    }

    public long getRewardsId() {
        return rewardsId;
    }

    public void setRewardsId(long rewardsId) {
        this.rewardsId = rewardsId;
    }

    public String getRewardsName() {
        return rewardsName;
    }

    public void setRewardsName(String rewardsName) {
        this.rewardsName = rewardsName;
    }

    public int getRewardsPoints() {
        return rewardsPoints;
    }

    public void setRewardsPoints(int rewardsPoints) {
        this.rewardsPoints = rewardsPoints;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}



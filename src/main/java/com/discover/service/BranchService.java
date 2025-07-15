package com.discover.service;

import java.util.List;

import com.discover.entity.Branch;

public interface BranchService {

	public Branch addBranch(Branch brh);
	public Branch getBranch(Long Id);
	public List<Branch> getAllBranches();
	public Branch updateBranch(Branch brh);
}

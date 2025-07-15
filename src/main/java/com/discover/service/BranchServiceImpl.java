package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.entity.Branch;
import com.discover.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService{
	
	@Autowired
	BranchRepository brhRepo;
	
	@Override
	public Branch addBranch(Branch brh)
	{
		return brhRepo.save(brh);
	}
	
	@Override
	public Branch getBranch(Long Id)
	{
		return brhRepo.getById(Id);
	}
	
	@Override
	public List<Branch> getAllBranches()
	{
		return brhRepo.findAll();
	}
	
	@Override
	public Branch updateCustomer(Branch brh)
	{
		return brhRepo.save(brh);
	}

}

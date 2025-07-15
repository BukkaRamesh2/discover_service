package com.discover.controller;

import com.discover.entity.Branch;
import com.discover.service.BranchService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class BranchController {

	@Autowired
	BranchService brhService;
	
	@PostMapping("/addBranch")
	public Branch addBranch(@RequestBody Branch brh)
	{
		return brhService.addBranch(brh);
	}
	
	@GetMapping("/getBranch/{branchId}")
	public Branch getBranch(@PathParam("branchID") Long branchID)
	{
		return brhService.getBranch(branchID);
	}
	
	@GetMapping("/getAllBranches")
	public List<Branch> getAllBranch()
	{
		return brhService.getAllBranches();
	}
	
	@PutMapping("/updateBranch")
	public Branch updateBranch(@RequestBody Branch brh)
	{
		return brhService.updateCustomer(brh);
	}
	
	@DeleteMapping("/deleteBranch/{branchID}")
	public void deleteBranch()
	{
		
	}
}

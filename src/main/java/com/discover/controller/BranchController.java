package com.discover.controller;

import com.discover.entity.Branch;
import com.discover.service.BranchService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/branch")
@Tag(name = "Branch API", description = "Operations related to Branches")
public class BranchController {

	@Autowired
	BranchService brhService;
	
	@GetMapping("/getAllBranches")
	@Operation(summary = "Get all Branches")
	public List<Branch> getAllBranches()
	{
		return brhService.getAllBranches();
	}
	
	@GetMapping("/getBranch/{branchID}")
	@Operation(summary = "Get Branch by ID")
	public ResponseEntity<Branch> getBranch(@PathParam("branchID") Long branchID)
	{
		Branch branch = brhService.getBranch(branchID);
		return ResponseEntity.ok(branch);
	}
	
	
	
	@PostMapping("/addBranch")
	@Operation(summary = "Add Branch")
	public ResponseEntity<Branch> addBranch(@RequestBody Branch brh)
	{
		Branch branch_to_save = brhService.addBranch(brh);
		return new ResponseEntity<>(branch_to_save, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/updateBranch")
	@Operation(summary = "Update Branch")
	public ResponseEntity<Branch> updateBranch(@RequestBody Branch brh)
	{
		Branch to_update = brhService.updateBranch(brh);
		return ResponseEntity.ok(to_update);
	}
	
	@DeleteMapping("/deleteBranch/{branchID}")
	@Operation(summary = "Delete Branch by ID")
	public ResponseEntity<Void> deleteBranch(@PathParam("branchID") Long branchID)
	{
		brhService.deleteBranch(branchID);
		return ResponseEntity.noContent().build();
	}
}

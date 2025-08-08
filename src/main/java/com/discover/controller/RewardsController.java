package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Customer;
import com.discover.entity.Rewards;
import com.discover.service.RewardsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/rewards")
@Tag(name = "Rewards API", description = "Operations related to rewards")
public class RewardsController {
	
	@Autowired
	RewardsService rewardService;
	
	@PostMapping("/addRewards")
	@Operation(summary = "Get all rewards")
	public Rewards addRewards(@RequestBody Rewards rewards){
		return rewardService.addRewards(rewards);
		
	}
	
	@GetMapping("/getRewards/{rewardsId}")
	@Operation(summary = "Get reward by ID")
	public Rewards getRewards(@PathVariable("rewardsId") Long rewardsId){
		return rewardService.getRewards(rewardsId);
	}
	
	@GetMapping("/getAllRewards")
	@Operation(summary = "Get all rewards")
	public List<Rewards> getAllRewards(){
		return rewardService.getAllRewards();
	}
	
	@PutMapping("/updateRewards")
	@Operation(summary = "update rewards")
	public Rewards updateRewards(@RequestBody Rewards rewards) {
		return rewardService.updateRewards(rewards);
	}
	
	@DeleteMapping("/deleteRewards/{rewardsId}")
	@Operation(summary = "delete rewards")
	public void deleteRewards(@PathVariable("rewardsId") Long rewardsId) {
		 rewardService.deleteRewards(rewardsId);
	}

}

package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Customer;
import com.discover.entity.Rewards;
import com.discover.service.RewardsService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/rewards")
public class RewardsController {
	
	@Autowired
	RewardsService rewardService;
	
	@PostMapping("/addRewards")
	public Rewards addRewards(@RequestBody Rewards rewards){
		return rewardService.addRewards(rewards);
		
	}
	
	@GetMapping("/getRewards/{rewardsId}")
	public Rewards getRewards(@PathParam("rewardsId") Long rewardsId){
		return rewardService.getRewards(rewardsId);
	}
	
	@GetMapping("/getAllRewards")
	public List<Rewards> getAllRewards(){
		return rewardService.getAllRewards();
	}
	
	@PutMapping("/updateRewards")
	public Rewards updateRewards(@RequestBody Rewards rewards) {
		return rewardService.updateRewards(rewards);
	}
	
	@DeleteMapping("/deleteRewards/{rewardId}")
	public void deleteRewards(@PathParam("rewardsId") Long rewardsId) {
		 rewardService.deleteRewards(rewardsId);
	}

}

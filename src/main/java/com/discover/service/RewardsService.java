package com.discover.service;

import java.util.List;

import com.discover.entity.Rewards;

public interface RewardsService {
	
	public Rewards addRewards(Rewards rewards);

	public Rewards getRewards(Long Id); 

	public List<Rewards> getAllRewards();

	public Rewards updateRewards(Rewards rewards);
	
	public void deleteRewards(Long Id);
}

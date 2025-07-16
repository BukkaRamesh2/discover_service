package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.discover.entity.Rewards;
import com.discover.repository.RewardsRepository;

public class RewardsServiceImpl implements RewardsService{

	@Autowired
	RewardsRepository rewardRepo;
	
	@Override
	public Rewards addRewards(Rewards rewards) {
		// TODO Auto-generated method stub
		return rewardRepo.save(rewards);
	}

	@Override
	public Rewards getRewards(Long Id) {
		// TODO Auto-generated method stub
		return rewardRepo.getById(Id);
	}

	@Override
	public List<Rewards> getAllRewards() {
		// TODO Auto-generated method stub
		return rewardRepo.findAll();
	}

	@Override
	public Rewards updateRewards(Rewards rewards) {
		// TODO Auto-generated method stub
		return rewardRepo.save(rewards);
	}

	@Override
	public void deleteRewards(Long Id) {
		// TODO Auto-generated method stub
		rewardRepo.deleteById(Id);
	}

}

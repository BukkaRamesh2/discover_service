package com.discover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discover.entity.Rewards;

@Repository
public interface RewardsRepository extends JpaRepository<Rewards, Long>{

}

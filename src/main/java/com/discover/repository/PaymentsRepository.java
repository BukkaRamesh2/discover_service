package com.discover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discover.entity.Payments;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments, Long>{

}

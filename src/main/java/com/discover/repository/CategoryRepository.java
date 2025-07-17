package com.discover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discover.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

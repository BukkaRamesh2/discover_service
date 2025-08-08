
package com.discover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discover.entity.Documents;

@Repository
public interface DocumentsRepository extends JpaRepository<Documents, Long>{

}
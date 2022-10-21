package com.cogent.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springboot.entity.Purchase;

@Repository
public interface PurchaseRepo extends JpaRepository<Purchase, Long>{

}

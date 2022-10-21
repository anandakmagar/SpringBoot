package com.cogent.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springboot.entity.Complaint;

@Repository
public interface ComplaintRepo extends JpaRepository<Complaint, Long>{

}

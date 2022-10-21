package com.cogent.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springboot.entity.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Long>{
	
}

package com.cogent.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Complaint;
import com.cogent.springboot.repository.ComplaintRepo;

@Service
public class ComplaintServiceImpl implements ComplaintService{

	@Autowired
	ComplaintRepo complaintRepo;
	@Override
	public Complaint addComplaint(Complaint complaint) {
		return complaintRepo.save(complaint);
	}

	@Override
	public List<Complaint> viewAllComplaints() {
		return complaintRepo.findAll();
	}

	@Override
	public void deleteByComplaintId(Long employeeId) {
		complaintRepo.deleteById(employeeId);
	}

}

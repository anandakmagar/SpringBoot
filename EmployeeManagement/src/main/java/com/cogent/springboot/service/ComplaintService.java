package com.cogent.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Complaint;

@Service
public interface ComplaintService {
	public Complaint addComplaint(Complaint complaint);
	public List<Complaint> viewAllComplaints();
	public void deleteByComplaintId(Long employeeId);
}

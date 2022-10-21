package com.cogent.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.springboot.entity.Complaint;
import com.cogent.springboot.service.ComplaintService;

@RestController
@RequestMapping("/api/complaint")
public class ComplaintController {
	@Autowired
	ComplaintService complaintService;
	
	@PostMapping("/add-complaint")
	public Complaint addComplaint(@RequestBody Complaint complaint) {
		return complaintService.addComplaint(complaint);
		
	}
	
	@GetMapping("/view-complaints")
	public List<Complaint> viewAllComplaints(){
		return complaintService.viewAllComplaints();
	}
	
	@DeleteMapping("/delete-complaint/{id}")
	public String deleteByComplaintId(@PathVariable("id") Long complaintId) {
		complaintService.deleteByComplaintId(complaintId);
		return "Record has been deleted successfully";
	}

}

package com.cogent.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaint_table")
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long complaintId;
	private String complaintTitle;
	private String description;
	private String status;
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(Long complaintId, String complaintTitle, String description, String status) {
		super();
		this.complaintId = complaintId;
		this.complaintTitle = complaintTitle;
		this.description = description;
		this.status = status;
	}
	
	
	public Long getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}
	public String getComplaintTitle() {
		return complaintTitle;
	}
	public void setComplaintTitle(String complaintTitle) {
		this.complaintTitle = complaintTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", complaintTitle=" + complaintTitle + ", description="
				+ description + ", status=" + status + "]";
	}
	
	
	
	
}

package com.cogent.springboot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	private String productName;
	private int productCost;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase(Long productId, String productName, int productCost, Date date) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.date = date;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Purchase [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", date=" + date + "]";
	}
    
    
	
}

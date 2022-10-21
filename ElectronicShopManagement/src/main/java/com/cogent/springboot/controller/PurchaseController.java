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

import com.cogent.springboot.entity.Purchase;
import com.cogent.springboot.service.PurchaseService;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
	@Autowired
	PurchaseService purchaseService;
	
	@PostMapping("/add-purchase")
	public Purchase addPurchase(@RequestBody Purchase purchase) {
		return purchaseService.addPurchase(purchase);
	}
	
	@GetMapping("/view-purchases")
	public List<Purchase> viewAllPurchases(){
		return purchaseService.viewAllPurchases();
	}
	
	@DeleteMapping("/delete-purchase/{id}")
	public String deletePurchaseById(@PathVariable ("id") Long productId) {
		purchaseService.deletePurchaseById(productId);
		return "Record has been successfully deleted";
		
	}
}

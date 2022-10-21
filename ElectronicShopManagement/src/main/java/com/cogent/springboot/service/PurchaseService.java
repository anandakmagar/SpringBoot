package com.cogent.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Purchase;

@Service
public interface PurchaseService {
	public Purchase addPurchase(Purchase purchase);
	public List<Purchase> viewAllPurchases();
	public void deletePurchaseById(Long productId);
}

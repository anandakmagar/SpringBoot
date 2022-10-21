package com.cogent.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Purchase;
import com.cogent.springboot.repo.PurchaseRepo;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	PurchaseRepo purchaseRepo;

	@Override
	public Purchase addPurchase(Purchase purchase) {
		return purchaseRepo.save(purchase);
	}

	@Override
	public List<Purchase> viewAllPurchases() {
		return purchaseRepo.findAll();
	}

	@Override
	public void deletePurchaseById(Long productId) {
		purchaseRepo.deleteById(productId);
		
	}
}

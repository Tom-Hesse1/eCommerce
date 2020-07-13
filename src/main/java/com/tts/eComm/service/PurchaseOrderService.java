package com.tts.eComm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eComm.repository.PurchaseOrderRepository;
import com.tts.eComm.model.PurchaseOrder;

@Service
public class PurchaseOrderService {
	
	@Autowired
	private PurchaseOrderRepository purchaseorderRepository;
	
	public List<PurchaseOrder> findAll()
	{
		return purchaseorderRepository.findAll();
	}
	
	public PurchaseOrder findOrderById(long id)
	{
		return purchaseorderRepository.findOrderById(id);
	}
	
	public PurchaseOrder findOrderByDate(String date)
	{
		return purchaseorderRepository.findOrderByDate(date);
	}
	
	public PurchaseOrder findOrderByArrivalDate(String arrivalDate)
	{
		return purchaseorderRepository.findOrderByArrivalDate(arrivalDate);
	}

}

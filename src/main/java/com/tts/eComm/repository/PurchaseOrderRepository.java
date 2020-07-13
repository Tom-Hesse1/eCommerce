package com.tts.eComm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.eComm.model.PurchaseOrder;

public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {
	
	public List<PurchaseOrder> findAll();
	
	public PurchaseOrder findOrderById(long id);
	
	public PurchaseOrder findOrderByDate(String date);
	
	public PurchaseOrder findOrderByArrivalDate(String arrivalDate);

}

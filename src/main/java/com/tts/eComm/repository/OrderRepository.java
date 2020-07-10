package com.tts.eComm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.eComm.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	
	public List<Order> findAll();
	
	public Order findById(long id);
	
	public Order findByDate(String date);
	
	public Order findByArrivalDate(String arrivalDate);

}

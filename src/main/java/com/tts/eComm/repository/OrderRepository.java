package com.tts.eComm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.eComm.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	
	public List<Order> findAll();
	
	public Order findOrderById(long id);
	
	public Order findOrderByDate(String date);
	
	public Order findOrderByArrivalDate(String arrivalDate);

}

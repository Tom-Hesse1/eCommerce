package com.tts.eComm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eComm.repository.OrderRepository;
import com.tts.eComm.model.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll()
	{
		return orderRepository.findAll();
	}
	
	public Order findOrderById(long id)
	{
		return orderRepository.findOrderById(id);
	}
	
	public Order findOrderByDate(String date)
	{
		return orderRepository.findOrderByDate(date);
	}
	
	public Order findOrderByArrivalDate(String arrivalDate)
	{
		return orderRepository.findOrderByArrivalDate(arrivalDate);
	}

}

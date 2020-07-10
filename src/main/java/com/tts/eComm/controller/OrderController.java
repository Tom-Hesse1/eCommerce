package com.tts.eComm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/storefront/order/{orderId}")
	public String show(PathVariable Long id, Model model)
	{
		Order order = orderService.findOrderById(id);
		model.addAttribute(order);
		return "storefront/order";
	}
}


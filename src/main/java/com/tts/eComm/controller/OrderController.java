package com.tts.eComm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.eComm.model.Order;

@Controller
@RequestMapping("/storefront")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/order/{orderId}")
	public String show(@PathVariable Long id, Model model)
	{
		Order order = orderService.findOrderById(id);
		model.addAttribute(order);
		return "storefront/order";
	}
	
	@GetMapping("/order")
	  public String getOrderPage(){
	    //code
	    return "storefront/order";
	  }
}


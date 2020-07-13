package com.tts.eComm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.eComm.model.PurchaseOrder;
import com.tts.eComm.service.PurchaseOrderService;

@Controller
@RequestMapping("/storefront")
public class PurchaseOrderController {

	@Autowired
	private PurchaseOrderService orderService;
	
	@GetMapping("/purchaseOrder/{purchaseorderId}")
	public String show(@PathVariable Long id, Model model)
	{
		PurchaseOrder order = orderService.findOrderById(id);
		model.addAttribute(order);
		return "storefront/purchaseOrder";
	}
	
	@GetMapping("/purchaseOrder")
	  public String getOrderPage(){
	    //code
	    return "storefront/purchaseOrder";
	  }
}


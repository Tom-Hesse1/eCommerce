package com.tts.eComm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.eComm.model.Cart;
import com.tts.eComm.service.CartService;

@Controller
@RequestMapping("/storefront")
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping("/storefront/cart")
	public String viewCart(Cart cart, Model model) {
	  model.addAttribute("cart", cart);
	  return "storefront/cart";
	}
	
	@PostMapping("/storefront/cart")
	public String addToCart(@RequestParam Long productId, @RequestParam Integer quantity, Cart cart, Model model) {
		cart = cartService.addLineItemToCart(cart, productId, quantity);
		model.addAttribute("cart", cart);
		return "storefront/cart";
	}

	@PostMapping("/cart")
	public String changeCartLineItemQuantity(@RequestParam Long productId, @RequestParam Integer quantity, Cart cart,
			Model model) {
		cart = cartService.updateLineItemQuantity(cart, productId, quantity);
		model.addAttribute("cart", cart);
		return "storefront/cart";
	}

}

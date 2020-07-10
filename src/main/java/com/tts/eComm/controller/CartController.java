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

	@GetMapping("/cart")
	public String viewCart(Cart cart, Model model) {
<<<<<<< HEAD
	  model.addAttribute("cart", cart);
	  return "storefront/cart";
	}
	
	@PostMapping("/cart")
	public String addToCart(@RequestParam long id) {
		Product product = productService.findById(id);
		setQuantity(product, cart().getOrDefault(product, 0) + 1);
=======
		model.addAttribute("cart", cart);
>>>>>>> fe7e5b8836266093689056a491082a163547bc8a
		return "storefront/cart";
	}

	@PostMapping("/cart")
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

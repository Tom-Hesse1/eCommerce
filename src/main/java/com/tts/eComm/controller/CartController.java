package com.tts.eComm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.eComm.model.Product;
import com.tts.eComm.service.ProductService;
import com.tts.eComm.service.UserService;
import com.tts.eComm.model.Cart;

@Controller
//@ RequestMapping("/storefront")
public class CartController {
	
	@Autowired
	private ProductService productService;
	private UserService userService;
	// private Cart cart??
	
	@GetMapping("/cart")
	public String showCart() {
		return "storefront/cart";
	}
	
	@PostMapping("/cart")
	public String addToCart(@RequestParam long id) {
		Product product = productService.findById(id);
		setQuantity(product, Cart().getOrDefault(product, 0) + 1);
		return "storefront/cart";
	}
	
	@PatchMapping("/cart")
	public String updateQuantities(@RequestParam Long[] productId, @RequestParam Integer[] quantity) {
		for(int i = 0; i < productId. length; i++) {
			Product product = productService.findById(productId[i]);
			setQuantity(product, quantity[i]);
		}
		return "storefront/cart";
	}

	@DeleteMapping("/cart")
	public String removeFromtCart(@RequestParam long id) {
		Product product = productService.findById(id);
		setQuantity(product, 0);
		return "storefront/cart";
	}
	
	private void setQuantity(Product p, int quantity) {
		if(quantity > 0) {
			Cart().put(p, quantity);
		} else {
			Cart().remove(p);
		}
		userService.updateCart(Cart());
	}
	/*
	 * @GetMapping("/cart")
	 * public String viewCart(Cart cart, Model model)
	 * {
	 * 	//code for cart
	 * 	model.addAttributes("cart", cart);
	 * return "storefront/cart";
	 * }  SIMILAR TO SHOW CART
	 * 
	 * 
	 * 
	 * 
	 * */
}
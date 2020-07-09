package com.tts.eComm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eComm.model.Cart;
import com.tts.eComm.model.Product;

@Service
public class CartService {
	//NEED HELP ON THIS ONE
	
	@Autowired
	private ProductService productService;
	
	public Cart addLineItemToCart(Cart cart, Long productId, Integer quantity) {
		  Optional<Product> productToAdd = productService.findById(productId);
		  HashMap<Product, Integer> lineItemToAdd = new HashMap<>();
		  lineItemToAdd.put(productToAdd, quantity);
		  List<HashMap<Product, Integer>> cartItems = cart.getLineItems();
		  cartItems.add(lineItemToAdd);
		  cart.setLineItems(cartItems);
		  return cart;
		}

		public Cart updateLineItemQuantity(Cart cart, Product product, Integer quantity){
			
		List<HashMap<Product, Integer>> cartItems = cart.getLineItems();
		  
		if (quantity > 0) {
		    cartItems.set(product, cartItems);
		    //cartItems = cart.getLineItems();
		  } else {
		    cartItems.remove(product);
		  }
		  return cart;
		}

}

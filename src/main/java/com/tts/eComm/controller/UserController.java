package com.tts.eComm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tts.eComm.model.User;
import com.tts.eComm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{userId}")
	public String show(@PathVariable Long id, Model model)
	{
		User user = userService.findById(id);
		model.addAttribute(user);
		return "storefront/user";
	}
	
	@RequestMapping(value = {"/user/new", "/products/{productId}/edit"}, method = {RequestMethod.POST, RequestMethod.PUT})
	public String createOrUpdate(@Valid User user)
	{
		userService.save(user);;
		return "redirect:/storefront/products/" + user.getId();
	}
	
	

}

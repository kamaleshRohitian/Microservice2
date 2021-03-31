package com.cognizant.UserService.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.UserService.entity.User;
import com.cognizant.UserService.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/")
	public User save(@RequestBody User user)
	{
		return userService.save(user);
	}
	
	@GetMapping("/users/{uid}")
	public Optional<User> getUser(@PathVariable int uid)
	{
		return userService.getUser(uid);
	}

}

package com.cognizant.UserService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.UserService.entity.User;
import com.cognizant.UserService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public Optional<User> getUser(int uid) {
		return userRepository.findById(uid);
	}

	public User save(User user) {
		return userRepository.save(user);
	}

}

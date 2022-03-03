package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.user.User;
import com.example.demo.service.SequenceGenerator;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class Controller {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private SequenceGenerator sequenceGenerator;
	
	@GetMapping("/getEmail/{id}")
	public String getEmailId(@PathVariable long id) {
		return userServiceImpl.getEmailAddress(id);
	} 
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		user.setId(sequenceGenerator.getUserSequenceNmber("user_sequence"));
		return userServiceImpl.addUser(user);
	}
	
	
	@PostMapping("/addAllUser")
	public String addAllUser(@RequestBody List<User> users) {
		return userServiceImpl.addAllUser(users);
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return userServiceImpl.getAllUser();
	}
	
	@GetMapping("/userExistbyId/{id}")
	public boolean userExistById(@PathVariable long id) {
		return userServiceImpl.userExistById(id);
	}
	
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody User user) {
		return userServiceImpl.updateUser(user);
	}
	
	@GetMapping("/userExistById/{id}")
	public User getUser(@PathVariable long id) {
		return userServiceImpl.getUser(id);
	}
	
	@DeleteMapping("/delete")
	public String deleteUser(@RequestBody User user) {
		return userServiceImpl.deleteUser(user);
	}
	
	
	
}

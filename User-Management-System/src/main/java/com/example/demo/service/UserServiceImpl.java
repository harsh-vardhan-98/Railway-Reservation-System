package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user.Ticket;
import com.example.demo.model.user.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private User user;
	@Autowired
	private SequenceGenerator sequenceGenerator;

	@Override
	public String getEmailAddress(long id) {
		if(userRepository.existsById(id)) {
			return userRepository.findById(id).get().getEmail();			
		}else {
			return null;
		}
	}

	@Override
	public String addUser(User user) {
		
		userRepository.save(user);
		return "Saved";
	}

	@Override
	public String addAllUser(List<User> users) {
		userRepository.saveAll(users);
		return "added";
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public boolean userExistById(Long user_id) {
		if(userRepository.existsById(user_id)) {
			return true;
		}else {
			return false;			
		}
	}

	@Override
	public String updateUser(User user) {
		if(!userRepository.existsById(user.getId())) {			
			return "User Not Exist";
		}else {
			userRepository.save(user);
			return "updated";
		}
	}

	@Override
	public User getUser(long user_id) {
		return userRepository.findById(user_id).get();
	}

	@Override
	public String deleteUser(User user) {
		userRepository.delete(user);
		return "deleted";
	}

	@Override
	public String saveTicket(long account_no, long pnr, Ticket ticket) {
		user.getTicket().put(pnr, ticket);
		return null;
	}



}

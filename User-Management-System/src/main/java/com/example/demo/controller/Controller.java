package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.user.Passenger;
import com.example.demo.model.user.ReservedTicket;
import com.example.demo.model.user.Ticket;
import com.example.demo.model.user.TicketForm;
import com.example.demo.model.user.Train;
import com.example.demo.model.user.User;
import com.example.demo.service.ReservedTicketImpl;
import com.example.demo.service.SequenceGenerator;
import com.example.demo.service.TrainServiceImpl;
import com.example.demo.service.UserServiceImpl;

@RestController

public class Controller {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private SequenceGenerator sequenceGenerator;
	@Autowired
	private TrainServiceImpl trainServiceImpl;
	@Autowired
	private ReservedTicketImpl reservedTicketImpl;
	
	@Autowired
	private ReservedTicket reservedTicket;
	
	@Autowired
	private Ticket ticket;
	
	
	
	@GetMapping("users/getEmail/{id}")
	public String getEmailId(@PathVariable long id) {
		return userServiceImpl.getEmailAddress(id);
	} 
	
	@PostMapping("users/addUser")
	public String addUser(@RequestBody User user) {
		user.setId(sequenceGenerator.getUserSequenceNumber("user-sequence"));
		return userServiceImpl.addUser(user);
	}
	
	
	@PostMapping("users/addAllUser")
	public String addAllUser(@RequestBody List<User> users) {
		return userServiceImpl.addAllUser(users);
	}
	
	@GetMapping("users/getAllUser")
	public List<User> getAllUser(){
		return userServiceImpl.getAllUser();
	}
	
	@GetMapping("users/userExistbyId/{id}")
	public boolean userExistById(@PathVariable long id) {
		return userServiceImpl.userExistById(id);
	}
	
	@PutMapping("users/updateUser")
	public String updateUser(@RequestBody User user) {
		return userServiceImpl.updateUser(user);
	}
	
	@GetMapping("users/userExistById/{id}")
	public User getUser(@PathVariable long id) {
		return userServiceImpl.getUser(id);
	}
	
	@DeleteMapping("users/delete")
	public String deleteUser(@RequestBody User user) {
		return userServiceImpl.deleteUser(user);
	}
	
//	----------------------------------------------Train -added -functionality--------------------------------------------------
	
	@PostMapping("trains/addTrain")
	public String addTrain(@RequestBody Train train) {
		trainServiceImpl.addTrain(train);
		return "Train Saved";
	}
	
	@PostMapping("trains/addAllTrains")
	public String addAllTrain(@RequestBody List<Train> train) {
		trainServiceImpl.addAlltrains(train);
		return "Train Saved";
	}
	
	
	@GetMapping("trains/getAllTrain")
	public List<Train> getAllTrains(){
		return trainServiceImpl.displayAllTrains();
	}
	
	@GetMapping("trains/getTrain/{train_no}")
	public Train getTrain(@PathVariable String id){
		return trainServiceImpl.getTrainByTrainNo(id);
		
	}
	
	@DeleteMapping("trains/deleteTrain/{train_no}")
	public String deleteTrain(String train_no){
		trainServiceImpl.deleteTrain(train_no);
		return null;
	}
	
	@DeleteMapping("trains/deleteAllTrain")
	public String deleteAllTrain() {
		trainServiceImpl.deleteAllTrains();
		return null;
	}
//	-------------------------------------------------Train - Reservation - Functionality--------------------------------------------------------
	
	
	@PostMapping("service/reserveTicket")
	public String reserveTicket(@RequestBody ReservedTicket reserveticket) {
		reserveticket.setPnr(sequenceGenerator.getTicketSequenceNumber("ticket-sequence"));
		reservedTicketImpl.reserveTicket(reserveticket);
		return "reserved";
	}
	
	
	@PostMapping("service/reserveAllTicket")
	public String reserveAllTicket(@RequestBody List<ReservedTicket> reserveticket) {
		((ReservedTicket) reserveticket).setPnr(sequenceGenerator.getTicketSequenceNumber("ticket-sequence"));
		reservedTicketImpl.reserveAllTicket(reserveticket);
		return "reserved";
	}
	
	@GetMapping("service/getReserveTicket/{pnr}")
		public ReservedTicket getReservedTicket(@PathVariable Long pnr) {
			return reservedTicketImpl.getReserveTicket(pnr);
		
	}
	
	@GetMapping("service/getAllTicket")
	public List<ReservedTicket> getAllTicket() {
		return reservedTicketImpl.getAllTicket();
	
}
	
	
	
	@DeleteMapping("service/cancelticket/{pnr}")
	public String cancelTicket(@PathVariable Long pnr) {
		reservedTicketImpl.deleteReserveTicket(pnr);
		return "deleted";
	}
	
	
}
	
	
	
	


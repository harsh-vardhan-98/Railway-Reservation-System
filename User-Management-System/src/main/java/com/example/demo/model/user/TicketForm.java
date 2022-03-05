package com.example.demo.model.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TicketForm extends Ticket{

	private String train_no;
    private String train_name;
    private String start;
    private String destination;
    private String class_name;
    private LocalDateTime departure_time;
    private LocalDateTime arrival_time;
    private List<Passenger> passengers; 
    private String email_address;
    private LocalDate date_of_journey;
    private String journey_time;
    
    public TicketForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketForm(String train_no, String train_name, String start, String destination, String class_name,
			LocalDateTime departure_time, LocalDateTime arrival_time, List<Passenger> passengers, String email_address,
			LocalDate date_of_journey, String journey_time) {
		super();
		this.train_no = train_no;
		this.train_name = train_name;
		this.start = start;
		this.destination = destination;
		this.class_name = class_name;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.passengers = passengers;
		this.email_address = email_address;
		this.date_of_journey = date_of_journey;
		this.journey_time = journey_time;
	}
	public String getTrain_no() {
		return train_no;
	}
	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public LocalDateTime getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(LocalDateTime departure_time) {
		this.departure_time = departure_time;
	}
	public LocalDateTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(LocalDateTime arrival_time) {
		this.arrival_time = arrival_time;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public LocalDate getDate_of_journey() {
		return date_of_journey;
	}
	public void setDate_of_journey(LocalDate date_of_journey) {
		this.date_of_journey = date_of_journey;
	}
	public String getJourney_time() {
		return journey_time;
	}
	public void setJourney_time(String journey_time) {
		this.journey_time = journey_time;
	}
}

package com.example.demo.model.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Ticket {
	private long pnr;
	private String train_no;
    private String train_name;
    private String start;
    private String destination;
    private String class_name;
    private LocalDateTime departure_time;
    private LocalDateTime arrival_time;
    private String passenger_name;
    private String contact_no;
    private String sex;
    private int age;
    private String quota;
    private String email_address;
    private LocalDate date_of_journey;
    private String journey_time;
    private String seat_no;
    public long getPnr() {
		return pnr;
	}
	public void setPnr(long pnr) {
		this.pnr = pnr;
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
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getTransactional_id() {
		return transactional_id;
	}
	public void setTransactional_id(Long transactional_id) {
		this.transactional_id = transactional_id;
	}
	private String status;
    private Long transactional_id;
    
    
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
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQuota() {
		return quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(long pnr, String train_no, String train_name, String start, String destination, String class_name,
			LocalDateTime departure_time, LocalDateTime arrival_time, String passenger_name, String contact_no,
			String sex, int age, String quota, String email_address, LocalDate date_of_journey, String journey_time,
			String seat_no, String status, Long transactional_id) {
		super();
		this.pnr = pnr;
		this.train_no = train_no;
		this.train_name = train_name;
		this.start = start;
		this.destination = destination;
		this.class_name = class_name;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.passenger_name = passenger_name;
		this.contact_no = contact_no;
		this.sex = sex;
		this.age = age;
		this.quota = quota;
		this.email_address = email_address;
		this.date_of_journey = date_of_journey;
		this.journey_time = journey_time;
		this.seat_no = seat_no;
		this.status = status;
		this.transactional_id = transactional_id;
	}
	
}

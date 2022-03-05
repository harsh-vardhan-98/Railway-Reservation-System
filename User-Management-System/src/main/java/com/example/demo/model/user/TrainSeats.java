package com.example.demo.model.user;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Train-Seats")
public class TrainSeats {

	@Id
	private String train_no;
	private Map<String, Integer> coaches_per_class; // quantity per coach
	private Map<String, Integer> seats_per_coach; // coach name & total seat
	public TrainSeats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrainSeats(String train_no, Map<String, Integer> coaches_per_class, Map<String, Integer> seats_per_coach) {
		super();
		this.train_no = train_no;
		this.coaches_per_class = coaches_per_class;
		this.seats_per_coach = seats_per_coach;
	}
	public String getTrain_no() {
		return train_no;
	}
	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}
	public Map<String, Integer> getCoaches_per_class() {
		return coaches_per_class;
	}
	public void setCoaches_per_class(Map<String, Integer> coaches_per_class) {
		this.coaches_per_class = coaches_per_class;
	}
	public Map<String, Integer> getSeats_per_coach() {
		return seats_per_coach;
	}
	public void setSeats_per_coach(Map<String, Integer> seats_per_coach) {
		this.seats_per_coach = seats_per_coach;
	}
}

package com.example.demo.model.user;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Reserve-Seats")
public class ReserveSeats {
    @Id
    @Field(name = "seat_data")
    private SeatData seat_data;
    private Map<String, Map<Integer, Long>> seats; // classes -> (seatNo,pnr)

    public ReserveSeats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReserveSeats(SeatData seat_data, Map<String, Map<Integer, Long>> seats,
			Map<String, Integer> coaches_per_class) {
		super();
		this.seat_data = seat_data;
		this.seats = seats;
		this.coaches_per_class = coaches_per_class;
	}

	public SeatData getSeat_data() {
		return seat_data;
	}

	public void setSeat_data(SeatData seat_data) {
		this.seat_data = seat_data;
	}

	public Map<String, Map<Integer, Long>> getSeats() {
		return seats;
	}

	public void setSeats(Map<String, Map<Integer, Long>> seats) {
		this.seats = seats;
	}

	public Map<String, Integer> getCoaches_per_class() {
		return coaches_per_class;
	}

	public void setCoaches_per_class(Map<String, Integer> coaches_per_class) {
		this.coaches_per_class = coaches_per_class;
	}

	private Map<String, Integer> coaches_per_class; // classes -> no of coaches
}
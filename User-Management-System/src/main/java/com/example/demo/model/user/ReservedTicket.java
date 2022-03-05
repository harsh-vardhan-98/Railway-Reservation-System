package com.example.demo.model.user;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Reserved-Ticket")
public class ReservedTicket {

    @Transient
    public static final String SEQUENCE_NAME = "ticket-sequence";

    @Id
    private Long pnr;
    private LocalDateTime booking_time;
    private Double amount;
    private Ticket ticket;

    public ReservedTicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservedTicket(Long pnr, Ticket ticket, Long transactional_id, Long account_no, String email_address,
			String status, LocalDateTime booking_time, Double amount) {
		super();
		this.pnr = pnr;
		this.ticket = ticket;

		this.booking_time = booking_time;
		this.amount = amount;
	}
	public Long getPnr() {
		return pnr;
	}
	public void setPnr(Long pnr) {
		this.pnr = pnr;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public LocalDateTime getBooking_time() {
		return booking_time;
	}
	public void setBooking_time(LocalDateTime booking_time) {
		this.booking_time = booking_time;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
}

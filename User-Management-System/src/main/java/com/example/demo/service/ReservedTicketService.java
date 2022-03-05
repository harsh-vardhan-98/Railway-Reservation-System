package com.example.demo.service;

import java.util.List;

import com.example.demo.model.user.ReservedTicket;

public interface ReservedTicketService {

	public String reserveAllTicket(List<ReservedTicket> reservetickets);
	
	public ReservedTicket getReserveTicket(Long pnr);
	
	public String deleteReserveTicket(Long pnr);
	
	public List<ReservedTicket> getAllTicket();
	
	public String reserveTicket(ReservedTicket reservedTicket);
	
}

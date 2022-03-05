package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user.ReservedTicket;
import com.example.demo.repository.ReservedTicketRepository;

@Service
public class ReservedTicketImpl implements ReservedTicketService {
	
	@Autowired
	private ReservedTicketRepository reservedTicketRepository;

	@Override
	public String reserveAllTicket(List<ReservedTicket> reservetickets) {
		reservedTicketRepository.saveAll(reservetickets);
		return "Save";
	}

	@Override
	public ReservedTicket getReserveTicket(Long pnr) {
		return reservedTicketRepository.findAll().parallelStream().filter(p->p.getPnr().equals(pnr)).collect(Collectors.toList()).get(0);
		
	}

	@Override
	public String deleteReserveTicket(Long pnr) {
		reservedTicketRepository.deleteById(pnr);
		return "Deleted";
	}

	@Override
	public List<ReservedTicket> getAllTicket() {
		
		return reservedTicketRepository.findAll();
	}

	@Override
	public String reserveTicket(ReservedTicket reservedTicket) {
		reservedTicketRepository.save(reservedTicket);
		return "Saved";
	}
	
	
	
	
	
}

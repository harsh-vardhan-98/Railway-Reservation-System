package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.user.ReservedTicket;

public interface ReservedTicketRepository extends MongoRepository<ReservedTicket, Long>{
	
	
	
}

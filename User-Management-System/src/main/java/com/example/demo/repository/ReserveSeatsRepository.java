package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.user.ReserveSeats;
import com.example.demo.model.user.SeatData;

@Repository
public interface ReserveSeatsRepository extends MongoRepository<ReserveSeats, SeatData>{

}

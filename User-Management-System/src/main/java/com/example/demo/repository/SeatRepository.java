package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.user.SeatData;
import com.example.demo.model.user.TrainSeats;


@Repository
public interface SeatRepository extends MongoRepository<TrainSeats, String> {

}

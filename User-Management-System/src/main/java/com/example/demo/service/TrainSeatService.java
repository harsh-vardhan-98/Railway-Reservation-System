package com.example.demo.service;

import com.example.demo.model.user.TrainSeats;

public interface TrainSeatService {
    public String addData();

    public TrainSeats getTrainSeats(String train_no);
}
package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.model.user.Train;

public interface TrainService {
    // *------------------- Basic Data Display Functionality -------------------*
    public List<Train> displayAllTrains();
    
    public String addTrain(Train train);
    
    public String addAlltrains(List<Train> trains);

    public String displayTrainToTable(String trainNo);

    public Train displayTrain(String trainNo);

    public String updateData(List<Train> trains);

    public String customUpdation();

    public Train getTrainByTrainNo(String train_no);

    public boolean trainExistByTrainNo(String train_no);

    public String displayTimeTableByYourCity(String city);

//    public String trainsBetweenStationToTable(String origin, String destination);

//    public String trainFairToTable(String origin, String destination);


    public String deleteAllTrains();

    public String deleteTrain(String train_no);

   

}
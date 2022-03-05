package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user.Train;
import com.example.demo.repository.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepository;
	
	
	
	@Override
	public List<Train> displayAllTrains() {
		return trainRepository.findAll();
	}

	@Override
	public String displayTrainToTable(String trainNo) {
		
		return null;
	}

	@Override
	public Train displayTrain(String trainNo) {
		Train train = trainRepository.findAll().parallelStream().filter(p->p.getTrain_no().equals(trainNo)).collect(Collectors.toList()).get(0);
		return train;
	}

	@Override
	public String updateData(List<Train> trains) {
		trainRepository.saveAll(trains);
		return "updated";
	}

	@Override
	public String customUpdation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train getTrainByTrainNo(String train_no) {
		Train train = trainRepository.findAll().parallelStream().filter(p->p.getTrain_name().equals(train_no)).collect(Collectors.toList()).get(0);
		return train;
	}

	@Override
	public boolean trainExistByTrainNo(String train_no) {
		if(trainRepository.existsById(train_no)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String displayTimeTableByYourCity(String city) {
		List<Train> trains = trainRepository.findAll();
		for (Train train : trains) {
			if(train.getStart_from() == city) {
				System.out.println("train no : " + train.getTrain_no() + "train name : " + train.getTrain_name() + " train arrival time" + train.getArrival_time() +"/n");
			}
		}
		return null;
	}

//	@Override
//	public String trainsBetweenStationToTable(String origin, String destination) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public String trainFairToTable(String origin, String destination) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	@Override
	public String deleteTrain(String train_no) {

			trainRepository.deleteById(train_no);
		
		return null;
	}

	@Override
	public String addTrain(Train train) {
		trainRepository.save(train);
		return "Saved";
	}

	@Override
	public String addAlltrains(List<Train> trains) {
		trainRepository.saveAll(trains);
		return "Saved";
	}

	@Override
	public String deleteAllTrains() {
		trainRepository.deleteAll();
		return null;
	}
}
//	@Override
//	public String trainsBetweenStationToTable(String origin, String destination) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}

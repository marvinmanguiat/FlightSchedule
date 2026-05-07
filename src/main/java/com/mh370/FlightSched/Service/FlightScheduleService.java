package com.mh370.FlightSched.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mh370.FlightSched.Entity.FlightSchedule;
import com.mh370.FlightSched.Repo.FlightScheduleRepo;

@Service
public class FlightScheduleService {
	
	@Autowired
	FlightScheduleRepo flightScheduleRepo;
	


	public List<FlightSchedule> searchFlightSchedule(String origin, String destination, Pageable pageable) {
		// TODO Auto-generated method stub
		return flightScheduleRepo.findByOriginAndDestination(origin, destination, pageable);
	}

}

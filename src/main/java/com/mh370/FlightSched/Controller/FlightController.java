package com.mh370.FlightSched.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mh370.FlightSched.Entity.FlightSchedule;
import com.mh370.FlightSched.Service.FlightScheduleService;

@RestController
@RequestMapping("/v1/api/flight_schedule/")
public class FlightController {

	@Autowired
	FlightScheduleService fs_service;

	/**
	 * /v1/api/flight_schedule/search?origin=JAPAN&destination=USA
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 */
	@GetMapping("search")
	List<FlightSchedule> searchFlight(@RequestParam String origin, 
			                          @RequestParam String destination) {

		return fs_service.searchFlightSchedule(origin, destination);
	}

}

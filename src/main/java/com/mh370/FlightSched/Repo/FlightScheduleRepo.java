package com.mh370.FlightSched.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mh370.FlightSched.Entity.FlightSchedule;

@Repository
public interface FlightScheduleRepo extends JpaRepository<FlightSchedule, Long> {

    List<FlightSchedule> findByOriginAndDestination(
            String origin,
            String destination);
   
}

package com.mh370.FlightSched.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mh370.FlightSched.Entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}

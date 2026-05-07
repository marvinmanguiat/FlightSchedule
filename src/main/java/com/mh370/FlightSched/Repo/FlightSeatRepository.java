package com.mh370.FlightSched.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mh370.FlightSched.ENUM.SeatStatus;
import com.mh370.FlightSched.ENUM.SeatType;
import com.mh370.FlightSched.Entity.FlightSeat;

import jakarta.persistence.LockModeType;

@Repository
public interface FlightSeatRepository
        extends JpaRepository<FlightSeat, Long> {
	
	
	 @Lock(LockModeType.PESSIMISTIC_WRITE)
	    @Query("""
	        SELECT s
	        FROM FlightSeat s
	        WHERE s.id = :seatId
	    """)
	    Optional<FlightSeat> findSeatForUpdate(
	            @Param("seatId") Long seatId);
	 
	 

    List<FlightSeat> findByFlightScheduleIdAndStatus(
            Long flightId,
            SeatStatus status);

    List<FlightSeat> findByFlightScheduleIdAndSeatTypeAndStatus(
            Long flightId,
            SeatType seatType,
            SeatStatus status);
}
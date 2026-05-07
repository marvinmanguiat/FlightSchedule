package com.mh370.FlightSched.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mh370.FlightSched.ENUM.SeatStatus;
import com.mh370.FlightSched.Entity.FlightSeat;
import com.mh370.FlightSched.Entity.Passenger;
import com.mh370.FlightSched.Entity.Reservation;
import com.mh370.FlightSched.Repo.FlightSeatRepository;
import com.mh370.FlightSched.Repo.PassengerRepository;
import com.mh370.FlightSched.Repo.ReservationRepository;

import jakarta.transaction.Transactional;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private FlightSeatRepository seatRepo;
	
	@Autowired
	private PassengerRepository passengerRepo;
	

	
	@Transactional
	public Reservation reserveSeat(Long passengerId, Long seatId) {

	    FlightSeat seat = seatRepo.findSeatForUpdate(seatId)
	            .orElseThrow(() -> new RuntimeException("Seat not found"));

	    if (seat.getStatus() == SeatStatus.RESERVED) {
	        throw new RuntimeException("Seat already reserved");
	    }

	    Passenger passenger = passengerRepo.findById(passengerId)
	            .orElseThrow(() -> new RuntimeException("Passenger not found"));

	    seat.setStatus(SeatStatus.RESERVED);

	    Reservation reservation = new Reservation();
	    reservation.setPassenger(passenger);
	    reservation.setFlightSeat(seat);
	    reservation.setReservationDate(LocalDateTime.now());

	    seatRepo.save(seat);

	    return reservationRepo.save(reservation);
	}



    public void cancelReservation(Long reservationId) {

        Reservation reservation =
                reservationRepo.findById(reservationId)
                        .orElseThrow(() ->
                                new RuntimeException("Reservation not found"));

        FlightSeat seat = reservation.getFlightSeat();

        seat.setStatus(SeatStatus.AVAILABLE);

        seatRepo.save(seat);

        reservationRepo.delete(reservation);
    }
	
	
}

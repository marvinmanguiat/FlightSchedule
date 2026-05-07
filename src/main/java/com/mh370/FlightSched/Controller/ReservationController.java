package com.mh370.FlightSched.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mh370.FlightSched.DTO.ReserveSeatRequestDTO;
import com.mh370.FlightSched.Entity.Reservation;
import com.mh370.FlightSched.Service.ReservationService;

@RestController
@RequestMapping("/v1/api/flight_reservation/")
public class ReservationController {

	 @Autowired
    private  ReservationService reservationService;

    /**
     * Reserve a specific seat for a passenger
     */
	 @PostMapping("/{flightId}/reserve")
    public ResponseEntity<Reservation> reserveSeat(
            @RequestBody ReserveSeatRequestDTO request) {

        Reservation reservation =
                reservationService.reserveSeat(
                        request.getPassengerId(),
                        request.getSeatId());

        return ResponseEntity.ok(reservation);
    }

    /**
     * Cancel reservation
     */
    @DeleteMapping("/{reservationId}")
    public ResponseEntity<String> cancelReservation(
            @PathVariable Long reservationId) {

        reservationService.cancelReservation(reservationId);

        return ResponseEntity.ok("Reservation cancelled successfully");
    }
}
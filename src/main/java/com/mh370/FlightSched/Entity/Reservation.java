package com.mh370.FlightSched.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
    
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    @OneToOne
    @JoinColumn(name = "flight_seat_id")
    private FlightSeat flightSeat;

    private LocalDateTime reservationDate;

    public Reservation() {}
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public FlightSeat getFlightSeat() {
		return flightSeat;
	}

	public void setFlightSeat(FlightSeat flightSeat) {
		this.flightSeat = flightSeat;
	}

	public LocalDateTime getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDateTime reservationDate) {
		this.reservationDate = reservationDate;
	}
	
}

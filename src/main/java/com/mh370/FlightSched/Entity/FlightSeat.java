package com.mh370.FlightSched.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mh370.FlightSched.ENUM.SeatStatus;
import com.mh370.FlightSched.ENUM.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_seat")
public class FlightSeat {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String seatNumber;
  
  @Enumerated(EnumType.STRING)
  private SeatType seatType;
  
  @Enumerated(EnumType.STRING)
  private SeatStatus status;
  
  @ManyToOne
  @JoinColumn(name = "flight_schedule_id")
  @JsonBackReference
  private FlightSchedule flightSchedule;

  public FlightSeat() {}
  
  
  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public String getSeatNumber() {
	return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
	this.seatNumber = seatNumber;
  }

  public SeatType getSeatType() {
	return seatType;
  }

  public void setSeatType(SeatType seatType) {
	this.seatType = seatType;
  }



  public FlightSchedule getFlightSchedule() {
	return flightSchedule;
  }

  public void setFlightSchedule(FlightSchedule flightSchedule) {
	this.flightSchedule = flightSchedule;
  }


  public SeatStatus getStatus() {
	return status;
  }


  public void setStatus(SeatStatus status) {
	this.status = status;
  }
  
  
  
}

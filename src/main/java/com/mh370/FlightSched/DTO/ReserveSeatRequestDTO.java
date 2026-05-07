package com.mh370.FlightSched.DTO;

public class ReserveSeatRequestDTO {

    private Long passengerId;
    private Long seatId;

    public ReserveSeatRequestDTO() {
    }

    public ReserveSeatRequestDTO(Long passengerId, Long seatId) {
        this.passengerId = passengerId;
        this.seatId = seatId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }
}
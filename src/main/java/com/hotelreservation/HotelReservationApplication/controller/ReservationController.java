package com.hotelreservation.HotelReservationApplication.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hotelreservation.HotelReservationApplication.entity.Customer;
import com.hotelreservation.HotelReservationApplication.entity.Reservation;
import com.hotelreservation.HotelReservationApplication.service.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public Reservation saveReservation(@RequestBody Reservation reservation){
        return reservationService.saveReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable int id ){
        return reservationService.getReservation(id);
    }

    @PutMapping("/{id}")
    public Reservation updateReservationDetails(@PathVariable int id, @RequestBody Reservation reservation) throws Exception {
        if(id == reservation.getReservationId())
            return reservationService.updateReservationDetails(reservation);
        else {
            throw new Exception("ids do not match.");
        }
    }


}

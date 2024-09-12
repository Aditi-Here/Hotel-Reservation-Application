package com.hotelreservation.HotelReservationApplication.controller;

import com.hotelreservation.HotelReservationApplication.entity.Reservation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservationBooking")
public class ReservationController {

    @PostMapping
    public Reservation saveReservation(@RequestBody Reservation reservation){
        return null;
    }


}

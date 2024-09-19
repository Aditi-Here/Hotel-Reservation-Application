package com.hotelreservation.HotelReservationApplication.controller;

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

    @GetMapping("/{reservationId}")
    public Reservation getReservationByReservationId(@PathVariable int reservationId ){
        return reservationService.getReservationByReservationId(reservationId);
    }

    @GetMapping
    public Reservation getReservationByCustomerId(@RequestParam(name = "customerId") int customerId){
        return reservationService.getReservationByCustomerId(customerId);
    }

    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable int id, @RequestBody Reservation reservation) throws Exception {
        if(id == reservation.getReservationId())
            return reservationService.updateReservationDetails(reservation);
        else {
            throw new Exception("ids do not match.");
        }
    }


}

package com.hotelreservation.HotelReservationApplication.service;

import com.hotelreservation.HotelReservationApplication.entity.Reservation;
import com.hotelreservation.HotelReservationApplication.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReservationService {

    private ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public ReservationRepository getReservationRepository() {
        return reservationRepository;
    }

    public void setReservationRepository(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }



    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }


    public Reservation getReservationByReservationId(int reservationId){
        return reservationRepository.findById(reservationId).get();
    }

    public Reservation getReservationByCustomerId(int customerId){
       List<Reservation> r= reservationRepository.findReservationsByCustomer(customerId);
        return null;
    }

    public Reservation updateReservationDetails(Reservation reservation) {
        Reservation dataBaseReservation = reservationRepository.findById(reservation.getReservationId()).get();

        dataBaseReservation.setCheckIn(reservation.getCheckIn());
        dataBaseReservation.setCheckOut(reservation.getCheckOut());
        dataBaseReservation.setPrice(reservation.getPrice());
        dataBaseReservation.setStatus(reservation.getStatus());
        reservationRepository.save(dataBaseReservation);

        return reservation;

    }
}

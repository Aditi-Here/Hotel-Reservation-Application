package com.hotelreservation.HotelReservationApplication.repository;

import com.hotelreservation.HotelReservationApplication.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation, Integer>{
}

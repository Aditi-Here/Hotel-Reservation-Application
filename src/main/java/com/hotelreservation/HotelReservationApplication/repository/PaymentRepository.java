package com.hotelreservation.HotelReservationApplication.repository;

import com.hotelreservation.HotelReservationApplication.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}

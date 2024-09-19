package com.hotelreservation.HotelReservationApplication.repository;

import com.hotelreservation.HotelReservationApplication.entity.Customer;
import com.hotelreservation.HotelReservationApplication.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends JpaRepository <Reservation, Integer>{

    @Query("SELECT r FROM Reservation r WHERE r.customer.customerId = :customerId")
    List<Reservation> findReservationsByCustomer(@Param("customerId") int customerId);


}

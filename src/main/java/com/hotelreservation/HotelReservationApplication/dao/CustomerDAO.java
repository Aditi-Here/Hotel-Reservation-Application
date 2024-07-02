package com.hotelreservation.HotelReservationApplication.dao;

import com.hotelreservation.HotelReservationApplication.entity.Customer;

public interface CustomerDAO {
    void save(Customer theCustomer);
    Customer customerGetById(int Id);
}

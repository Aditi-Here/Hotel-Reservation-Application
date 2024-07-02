package com.hotelreservation.HotelReservationApplication.service;

import com.hotelreservation.HotelReservationApplication.dao.CustomerDAOImpl;
import com.hotelreservation.HotelReservationApplication.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    //define fields
    private CustomerDAOImpl customerDAOImpl;
    //constructor

    public CustomerService(CustomerDAOImpl customerDAOImpl) {
        this.customerDAOImpl = customerDAOImpl;
    }

    public Customer getCustomerById(int id){
//        Customer cus = new Customer(1,"Aditi","Here","here@gmail.com");
//        return cus;
        return customerDAOImpl.customerGetById(id);
    }

}

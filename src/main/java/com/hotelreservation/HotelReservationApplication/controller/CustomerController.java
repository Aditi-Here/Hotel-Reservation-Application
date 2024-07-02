package com.hotelreservation.HotelReservationApplication.controller;


import com.hotelreservation.HotelReservationApplication.entity.Customer;
import com.hotelreservation.HotelReservationApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    // create fields
   private CustomerService myCustomerService;

    //constructor injection
    public CustomerController(CustomerService theCustomerService){
        myCustomerService = theCustomerService;
    }

    //method
    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable int customerId){

        return myCustomerService.getCustomerById(customerId);
    }
}

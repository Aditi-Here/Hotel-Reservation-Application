package com.hotelreservation.HotelReservationApplication.controller;


import com.hotelreservation.HotelReservationApplication.entity.Customer;
//import com.hotelreservation.HotelReservationApplication.entity.Customer1;
//import com.hotelreservation.HotelReservationApplication.service.CustomerService_dao;
import com.hotelreservation.HotelReservationApplication.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

//    // create fields
//   private CustomerService_dao myCustomerService;
//
//    //constructor injection
//    public CustomerController(CustomerService_dao theCustomerService){
//        myCustomerService = theCustomerService;
//    }
//
//    //method
//    @GetMapping("/{customerId}")
//    public Customer getCustomer(@PathVariable int customerId){
//
//        return myCustomerService.getCustomerById(customerId);
//    }

    // create fields
    private CustomerService customerService;

    //constructor injection
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    //method
    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable int customerId){
        return customerService.getCustomerById(customerId);
    }
    @GetMapping
    public List<Customer> getAllCustomer(){

        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer user){
        return customerService.saveCustomer(user);
    }

    @PostMapping("/userValidation")
    public boolean checkValidUser(@RequestBody Customer user){
        return customerService.validateCustomer(user);
    }

    @PutMapping("/{id}")
    public Customer updateCustomerDetails(@PathVariable int id, @RequestBody Customer user) throws Exception {
        if(id == user.getCustomerId())
            return customerService.updateCustomerDetails(user);
        else {
             throw new Exception("ids do not match.");
        }
    }

}

package com.hotelreservation.HotelReservationApplication.controller;
import com.hotelreservation.HotelReservationApplication.entity.Customer;
import com.hotelreservation.HotelReservationApplication.service.CustomerService;
//import com.hotelreservation.types.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

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
    public Customer createCustomer(@RequestBody Customer user){
        return customerService.saveCustomer(user);
    }

    @PostMapping("/signIn")
    public boolean ValidateCustomerCredientials(@RequestBody Customer user){
        return customerService.validateCustomer(user);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer user) throws Exception {
        if(id == user.getCustomerId())
            return customerService.updateCustomer(user);
        else {
             throw new Exception("ids do not match.");
        }
    }

}

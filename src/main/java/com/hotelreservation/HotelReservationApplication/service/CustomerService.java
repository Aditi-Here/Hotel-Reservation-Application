package com.hotelreservation.HotelReservationApplication.service;

import com.hotelreservation.HotelReservationApplication.entity.Customer;
import com.hotelreservation.HotelReservationApplication.repository.CustomerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {
    //define fields
    private CustomerRepository customerRepository;

    //constructor
    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(int id){

        return customerRepository.findById(id).get();
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer user){
        return customerRepository.save(user);
    }

    public boolean validateCustomer(Customer user){
        Customer inputUser = customerRepository.findByEmail(user.getEmail());
        if(inputUser.getEmail().equals(user.getEmail())  &&
                inputUser.getPassword().equals(user.getPassword())){
            return true;
        }
        return false;
    }

    public Customer updateCustomer(Customer user){
        Customer dataBaseUser = customerRepository.findById(user.getCustomerId()).get();

        dataBaseUser.setPassword(user.getPassword());
        dataBaseUser.setFirstName(user.getFirstName());
        dataBaseUser.setLastName(user.getLastName());
        customerRepository.save(dataBaseUser);
        return user;
    }

}

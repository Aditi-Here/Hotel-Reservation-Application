package com.hotelreservation.HotelReservationApplication.dao;

import com.hotelreservation.HotelReservationApplication.entity.Customer;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
    private EntityManager entityManager;

    @Autowired
    public CustomerDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Customer theCustomer) {
        entityManager.persist(theCustomer);
    }

    @Override
    public Customer customerGetById(int Id) {

        return entityManager.find(Customer.class , Id);

    }


}

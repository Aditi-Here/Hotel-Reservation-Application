package com.hotelreservation.HotelReservationApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Details")
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "property_id")
    private int propertyId;

    @Column(name = "no_of_rooms")
    private int noOfRooms;

    @Column(name = "toilet")
    private boolean toilet;

    @Column(name = "no_of_persons")
    private int noOfPersons;

    @Column(name = "photo")
    private String photo;

    @Column(name = "amenities")
    private String amenities;
}

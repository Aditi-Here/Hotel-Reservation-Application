package com.hotelreservation.HotelReservationApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Amenities")
public class Amenities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "details_id")
    private int detailsId;

    @Column(name = "kitchen")
    private boolean kitchen;

    @Column(name = "wifi")
    private boolean wifi;

    @Column(name = "pets_allowed")
    private boolean petsAllowed;

    @Column(name = "ac")
    private boolean ac;

    @Column(name = "parking")
    private String parking;

    @Column(name = "workspace")
    private String workspace;

    public Amenities(String id, int detailsId, boolean kitchen, boolean wifi, boolean petsAllowed, boolean ac, String parking, String workspace) {
        this.id = id;
        this.detailsId = detailsId;
        this.kitchen = kitchen;
        this.wifi = wifi;
        this.petsAllowed = petsAllowed;
        this.ac = ac;
        this.parking = parking;
        this.workspace = workspace;
    }
}

package com.hotelreservation.HotelReservationApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Photos")
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "details_id")
    private int detailsId;

    @Column(name = "photo")
    private String photo;
}

package com.hotelreservation.HotelReservationApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "reservation_id")
    private int reservationId;

    @Column(name = "review")
    private String review;

    @Column(name = "date")
    private String date;

    @Column(name = "rating")
    private int rating;

    public Review(String id, String firstName, int reservationId, String lastName, String review, String date, int rating) {
        this.id = id;
        this.firstName = firstName;
        this.reservationId = reservationId;
        this.lastName = lastName;
        this.review = review;
        this.date = date;
        this.rating = rating;
    }
}

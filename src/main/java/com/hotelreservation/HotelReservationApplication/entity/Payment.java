package com.hotelreservation.HotelReservationApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "card_number")
    private int cardNumber;

    @Column(name = "user_id")
    private int userId;

    public Payment(String id, String firstName, String lastName, String email, int cardNumber, int userId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cardNumber = cardNumber;
        this.userId = userId;
    }
}

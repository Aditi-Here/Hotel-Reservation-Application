package com.hotelreservation.HotelReservationApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user-id")
    private String userId;

    @Column(name = "address")
    private String address;

    @Column(name = "details")
    private String details;

    @Column(name = "availability")
    private Boolean available;

    @Column(name = "price")
    private int price;

    @Column(name = "review")
    private String review;

    public Property(){}

    public Property(int id, String address, Boolean available, int price, String userId, String details, String review) {
        this.id = id;
        this.address = address;
        this.available = available;
        this.price = price;
        this.userId = userId;
        this.details = details;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", address='" + address + '\'' +
                ", details='" + details + '\'' +
                ", available=" + available +
                ", price=" + price +
                ", review='" + review + '\'' +
                '}';
    }
}

package com.hotelreservation.HotelReservationApplication.types;

public enum Role {
    USER("User"),
    OWNER("Owner");

    private final String value;

    private Role(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

}

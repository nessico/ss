package main.java.com.solvd.taxi.utils;

import main.java.com.solvd.taxi.human.Location;
import main.java.com.solvd.taxi.human.Passenger;

public class Booking extends BookingType {

    public Booking() {
    }

    public Booking(int id, Passenger passenger, Location startLocation, Location endLocation, boolean isCompleted) {
        super(id, passenger, startLocation, endLocation, isCompleted);
    }

    @Override
    public void confirmBooking() {
        // logic to confirm the booking
    }

}

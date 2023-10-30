package main.java.com.solvd.taxi.utils;

import main.java.com.solvd.taxi.human.Location;
import main.java.com.solvd.taxi.human.Passenger;

public class Booking {
    // Bookings made by passenger
    private int id;
    private Passenger passenger;
    private Location startLocation;
    private Location endLocation;
    private boolean isCompleted;

    public Booking() {
    }

    public Booking(int id, Passenger passenger, Location startLocation, Location endLocation, boolean isCompleted) {
        this.id = id;
        this.passenger = passenger;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.isCompleted = isCompleted;
    }

    // getters

    public int getId() {
        return id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }


}

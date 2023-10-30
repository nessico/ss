package main.java.com.solvd.taxi.car;

import main.java.com.solvd.taxi.human.Driver;
import main.java.com.solvd.taxi.human.Passenger;
import main.java.com.solvd.taxi.utils.Fare;
import main.java.com.solvd.taxi.human.Location;
import main.java.com.solvd.taxi.human.Rating;

public class Ride {

    private int id;
    private Driver driver;
    private Passenger passenger;
    private Location startLocation;
    private Location endLocation;
    private Fare fare;
    private Rating rating;
    private Vehicle vehicle;


    public Ride() {
    }

    public Ride(int id, Fare fare, Rating rating, Vehicle vehicle) {
        this.id = id;
        this.fare = fare;
        this.rating = rating;
        this.vehicle = vehicle;
    }

    // getters

    public int getId() {
        return id;
    }

    public Fare getFare() {
        return fare;
    }

    public Rating getRating() {
        return rating;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}





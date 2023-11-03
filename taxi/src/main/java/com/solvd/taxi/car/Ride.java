package main.java.com.solvd.taxi.car;

import main.java.com.solvd.taxi.human.Driver;
import main.java.com.solvd.taxi.human.Passenger;
import main.java.com.solvd.taxi.utils.Fare;
import main.java.com.solvd.taxi.human.Location;
import main.java.com.solvd.taxi.human.Rating;

public class Ride extends RideType {

    private int id;
    private Driver driver;
    private Passenger passenger;
    private Location startLocation;
    private Location endLocation;
    private Fare fare;
    private Rating rating;
    private Car car;


    public Ride() {
    }

    public Ride(int id, Fare fare, Rating rating, Car car) {
        this.id = id;
        this.fare = fare;
        this.rating = rating;
        this.car = car;
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

    public Car getVehicle() {
        return car;
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

    public void setVehicle(Car car) {
        this.car = car;
    }


    // set this as economy fare for testing
    @Override
    public double addCostService() {
        return 20;
    }
}





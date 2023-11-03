package main.java.com.solvd.taxi.car;

import main.java.com.solvd.taxi.human.Driver;
import main.java.com.solvd.taxi.human.Location;
import main.java.com.solvd.taxi.human.Passenger;
import main.java.com.solvd.taxi.human.Rating;
import main.java.com.solvd.taxi.utils.Fare;

public abstract class RideType {

    private int id;
    private Driver driver;
    private Passenger passenger;
    private Location startLocation;
    private Location endLocation;
    private Fare fare;
    private Rating rating;
    private Car car;


    // for economy service, premium service, etc
    public abstract double addCostService();

}

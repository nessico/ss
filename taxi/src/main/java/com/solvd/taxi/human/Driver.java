package main.java.com.solvd.taxi.human;

import main.java.com.solvd.taxi.car.Vehicle;
import main.java.com.solvd.taxi.utils.ServiceArea;

public class Driver {
    // Taxi driver

    private int id;
    private String name;
    private String phone;
    private Vehicle vehicle;
    private Rating rating;
    private float salary;

    private ServiceArea serviceArea;

    public Driver() {
    }

    public Driver(int id, String name, String phone, Vehicle vehicle, Rating rating, float salary, ServiceArea serviceArea) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicle = vehicle;
        this.rating = rating;
        this.salary = salary;
        this.serviceArea = serviceArea;
    }

    // getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getPhone() {
        return phone;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Rating getRating() {
        return rating;
    }

    public float getSalary() {
        return salary;
    }

    public ServiceArea getServiceArea() {
        return serviceArea;
    }

    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setServiceArea(ServiceArea serviceArea) {
        this.serviceArea = serviceArea;
    }


}

package main.java.com.solvd.taxi.car;

public class Vehicle {


    private String plate;
    private String make;
    private String model;

    private int year;

    public Vehicle() {
    }

    public Vehicle(String plate, String make, String model, int year) {

        this.plate = plate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // getters


    public String getPlate() {
        return plate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // setters


    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }


}

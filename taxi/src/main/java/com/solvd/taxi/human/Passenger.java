package main.java.com.solvd.taxi.human;

public class Passenger {

    private int id;
    private String name;
    private String phone;
    private Rating rating;

    public Passenger() {
    }

    public Passenger(int id, String name, String phone, Rating rating) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getPhone() {
        return phone;
    }

    public Rating getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }


}

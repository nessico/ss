package main.java.com.solvd.taxi.utils;

public class Payment {

    private double amount;
    private String currency;
    private String method;
    private String status;
    private String description;

    public Payment() {
    }

    public Payment(double amount, String currency, String method, String status, String description) {
        this.amount = amount;
        this.currency = currency;
        this.method = method;
        this.status = status;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getMethod() {
        return method;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "amount = " + amount + ", currency = " + currency + ", method = " + method + ", status = " + status + ", description = " + description;
    }


}

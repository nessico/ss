package main.java.com.solvd.taxi.utils;

public class CreditCardPayment extends PaymentType {

    public CreditCardPayment() {
        super();
    }

    public CreditCardPayment(double amount, String currency, String method, String status, String description) {
        super(amount, currency, method, status, description);
    }

    @Override
    public void processPayment() {
        // Implement payment processing logic for CreditCardPayment
    }

    @Override
    public String toString() {
        return "amount = " + getAmount() + ", currency = " + getCurrency() + ", method = " + getMethod() + ", status = " + getStatus() + ", description = " + getDescription();
    }
}

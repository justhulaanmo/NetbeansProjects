
package com.mycompany.pracc;
import java.util.Scanner;

// Base class Payment (abstract)
abstract class Payment {
    private double paymentAmount;

    // Constructor that accepts the payment amount
    public Payment(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    // Abstract method to process payment, must be implemented by derived classes
    public abstract void processPayment();

    // Method to get the payment amount
    public double getPaymentAmount() {
        return paymentAmount;
    }
}
// Derived class CreditCardPayment
class CreditCard extends Payment {
    // Constructor that calls the base class constructor
    public CreditCard(double paymentAmount) {
        super(paymentAmount);
    }
    // Implement the processPayment method
    @Override
    public void processPayment() {
        System.out.println("Payment of " + getPaymentAmount() + " processed via Credit Card.");
    }
}

// Derived class PayPalPayment
class PayPal extends Payment {
    // Constructor that calls the base class constructor
    public PayPal(double paymentAmount) {
        super(paymentAmount);
    }

    // Implement the processPayment method
    @Override
    public void processPayment() {
        System.out.println("Payment of " + getPaymentAmount() + " processed via PayPal.");
    }
}

public class Pracc {
    
    public static void main(String[] args) {
        
       
        Payment CreditCard = new CreditCard(100.50);
        CreditCard.processPayment();

        
        Payment PayPal = new PayPal(250.75);
        PayPal.processPayment();
    }
}
        
        
    


package com.mycompany.paymentprocessingsystem;


abstract class Payment {
   private double PaymentAmount;

    public Payment(double PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    public abstract void processPayment();

    public double getAmount() {
        return PaymentAmount;
    }
    class CreditCard extends Payment {
    public CreditCard(double PaymentAmount) {
       super(PaymentAmount);
    }
    @Override
    public void processPayment() {
        System.out.println("Your payment of " + getAmount() + " processed via Credit Card.");
    }
    }
    class PayPal extends Payment {
    public PayPal(double PaymentAmount) {
    super(PaymentAmount);
    }
    @Override
    public void processPayment() {
        
        System.out.println("Your payment of " + getAmount() + " processed via PayPal.");
    }
}
    
}

public class PaymentProcessingSystem {

    public static void main(String[] args) {
        Payment CreditCard = new CreditCard(10.00);
        CreditCard.processPayment();
        Payment PayPal = new PayPal(10.00);
        PayPal.processPayment();
    }
}

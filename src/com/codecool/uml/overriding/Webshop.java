package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        Order newOrder = new Order();
        System.out.println("Status: " + newOrder.getStatus());
        CheckoutProcess newCheckout = new CheckoutProcess();
        newCheckout.process(newOrder);
        System.out.println("Status: " + newOrder.getStatus());
        PaymentProcess newPayment = new PaymentProcess();
        newPayment.process(newOrder);
        System.out.println("Status: " + newOrder.getStatus());
    }
}

package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess{

    @Override
    protected void action(Orderable item) {
        if (item.pay())
            System.out.println("Payment done!");
        else
            System.out.println("Error during payment!");
    }
}

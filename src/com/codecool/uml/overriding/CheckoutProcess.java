package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    @Override
    protected void action(Orderable item) {
        if (item.checkout())
            System.out.println("Checkout done!");
        else
            System.out.println("Error during checkout!");
    }
}

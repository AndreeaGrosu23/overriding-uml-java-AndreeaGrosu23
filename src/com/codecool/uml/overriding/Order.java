package com.codecool.uml.overriding;

public class Order implements Orderable {
    private int id;
    private String status;
    static int setId=0;

    public Order() {
        setId++;
        id = setId;
        this.status = "new";
    }

    public String getStatus() {
        return this.status;
    }

    public boolean checkout() {
        this.status = "checked";
        return true;
    }

    public boolean pay() {
        this.status = "paid";
        return true;
    }

}

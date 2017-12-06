package com.epam.jcs.laboop.stationeryLogging;

public class Stationery {
    private int price;
    private String type;

    public Stationery() {};

    public Stationery(int price, String type) {
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

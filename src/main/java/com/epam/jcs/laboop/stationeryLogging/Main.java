package com.epam.jcs.laboop.stationeryLogging;

public class Main {
    public static void main(String[] args) {
        User cartman = new User("Cartman");
        cartman.addStationery(new Stationery(20, "pen"));
        cartman.addStationery(new Stationery(15, "pencil"));
        cartman.addStationery(new Stationery(35, "sharpener"));
        cartman.addStationery(new Stationery(30, "notebook"));
        System.out.println("Total stationery cost is " + cartman.calculateStationeryCost());
    }
}

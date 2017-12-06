package com.epam.jcs.laboop.stationeryLogging;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Set<Stationery> stationerySet = new HashSet<>();

    public void addStationery(Stationery stationery) {
        stationerySet.add(stationery);
    }

    public int calculateStationeryCost() {
        int totalCost = 0;
        for (Stationery s : stationerySet) {
            totalCost += s.getPrice();
        }
        return totalCost;
    }
}

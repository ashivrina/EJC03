package com.epam.jcs.hm2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Prints out a color of traffic light based on the entered number of minutes.
 *
 * @author Anna Shivrina
 */

public class TrafficLight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number of minutes.");
        String enteredString = reader.readLine();
        int enteredNumber = Integer.parseInt(enteredString);
        if (enteredNumber >= 0) {
            System.out.println(determineColour(enteredNumber));
        } else {
            System.out.println("Please enter a positive integer");
        }
    }

    /**
     * Returns a color of a traffic light based on an entered of minutes.
     *
     * @param minutes - entered number of minutes
     * @return color of the traffic light
     */
    private static String determineColour(int minutes) {
        int cleanNumberOfMinutes = minutes % 60;
        String color;
        if ((cleanNumberOfMinutes % 10 >= 0) && (cleanNumberOfMinutes % 10 < 2)) {
            color = "Red";
        } else if ((cleanNumberOfMinutes % 10 >= 2) && (cleanNumberOfMinutes % 10 < 5)) {
            color = "Yellow";
        } else if (cleanNumberOfMinutes % 10 >= 5) {
            color = "Green";
        } else {
            color = "Undefined. Don't know how this could have happened!";
        }
        return color;
    }
}

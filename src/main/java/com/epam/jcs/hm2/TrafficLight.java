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

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        System.out.println(trafficLight.determineColour(trafficLight.parseNumber(trafficLight.readLine())));
    }

    /**
     * Method that reads a string from console and returns it.
     *
     * @return a string entered by a user
     */
    private String readLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number of minutes.");
        String enteredString;
        try {
            enteredString = reader.readLine();
        } catch (IOException e) {
            System.out.println("Something went terribly wrong.");
            enteredString = "-1";
        }
        return enteredString;
    }

    /**
     * Method that converts a string entered by a user into a number and returns the number.
     *
     *
     * @param enteredString - string entered by a user
     * @return number resulting from parsing the string
     */
    public int parseNumber(String enteredString) {
        int enteredNumber;
        try {
            enteredNumber = Integer.parseInt(enteredString);
        } catch (NumberFormatException e) {
            enteredNumber = -1;
        }
        return enteredNumber;
    }

    /**
     * Returns a color of a traffic light based on an entered of minutes.
     *
     * @param minutes - entered number of minutes
     * @return color of the traffic light
     */
    public String determineColour(int minutes) {
        int cleanNumberOfMinutes = minutes % 60;
        int redLightMinutes = 2;
        int yellowLightMinutes = 3;
        int greenLightMinutes = 5;
        int trafficLightCycleMinutes = redLightMinutes + yellowLightMinutes + greenLightMinutes;
        String color;
        if (cleanNumberOfMinutes < 0) {
            color = "Undefined. Enter a positive integer.";
        } else if (cleanNumberOfMinutes % trafficLightCycleMinutes < redLightMinutes) {
            color = "Red";
        } else if ((cleanNumberOfMinutes % trafficLightCycleMinutes >= redLightMinutes) && (cleanNumberOfMinutes % trafficLightCycleMinutes < redLightMinutes + yellowLightMinutes)) {
            color = "Yellow";
        } else if (cleanNumberOfMinutes % trafficLightCycleMinutes >= redLightMinutes + yellowLightMinutes) {
            color = "Green";
        } else {
            color = "Undefined. Don't know how this could have happened!";
        }
        return color;
    }
}

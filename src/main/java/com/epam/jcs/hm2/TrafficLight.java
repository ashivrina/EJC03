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
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(trafficLight.getResult(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method checks if String is a number.
     *
     * @param argument - String that needs to be checked
     * @return - true if String is a number
     */
    private boolean isNumber(String argument) {
        return argument.matches("[-+]?\\d+");
    }

    /**
     * Method that converts a string into a number and returns the number.
     *
     * @param enteredString - string entered by a user
     * @return number resulting from parsing the string
     * @throws IllegalArgumentException
     */
    public int getNumberOfMinutes(String enteredString) {
        if (isNumber(enteredString)) {
            return Integer.parseInt(enteredString);
        }

        throw new IllegalArgumentException("You must enter number, you've entered " + enteredString);
    }

    /**
     * Returns a color of a traffic light based on an entered of minutes.
     *
     * @param minutes - entered number of minutes
     * @return color of the traffic light
     * @throws RuntimeException
     */
    public String determineColour(int minutes) {
        if (minutes < 0) {
            throw new RuntimeException("Incorrect number entered: " + minutes);
        }
        int cleanNumberOfMinutes = minutes % 60;
        int redLightMinutes = 2;
        int yellowLightMinutes = 3;
        int greenLightMinutes = 5;
        int trafficLightCycleMinutes = redLightMinutes + yellowLightMinutes + greenLightMinutes;
        String color;
        if (cleanNumberOfMinutes % trafficLightCycleMinutes < redLightMinutes) {
            color = "Red";
        } else if (cleanNumberOfMinutes % trafficLightCycleMinutes < redLightMinutes + yellowLightMinutes) {
            color = "Yellow";
        } else {
            color = "Green";
        }
        return color;
    }

    /**
     * Performs the operations to get the number and prints out the result.
     */
    private String getResult(String enteredString) {
        return determineColour(getNumberOfMinutes(enteredString));
    }
}

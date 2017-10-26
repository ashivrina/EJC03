package com.epam.jcs.l9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdentifyMonth {
    public static void main(String[] args) {
        IdentifyMonth identifyMonth = new IdentifyMonth();
        System.out.println("Please enter a number of a month");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(getMonth(identifyMonth.getNumber(reader.readLine())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isNumber(String enteredString) {
        return enteredString.matches("[-+]?\\d+");
    }

    public int getNumber(String enteredString) {
        if (isNumber(enteredString)) {
            return Integer.parseInt(enteredString);
        }

        throw new IllegalArgumentException("You must enter a number from 1 to 12, you've entered " + enteredString);
    }

    public static String getMonth(int number) {
        if (number == 1) {
            return "January";
        } else if (number == 2) {
            return "February";
        } else if (number == 3) {
            return "March";
        } else if (number == 4) {
            return "April";
        } else if (number == 5) {
            return "May";
        } else if (number == 6) {
            return "June";
        } else if (number == 7) {
            return "July";
        } else if (number == 8) {
            return "August";
        } else if (number == 9) {
            return "September";
        } else if (number == 10) {
            return "October";
        } else if (number == 11) {
            return "November";
        } else if (number == 12) {
            return "December";
        } else {
            throw new IllegalArgumentException("You must enter a number from 1 to 12, you've entered " + number);
        }
    }
}

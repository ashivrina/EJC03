package com.epam.jcs.hm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountBottles {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number of green bottles on the wall");
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String enteredString = reader.readLine();
        int enteredNumber = Integer.parseInt(enteredString);
        countDown(enteredNumber);
    }

    private static void countDown(int numberOfBottles) {
        if (numberOfBottles >= 0) {
            for (int i = numberOfBottles; i >= 0; i--) {
                if (i == 1) {
                    System.out.println(i + " green bottle standing on the wall.");
                } else if (i == 0) {
                    System.out.println("All green bottles've fallen. Go buy some more.");
                } else {
                    System.out.println(i + " green bottles standing on the wall.");
                }
            }
        } else {
            System.out.println("Incorrect number entered. Please enter a positive number or 0.");
        }
    }
}

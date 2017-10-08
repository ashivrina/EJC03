package com.epam.jcs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String enteredStr = reader.readLine();
        int numOfBottles = Integer.parseInt(enteredStr);

        if (numOfBottles >= 0) {
            for (int i = numOfBottles; i >= 0; i--) {
                if (i == 1) {
                    System.out.println(i + " bottle standing on the wall.");
                } else if (i == 0) {
                    System.out.println("All bottles've fallen. Go buy some more.");
                } else {
                    System.out.println(i + " bottles standing on the wall.");
                }
            }
        } else {
            System.out.println("Incorrect number entered. Please enter a positive number or 0.");
        }
    }
}

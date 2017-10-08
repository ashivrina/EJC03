package com.epam.jcs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String enteredStr = reader.readLine();
        int numOfBottles = Integer.parseInt(enteredStr);

        for (int i = numOfBottles; i >= 0; i--){
            if (i == 1){
                System.out.println(i + " bottle standing on the wall.");
            }
            else if (i == 0){
                System.out.println("All bottles've fallen. Go buy some more.");
            }
            else {
            System.out.println(i + " bottles standing on the wall.");
            }
        }
    }
}

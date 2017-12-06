package com.epam.jcs.labfundamentals;

public class ODArray {
    public static void main(String[] args) {
        ODArray odArray = new ODArray();
        double[] myArray = {1, 2, 3, 5};
        System.out.println(odArray.calculateMax(myArray));
    }

    private double calculateMax(double[] myNumbers) {
            double maximum = myNumbers[0] + myNumbers[myNumbers.length - 1];
            for(int i = 0; i < myNumbers.length; i++) {
                if (myNumbers[i] + myNumbers[myNumbers.length - i - 1] > maximum) {
                    maximum = myNumbers[i] + myNumbers[myNumbers.length - i - 1];
                }
            }
            return maximum;
    }
}

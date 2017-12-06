package com.epam.jcs.labfundamentals;

public class Loop {
    public static void main(String[] args) {
        calculateTangent(0, 100, 1);
    }

    private static void calculateTangent(int start, int end, int step) {
        System.out.format("%16s%40s", "Argument", "Result");
        System.out.println();
        for (int i = start; i <= end; i = i + step) {
            double y = Math.tan(2 * i) + 3;
            System.out.format("%16s%40s", Integer.toString(i) + " ", y);
            System.out.println();
        }
    }
}

package com.thoughtworks;

/**
 * Created by michal on 2/23/15.
 */
public class FizzBuzzExercise {
    public static void fizzBuzz(int n) {
        for (int i =1; i<n; i++) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int n) {
        String output;
        if ((n%3 == 0) && (n%5 == 0)) {
            output = "FizzBuzz";
        } else if (n%3 == 0) {
            output = "Fizz";
        } else if (n%5 == 0) {
            output = "Buzz";
        } else {
            output = String.valueOf(n);
        }
        System.out.println(output);
    }
}

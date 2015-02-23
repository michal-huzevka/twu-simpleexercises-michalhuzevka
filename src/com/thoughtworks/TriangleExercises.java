package com.thoughtworks;

/**
 * Created by michal on 2/23/15.
 */
public class TriangleExercises {

    public static void drawAsterisks() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i =0; i<n;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawVerticalLine(int n) {
        for (int i =0; i<n;i++) {
            System.out.println("*");
        }
    }

    public static void drawRightTriangle(int n) {
        for (int i =0; i<n; i++) {
            drawHorizontalLine(i+1);
        }
    }
}

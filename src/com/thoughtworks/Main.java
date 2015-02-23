package com.thoughtworks;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        drawAsterisks();
        drawHorizontalLine(5);
        drawRightTriangle(3);
        */
        drawIsoscelesTriangle(4);
    }

    public static void drawAsterisks() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i =0; i<n;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawRightTriangle(int n) {
        for (int i =0; i<n; i++) {
            drawHorizontalLine(i+1);
        }
    }

    public static void drawCenteredHorizontalLine(int n, int lineLength) {
        String result = "";
        StringBuilder builder = new StringBuilder();
        int blanksOnSide = (lineLength - n) / 2;
        for (int i =0; i<blanksOnSide; i++) {
            builder.append(" ");
        }
        for (int i=0; i<n; i++) {
            builder.append("*");
        }
        System.out.println(builder.toString());
    }

    public static void drawIsoscelesTriangle(int n){
        int lineLength = (n*2) - 1;
        for (int i =0; i<n; i++) {
            int asterisksCount = (i*2) +1;
            drawCenteredHorizontalLine(asterisksCount, lineLength);
        }
    }

    public static void drawDiamond(int n) {
        int lineLength = (n*2) - 1;
        for (int i =0; i<n; i++) {
            int asterisksCount = (i*2) +1;
            drawCenteredHorizontalLine(asterisksCount, lineLength);
        }
    }
}

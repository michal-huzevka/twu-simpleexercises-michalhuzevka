package com.thoughtworks;

/**
 * Created by michal on 2/23/15.
 */
public class DiamondExercises {

    private static void drawCenteredHorizontalLine(int n, int lineLength) {
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
        drawDiamond(n, null);
    }

    public static void drawDiamond(int n, String name) {
        int lineLength = (n*2) - 1;
        int asterisksCount = 0;
        for (int i =0; i<(n-1); i++) {
            asterisksCount = (i*2) +1;
            drawCenteredHorizontalLine(asterisksCount, lineLength);
        }
        if (name == null) {
            asterisksCount = (n * 2) - 1;
            drawCenteredHorizontalLine(asterisksCount, lineLength);
        } else {
            System.out.println(name);
        }
        for (int i= n-2; i >= 0; i--) {
            asterisksCount = (i*2) +1;
            drawCenteredHorizontalLine(asterisksCount, lineLength);
        }
    }
}

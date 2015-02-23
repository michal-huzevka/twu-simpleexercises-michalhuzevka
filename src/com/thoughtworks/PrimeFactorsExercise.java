package com.thoughtworks;

import java.util.*;

/**
 * Created by michal on 2/23/15.
 */
public class PrimeFactorsExercise
{
    public static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int subtotal = n;
        int i = getSmallestFactor(subtotal);
        while (i > 1) {
            subtotal = subtotal / i;
            list.add(i);
            i = getSmallestFactor(subtotal);
        }
        return list;
    }

    private static int getSmallestFactor(int n) {
        for (int i=2; i<=n; i++ ) {
            if (n % i == 0) {
                return i;
            }
        }
        return 0;
    }


}

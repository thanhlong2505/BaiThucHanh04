package com.gdragon.whiteboxtesting;

public class AlternatingSum {

    public static long calculate(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be >= 1.");
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        return sum;
    }
}

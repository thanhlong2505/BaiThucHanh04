package com.gdragon.whiteboxtesting;

public class FactorialSum {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0.");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long calculate(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be >= 1.");
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }

        return sum;
    }
}

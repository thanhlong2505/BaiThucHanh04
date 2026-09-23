package com.gdragon.whiteboxtesting;

public class QuadraticEquation {

    public record Result(Type type, double x1, double x2) {
        public enum Type {
            TWO_REAL_ROOTS,
            ONE_DOUBLE_ROOT,
            NO_REAL_ROOT,
            LINEAR_ONE_ROOT
        }
    }

    public static Result solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException("a and b cannot both be zero.");
            }
            double x = -c / b;
            return new Result(Result.Type.LINEAR_ONE_ROOT, x, x);
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            return new Result(Result.Type.TWO_REAL_ROOTS, x1, x2);
        }

        if (delta == 0) {
            double x = -b / (2 * a);
            return new Result(Result.Type.ONE_DOUBLE_ROOT, x, x);
        }

        return new Result(Result.Type.NO_REAL_ROOT, Double.NaN, Double.NaN);
    }
}

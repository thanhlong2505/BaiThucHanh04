package com.gdragon.whiteboxtesting;

public class Rectangle {

    public static double perimeter(double length, double width) {
        validateDimensions(length, width);
        return 2 * (length + width);
    }

    public static double area(double length, double width) {
        validateDimensions(length, width);
        return length * width;
    }

    private static void validateDimensions(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be non-negative.");
        }
    }
}

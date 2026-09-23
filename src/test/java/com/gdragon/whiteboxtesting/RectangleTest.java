package com.gdragon.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void perimeter_shouldReturnCorrectValue() {
        assertEquals(14.0, Rectangle.perimeter(3, 4));
    }

    @Test
    void area_shouldReturnCorrectValue() {
        assertEquals(12.0, Rectangle.area(3, 4));
    }

    @Test
    void zeroDimension_shouldBeAccepted() {
        assertEquals(6.0, Rectangle.perimeter(0, 3));
        assertEquals(0.0, Rectangle.area(0, 3));
    }

    @Test
    void negativeLength_shouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> Rectangle.perimeter(-1, 3));
    }

    @Test
    void negativeWidth_shouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> Rectangle.area(3, -1));
    }
}

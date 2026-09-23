package com.gdragon.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialSumTest {

    @Test
    void factorialZero() {
        assertEquals(1, FactorialSum.factorial(0));
    }

    @Test
    void factorialFive() {
        assertEquals(120, FactorialSum.factorial(5));
    }

    @Test
    void factorialNegative_shouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialSum.factorial(-1));
    }

    @Test
    void sumForOne() {
        assertEquals(1, FactorialSum.calculate(1));
    }

    @Test
    void sumForFour() {
        assertEquals(33, FactorialSum.calculate(4));
    }

    @Test
    void sumNegative_shouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialSum.calculate(0));
    }
}

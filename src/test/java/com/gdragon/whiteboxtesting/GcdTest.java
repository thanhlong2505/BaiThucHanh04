package com.gdragon.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdTest {

    @Test
    void commonCase() {
        assertEquals(6, Gcd.calculate(48, 18));
    }

    @Test
    void secondNumberZero() {
        assertEquals(7, Gcd.calculate(7, 0));
    }

    @Test
    void firstNumberZero() {
        assertEquals(5, Gcd.calculate(0, 5));
    }

    @Test
    void negativeNumbers() {
        assertEquals(6, Gcd.calculate(-48, -18));
    }

    @Test
    void bothZero() {
        assertEquals(0, Gcd.calculate(0, 0));
    }
}

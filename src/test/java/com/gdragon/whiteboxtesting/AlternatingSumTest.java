package com.gdragon.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingSumTest {

    @Test
    void nEqualsOne() {
        assertEquals(1, AlternatingSum.calculate(1));
    }

    @Test
    void evenN() {
        assertEquals(-2, AlternatingSum.calculate(4));
    }

    @Test
    void oddN() {
        assertEquals(3, AlternatingSum.calculate(5));
    }

    @Test
    void invalidN_shouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> AlternatingSum.calculate(0));
    }
}

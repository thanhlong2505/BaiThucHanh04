package com.gdragon.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void twoRealRoots() {
        var result = QuadraticEquation.solve(1, -3, 2);
        assertEquals(QuadraticEquation.Result.Type.TWO_REAL_ROOTS, result.type());
        assertEquals(2.0, result.x1(), 1e-9);
        assertEquals(1.0, result.x2(), 1e-9);
    }

    @Test
    void oneDoubleRoot() {
        var result = QuadraticEquation.solve(1, 2, 1);
        assertEquals(QuadraticEquation.Result.Type.ONE_DOUBLE_ROOT, result.type());
        assertEquals(-1.0, result.x1(), 1e-9);
        assertEquals(-1.0, result.x2(), 1e-9);
    }

    @Test
    void noRealRoot() {
        var result = QuadraticEquation.solve(1, 0, 1);
        assertEquals(QuadraticEquation.Result.Type.NO_REAL_ROOT, result.type());
        assertTrue(Double.isNaN(result.x1()));
        assertTrue(Double.isNaN(result.x2()));
    }

    @Test
    void aZero_shouldBecomeLinearEquation() {
        var result = QuadraticEquation.solve(0, 2, -4);
        assertEquals(QuadraticEquation.Result.Type.LINEAR_ONE_ROOT, result.type());
        assertEquals(2.0, result.x1(), 1e-9);
    }

    @Test
    void aAndBZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> QuadraticEquation.solve(0, 0, 5));
    }
}

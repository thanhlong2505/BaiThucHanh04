package com.gdragon.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysInMonthTest {

    @Test
    void january_shouldHave31Days() {
        assertEquals(31, DaysInMonth.getDays(1, 2025));
    }

    @Test
    void april_shouldHave30Days() {
        assertEquals(30, DaysInMonth.getDays(4, 2025));
    }

    @Test
    void februaryLeapYear_shouldHave29Days() {
        assertEquals(29, DaysInMonth.getDays(2, 2024));
    }

    @Test
    void februaryNonLeapYear_shouldHave28Days() {
        assertEquals(28, DaysInMonth.getDays(2, 2025));
    }

    @Test
    void centuryDivisibleBy400_shouldBeLeapYear() {
        assertTrue(DaysInMonth.isLeapYear(2000));
        assertEquals(29, DaysInMonth.getDays(2, 2000));
    }

    @Test
    void centuryNotDivisibleBy400_shouldNotBeLeapYear() {
        assertFalse(DaysInMonth.isLeapYear(1900));
        assertEquals(28, DaysInMonth.getDays(2, 1900));
    }

    @Test
    void invalidMonth_shouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> DaysInMonth.getDays(13, 2025));
    }
}

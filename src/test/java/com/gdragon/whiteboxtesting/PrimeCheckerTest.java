package com.gdragon.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void lessThanTwo_shouldNotBePrime() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(0));
        assertFalse(PrimeChecker.isPrime(-7));
    }

    @Test
    void two_shouldBePrime() {
        assertTrue(PrimeChecker.isPrime(2));
    }

    @Test
    void compositeEvenNumber_shouldNotBePrime() {
        assertFalse(PrimeChecker.isPrime(4));
    }

    @Test
    void compositeOddNumber_shouldNotBePrime() {
        assertFalse(PrimeChecker.isPrime(9));
    }

    @Test
    void primeNumber_shouldBePrime() {
        assertTrue(PrimeChecker.isPrime(17));
    }
}

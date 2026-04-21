package com.mycompany.numberutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest
{
     @Test
    void testFactorial() {
        NumberUtils utils = new NumberUtils();
        int result = utils.factorial(5);

        assertEquals(120, result);
    }

    @Test
    void testIsPrime() {
        NumberUtils utils = new NumberUtils();
        boolean result = utils.isPrime(5);

        assertTrue(result);
    }

    @Test
    void testIsNotPrime() {
        NumberUtils utils = new NumberUtils();
        boolean result = utils.isPrime(8);

        assertFalse(result);
    }
}

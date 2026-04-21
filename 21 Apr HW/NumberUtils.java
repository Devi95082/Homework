
package com.mycompany.numberutils;

public class NumberUtils 
{        
    // Factorial method
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number should be non-negative");
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Prime check method
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}

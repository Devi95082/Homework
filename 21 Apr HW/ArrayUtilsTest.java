package com.mycompany.factorialandprime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
public class ArrayUtilsTest 
{
    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("*****Test Started*****");
    }
    @BeforeEach
    public void befreEach()
    {
        System.out.println("***beforeeach test run***");
    }
    @Test
    void testFindMax() 
    {
        ArrayUtils utils = new ArrayUtils();
        int[] arr = {12, 5, 8, 20, 3};

        int result = utils.findMax(arr);

        assertEquals(20, result);
    }

    @Test
    void testFindMin()
    {
        ArrayUtils utils = new ArrayUtils();
        int[] arr = {12, 5, 8, 20, 3};

        int result = utils.findMin(arr);

        assertEquals(3, result);
    }

    @AfterEach
    public void afterEach()
    {
        System.out.println("***Aftereach test run***");
    }
    @AfterAll
    public static void AfterAll()
    {
        System.out.println("*****Test Ended*****");
    }
    
}

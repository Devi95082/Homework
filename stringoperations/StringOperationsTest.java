package com.mycompany.stringoperations;

import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringOperationsTest 
{
    
    @Test
    void testFindDuplicates() 
    {
        Set<Character> result = StringOperations.findDuplicates("programming");

        assertTrue(result.contains('r'));
        assertTrue(result.contains('g'));
        assertTrue(result.contains('m'));
        assertEquals(3, result.size());
    }

    @Test
    void testRemoveSpaces()
    {
        String result = StringOperations.removeSpaces("hello world");

        assertEquals("helloworld", result);
    }

    @Test
    void testReverseString() 
    {
        String result = StringOperations.reverseString("java");

        assertEquals("avaj", result);
    }

    @Test
    void testEmptyString() 
    {
        assertEquals("", StringOperations.reverseString(""));
        assertEquals("", StringOperations.removeSpaces(""));
        assertTrue(StringOperations.findDuplicates("").isEmpty());
    }
}

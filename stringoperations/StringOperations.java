
package com.mycompany.stringoperations;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringOperations 
{
    // Find duplicate characters
    public static Set<Character> findDuplicates(String str) 
    {
        Set<Character> duplicates = new HashSet<>();
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray())
        {
            if (seen.contains(ch) && ch != ' ') 
            {
                duplicates.add(ch);
            } 
            else 
            {
                seen.add(ch);
            }
        }
        return duplicates;
    }

    // Remove spaces
    public static String removeSpaces(String str) 
    {
        return str.replaceAll("\\s+", "");
    }

    // Reverse string
    public static String reverseString(String str) 
    {
        return new StringBuilder(str).reverse().toString();
    }

    // Menu-driven program
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        while (true)
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Find Duplicate Characters");
            System.out.println("2. Remove Spaces");
            System.out.println("3. Reverse String");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice)
            {
                case 1:
                    System.out.println("Duplicates: " + findDuplicates(input));
                    break;

                case 2:
                    System.out.println("Without spaces: " + removeSpaces(input));
                    break;

                case 3:
                    System.out.println("Reversed: " + reverseString(input));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

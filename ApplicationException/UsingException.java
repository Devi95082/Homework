package ApplicationException;

import java.util.Scanner;
public class UsingException 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String input = sc.nextLine();

        try
        {
            validateUserId(input);
        }
        catch (InvalidUserIdException e)
        {
            System.out.println(e.getMessage());
        }
     }
    public static void validateUserId(String input) throws InvalidUserIdException 
    {
        int userId;

        try 
        {
            userId = Integer.parseInt(input);

            if (userId <= 0) 
            {
                throw new InvalidUserIdException("User ID must be positive");
            }
            System.out.println("Valid User ID: " + userId);

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("User ID must be a number");
        }
    }

    
}

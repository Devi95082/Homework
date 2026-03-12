package numbergussinggame;

import java.util.Scanner;
import java.util.Random;

public class NumberGussingGame
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number1 = rand.nextInt(100) + 1;
         User call = new User();
        System.out.println("****Number Gussing Game****");
        System.out.println("You Have Only 10 Attempts");
        System.out.println("Guess a number between 1 and 100");
        int i;
        int n=10;
        for(i=0;i<n;i++)
        {
            int number=sc.nextInt();
             call.check(number, number1,i,n);
        }
        
        
       
       
       
        
        
        
    }
    
}


package PrimeNumber;
import java.util.Scanner;
public class Prime2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        Prime call = new Prime();
        call.findPrime(number);
    }
            
    
}

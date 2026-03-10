
package factorial;


public class Number 
{
    void findFactorial(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of "+n+" is "+fact);
    }
    
}

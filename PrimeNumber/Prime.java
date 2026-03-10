
package PrimeNumber;


public class Prime 
{
    void findPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(n+" Number is Prime Number");
        }
        else 
        {
            System.out.println(n+ " Number is Not Prime Number");
        }
    }
    
}

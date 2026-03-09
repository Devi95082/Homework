import java.util.Scanner;
class Factorial
{
      public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter The Number : ");
		  int N = sc.nextInt();
		  int fact=1;
		  int i=1;
		  
		while(i<=N)
		{
			fact=fact*i;
					
			i++;
			
		}
		System.out.print("Factorial is :" + fact);	
			
	  }
}
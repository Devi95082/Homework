import java.util.Scanner;
class EvenNumber
{
      public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter The Number : ");
		  int n = sc.nextInt();
		  int b = 1;
		  System.out.println("Even Number is ");
		  
		while(b<=n)
		{
			
			if(b%2==0)
			{
				System.out.println(b);
			}
			b++;
			
		}
			
	  }
}
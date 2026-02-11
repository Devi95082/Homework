import java.util.Scanner;
class Reverse
{
      public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter The Number : ");
		  int N = sc.nextInt();
		  
		while(N>=0)
		{
			System.out.print(" " +N);
			
			N--;
			
		}
			
	  }
}
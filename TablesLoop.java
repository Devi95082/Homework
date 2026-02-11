import java.util.Scanner;
class TablesLoop
{
      public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter Limit  : ");
		  int n = sc.nextInt();
		  
		  int b = 1;
		  System.out.println("Table Number: ");
		  
		  int a = sc.nextInt();
		  
		while(b<=n)
		{
			int d = a*b;
			System.out.println(b + "*" + a + "=" + d);
			
			b++;
			
		}
			
	  }
}
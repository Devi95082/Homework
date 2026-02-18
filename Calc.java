import java.util.Scanner;
class Calc
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		System.out.print("ENTER YOUR CHOICE :");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("ENTER VALUES :");
				int a=sc.nextInt();
				int b= sc.nextInt();
				int c=a+b;
				System.out.println("ADDITION VALUE IS : "+c );
			}
			break;
			case 2:
			{
				System.out.println("ENTER VALUES :");
				int a=sc.nextInt();
				int b= sc.nextInt();
				int c=a-b;
				System.out.println("SUBTRACTION VALUE IS : "+c );
			}
			break;
			case 3:
			{
				System.out.println("ENTER VALUES :");
				int a=sc.nextInt();
				int b= sc.nextInt();
				int c=a*b;
				System.out.println("MULTIPLICATION VALUE IS : "+c );
			}
			break;
			case 4:
			{
				System.out.println("ENTER VALUES :");
				int a=sc.nextInt();
				int b= sc.nextInt();
				if(b!=0)
				{	
				     int c=a/b;
				     System.out.println("DIVISION VALUE IS : "+c );
				}
				else
				{
					System.out.println("ERROR CANNOT DIVIDED BY ZERO");

				}
			
				
			}
			break;
		}
	}
}
import java.util.Scanner;
class SmartCity
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Smart City Utility Menu");
		System.out.println("1. Electricity Bill");
		System.out.println("2. Water Bill ");
		System.out.println("3. Internet Plan ");
		System.out.println("4. Exit");
		System.out.print("Enter your Option : ");
		
		int option = sc.nextInt();
		
	if(option==1)
		{

		    System.out.print("Enter your Units : ");
			
			int unit = sc.nextInt();
			
			if(unit<=100)
			{
				System.out.println("Electricity Bill : Rs.2 Per Unit");
			}
			else if(300<=unit<100)
			{
				System.out.println("Electricity Bill : Rs.3 Per Unit");
			}
			else if(unit>300)
			{
				System.out.println("Electricity Bill : Rs.5 Per Unit");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		
		else if(option==2)
		{
			System.out.println("1. Apartment");
		    System.out.println("2. Individual House");		    
		    System.out.print("Enter your House Type : ");
			
			int housetype = sc.nextInt();
			
			if(housetype==1)
			{
				System.out.println("Water bill Monthly charge = Rs.300 ");
			}
			else if(housetype==2)
			{
				System.out.println(" Water bill Monthly charge = Rs.300");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		
		else if(option==3)
		{
			System.out.println("1. Basic Plan");
		    System.out.println("2. Standard Plan");
			System.out.println("3. Premium Plan");
		    System.out.print("Enter your Plan : ");
			
			int Plan = sc.nextInt();
			
			if(Plan==1)
			{
				System.out.println(" Basic Plan : Rs.399");
			}
			else if(Plan==2)
			{
				System.out.println(" Standard Plan : Rs.699");
			}
			else if(Plan==3)
			{
				System.out.println(" Premium Plan : Rs.999")
			}
			else
			{
				System.out.println("Invalid Plan");
			}
		}
		else if(option==4)
		{
			System.out.println("Thank You for using Smart City Utility System");
		}
		
		
	}
}
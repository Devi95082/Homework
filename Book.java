import java.util.Scanner;
class Book
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to RKDP Bookshop");
		System.out.println("1. Academic Books");
		System.out.println("2. Story Books ");
		System.out.println("3. Magazines  ");
		System.out.println("4. Competitive Exam Books  ");
		System.out.println("5. Comics");
		System.out.print("Enter your choise : ");
		
		int choise = sc.nextInt();
		
		if(choise==1)
		{
			System.out.println("1. Maths");
		    System.out.println("2. Science");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Maths - Rs.200");
			}
			else if(option==2)
			{
				System.out.println("Science - Rs.250");
			}
			else
			{
				System.out.println("Not Available this kind of book");
			}
		}
		
		else if(choise==2)
		{
			System.out.println("1. Adventure Story");
		    System.out.println("2. Moral Story");		    
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Adventure Story – Rs.150");
			}
			else if(option==2)
			{
				System.out.println("Moral Story – Rs.120");
			}
			else
			{
				System.out.println("Not Available this kind of book");
			}
		}
		
		else if(choise==3)
		{
			System.out.println("1. Weekly Magazine");
		    System.out.println("2. Monthly Magazine");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Weekly Magazine – Rs.50");
			}
			else if(option==2)
			{
				System.out.println("Monthly Magazine – Rs.120");
			}
			
			else
			{
				System.out.println("Not Available this kind of book");
			}
		}
		else if(choise==4)
		{
			System.out.println("1. Banking Exam Book");
		    System.out.println("2. SSC Exam Book ");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Banking Exam Book – Rs.400");
			}
			else if(option==2)
			{
				System.out.println("SSC Exam Book – Rs.350");
			}
			
			else
			{
				System.out.println("Not Available this kind of book");
			}
		}
		else if(choise==5)
		{
			System.out.println("1. Kids Comics");
		    System.out.println("2. Superhero Comics");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Kids Comics – Rs.80");
			}
			else if(option==2)
			{
				System.out.println("Superhero Comics – Rs.120");
			}
			
			else
			{
				System.out.println("Not Available this kind of book");
			}
		}
		
		else
		{
			System.out.println("Your Choise is not available");
		}
		
	}
}
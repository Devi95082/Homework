import java.util.Scanner;
class Ticket
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		if(age>=60)
		{
			System.out.println("Rs.100");
		}	
        else if((age>=12)&&(age<60))	
		{
            System.out.println("Rs.150");
		}			
		else if(age<12)
		{
			System.out.println("Rs.80");
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
}
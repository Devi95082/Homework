import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String name="0";
		int roll=0;

		while(true)
		{
			System.out.println("1. Add Student");
		    System.out.println("2. Update Student" );
		    System.out.println("3. Display Details");
		    System.out.println("4. Exit");
		
		    System.out.println("Enter Choice : ");
		    int choice = sc.nextInt();
		   
		
		    switch(choice)
		    {
			    case 1 :
			    {
				   System.out.println("Enter Student Details: ");
				   
				   name=sc.nextLine();
				   roll = sc.nextInt();
			    }
			    break;
			    case 2 :
			    {
				   System.out.println("Enter New Name : ");
				   name=sc.nextLine();
                   roll = sc.nextInt();				   
				   
			    }
			    break;
			    case 3:
			    {
				   System.out.println("Student Details  "+name+"  "+roll);
		     	}
			    break;
				case 4:
				{
					System.out.println("Exit");
				}
				break;
		    	default :
			    {
				   System.out.println("Invalid Choice");
				   
				   return;
			    }
				
		    }
			
			
		}
	}
}
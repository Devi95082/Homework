import java.util.Scanner;
class EmployeeDetails
{
	public static void main(String[] atgs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of Employee : ");
		int n=sc.nextInt();
		int id[]=new int[n];
		int d[]=new int[id.length-1];
		
		int a=0;
		while(a!=4)
		{
			System.out.println("1. Add Employee ID");
			System.out.println("2. Remove Employee ID");
			System.out.println("3. Display Employee IDs");
			System.out.println("4. Exit");
			System.out.println("Enter choice:");
		    int c=sc.nextInt();
		 switch(c)
		 {
			case 1:
			{
				System.out.println("Enter Employee ID : ");
				for(int i=0;i<id.length;i++)
				{
					id[i]=sc.nextInt();
				}
				System.out.println("Employee Details Added.");
			}
			
			break;
			case 2:
			{
				int iv=0;
				System.out.println("Enter employee ID to remove: ");
				int r=sc.nextInt();
				
				for(int i=0;i<id.length;i++)
				{
					if(id[i]==r)
					{
						iv=i;
					}					
				}
				for(int i=0;i<iv;i++)
				{
					d[i]=id[i];
				}
				for(int i=iv;i<d.length;i++)
				{
					d[i]=id[i+1];
				}
				System.out.println("Employee ID removed");
			}
			break;
			case 3:
			{
				System.out.println("Employee ID is : ");
				for(int i=0;i<d.length;i++)
				{
					System.out.print(d[i]+" ");
				}
				System.out.println();
			}
			break;
			case 4:
			{
				System.out.println("Exit");
				
			}
			break;
			default :
			System.out.println("Invalid Choice ");
			
		 }
		 a++;
		}
	}
}
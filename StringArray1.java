import java.util.Scanner;
class StringArray1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of row :");
		int r = sc.nextInt();
		System.out.print("Enter number of columns:");
		int c = sc.nextInt();

        String ar[][] = new String[r][c];
		
		int choice = 0;
		while(choice!=3)
		{
			System.out.println("\n--- MENU ---");
            System.out.println("1. Insert ");
            System.out.println("2. Display");
		    System.out.println("3. Exit");
		    System.out.print("Enter Your choice :");
			choice = sc.nextInt();
			
	        if(choice==1)
			{
				 System.out.println("Enter String Elements :");
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						System.out.print("ar["+i+","+j+"] :");
						ar[i][j]=sc.next();
					}
				}
			}
			else if(choice==2)
			{
				System.out.println("Array Elements:");
				
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
					   System.out.print(ar[i][j]);
					}
					   System.out.println();
				}
			}
			else if(choice==3)
			{
				System.out.println("Exit");
			}
			

			
			
		}
		
	}
}
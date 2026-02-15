import java.util.Scanner;
class MenuDrive2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array length : ");
		int len = sc.nextInt();

		int ar[] = new int[len];
		
		int choice = 0;
		while(choice!=5)
		{
			System.out.println("\n--- MENU ---");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Count Even Numbers");
            System.out.println("4. Count Odd Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
			
			if(choice==1)
			{
				for(int i = 0; i<ar.length;i++)
		        {
			
		          System.out.print("Enter the "+i+" index Value : ");
			      ar[i]=sc.nextInt();
		        }
		
		          System.out.print("Array value is :");
				
			}
			else if(choice==2)
			{
				System.out.println("Array Elements:");
                for(int i = 0; i < ar.length; i++)
                {
                    System.out.println(ar[i]);
                }
			}
			else if(choice==3)
			{
				 int even = 0;
                for(int i = 0; i < ar.length; i++)
                {
                    if(ar[i] % 2 == 0)
                        even++;
                }
                System.out.println("Even count: " + even);
            }
			else if(choice==4)
			{
				 int odd = 0;
                for(int i = 0; i < ar.length; i++)
                {
                    if(ar[i] % 2 != 0)
                        odd++;
                }
                System.out.println("Odd count: " + odd);
			}	
			else if(choice==5)
			{
				 System.out.println("Program Ended");
			}
            else
			{
				 System.out.println("Invalid Choice");
			}	
		
			
		}
	}
}		

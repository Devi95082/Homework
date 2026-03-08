import java.util.Scanner;
class Library
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
	
		Books ar[] = new Books[100];
		int count = 0;
		int choice;
		
		do
		{
			System.out.println("****Welcome to Library****");
			System.out.println("1. Add Book");
			System.out.println("2. Display All Books");
			System.out.println("3. Borrow book");
			System.out.println("4. Return Book");
			System.out.println("5. Exit");
			
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			
			
            switch(choice)
			{
				case 1 :
				{
					System.out.println("Enter Book ID :");
					int id=sc.nextInt();
			        System.out.println("Enter Book Title :");
					String n=sb.nextLine();
			        System.out.println("Enter Author Name :");
					String a=sb.nextLine();
					ar[count]=new Books(id,n,a);
					count++;				
				}
				break;
				case 2:
				{
					if(count==0)
					{
						System.out.println("Books Not Available");
					}
					else
					{
						for(int i=0;i<count;i++)
						{
							ar[i].display();
						}
					}
				}
				break;
				case 3:
				{
					System.out.println("Enter Borrow book ID");
					int bid=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(ar[i].bookid==bid)
						{
							ar[i].borrow();							
						}
					}
				}
				break;
				case 4:
				{
					System.out.println("Enter Return Book ID");
					int rid=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						ar[i].returnbook();						
					}
				}
				break;
				case 5:
				{
					System.out.println("Exit");					
				}
				break;
				default:
				{
					System.out.println("Invalid Choice");	
				}			
				
				
			}			
			
			
		}while(choice!=5);
	}
}

import java.util.Scanner;
class Expensive
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER ARRAY LENGTH  : ");
		int len=sc.nextInt();
		int ar[] = new int[len];
		int c=0;
		System.out.println("ENTER EXPENSE AMOUNT  : ");
		int amount=sc.nextInt();
        Expensive add= new Expensive();
		add.addexpen(ar,c,amount);
		System.out.println("1. ADD EXPENSES");
		System.out.println("2. VIEW ALL EXPENSES");
		System.out.println("3. CALCULATE TOTAL EXPENSES");
		System.out.println("4. FIND HIGHEST EXPENSES");
		System.out.println("5. EXIT");
		System.out.print("ENTER CHOICE : ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				int br[]=add.addexpen(ar,c,amount);
			}
			case 2:
			{
				add.view(br);
			}
			case 3:
			{
				add.highest(br);
				
			}
			break;
			case 4:
			{
				add.total(br);
				
			}
			break;
			case 5:
			{
				System.out.println("Exit");
			}
			break;
			default :
			System.out.println("Invaild Choice");
		}
		
		
		
	}
	void addexpen(int br[],int i,int a)
	{
		br[i]=a;
		System.out.print("EXPENSE ADDED SUCCESSFULLY");		
		
	}
	void view(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
	void highest(int ar[])
	{
		int high=ar[0];
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>high)
			{
				high=ar[i];
			}
	
		}
		System.out.println("Pass Score Count is : "+high);
		
	}
	void total(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			
		}
		System.out.println("Fail Score Count is : "+sum);
		
	}

	
	
	
}
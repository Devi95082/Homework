import java.util.Scanner;
class ValueReference
{
	public static void main(String[] args)
	{
		
	    Scanner sc=new Scanner(System.in);
        ValueReference call=new ValueReference();
		
		System.out.println("1. Pass by Value - Increase Marks");
		System.out.println("2. Pass BY Reference - Update Student Marks");
		System.out.println("3. Pass BY Value - Change String");
		System.out.println("4. Pass BY Reference - Modify Array");
		System.out.println("5. Exit");
        System.out.println("Enter Choice");	
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter Mark :");
				int mark=70;
				System.out.println("Before Method Call : "+mark);
				call.value(mark);
				System.out.println("After Method Call : "+mark);
			}
			break;
			case 2: 
			{
				System.out.print("Enter Mark : ");
				int mr[] = new int[1];
				mr[0]=sc.nextInt();
				System.out.println("Before Method Call : "+mr[0]);
				call.markRefer(mr);
				System.out.println("After Method Call : "+mr[0]);
			}
			break;
			case 3:
			{
				System.out.println("Enter name :");
				String n="Ravi";
				
				System.out.println("Before Method Call : "+n);
				call.name(n);
				System.out.println("After Method Call : "+n);
				
			}
			break;
			case 4:
			{
				System.out.println("Enter Array element");
				int ar[]=new int[3];
				for(int i=0;i<ar.length;i++)
				{
					ar[i]=sc.nextInt();
					
				}
				System.out.println("Before Method Call : ");
				for(int i=0;i<ar.length;i++)
				{
					System.out.print(+ar[i]+" ");
				}
			    System.out.println();

				
				call.reference(ar);
				System.out.println("After Method Call : ");

				for(int i=0;i<ar.length;i++)
				{
					System.out.print(ar[i]+" ");
				}
				
			}
			break;
			case 5:
			System.out.println("Exit ");
			default :
			System.out.println("Invalid Choice ");
		}
		
	}
	void value(int b)
	{
		b=80;
		System.out.println("Inside Method : "+b);
	}
	void markRefer(int ar[])
	{
		ar[0]=75;
		System.out.print("Inside Method:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);		
			
		}
	}
	void name(String b)
	{
		b="RaviKumar";
		System.out.println("Inside Method : "+b);
	}
	void reference(int ar[])
	{
		ar[0]=99;
		System.out.println("Inside Method:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");		
			
		}
		System.out.println();

	}
	
}
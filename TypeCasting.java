import java.util.Scanner;
class TypeCasting
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Choice : ");
		 int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter Integer value :");
				int a=sc.nextInt();
				double d = (double)a;
				System.out.print("Double Value is : "+d);
			}
			break;
			case 2:
			{
				System.out.print("Enter double value :");
				double a=sc.nextDouble();
				int d = (int)a;
				System.out.print("Integer Value is : "+d);
			}
			break;
			case 3:
			{
				System.out.print("Enter Char value :");
				char a = sc.next().charAt(0);
				int d =(int)a;
				System.out.print("Integer Value is : "+d);
			}
			break;
			case 4:
			{
				System.out.print("Enter Integer value :");
				int a=sc.nextInt();
				char d =(char)a;
				System.out.print("Charecter Value is : "+d);
			}
			break;
			default :
			System.out.println("Invalid Choice");
		}
	}
}
import java.util.Scanner;
class OrderStatus
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Signal code : ");
		char code = sc.next().charAt(0);
		switch(code)
		{
			case 'p':
			System.out.println("Order placed");
			break;
			case 's':
			System.out.println("Shipped");
			break;
			case 'd':
			System.out.println("Delivered");
			break;
			case 'c':
			System.out.println("Cancelled");
			break;
			default :
			System.out.println("Invaild code");
			
		}
	}
}
			
		
import java.util.Scanner;
class Traffic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Signal color : ");
		char color = sc.next().charAt(0);
		switch(color)
		{
			case 'r':
			System.out.println("Stop");
			break;
			case 'y':
			System.out.println("Ready");
			break;
			case 'g':
			System.out.println("GO");
			break;
			default :
			System.out.println("Invaild Option");
			
		}
	}
}
			
		
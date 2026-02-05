import java.util.Scanner;
class BatteryPercentage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Battery Percentage : ");
		int battery = sc.nextInt();
		if(battery>=80)
		{
			System.out.println("Battery Full");
		}	
        else if((battery>=30)&&(battery<80))	
		{
            System.out.println("Battery Normal");
		}			
		else if(battery<30)
		{
			System.out.println("Low Battery – Charge Now");
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
}
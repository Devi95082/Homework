import java.util.Scanner;
class Area1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(choice!=5)
		{	
		System.out.println("1. AREA OF SQUARE");
		System.out.println("2. AREA OF RECTANGLE");
		System.out.println("3. AREA OF CIRCLE");
		System.out.println("4. AREA OF TRIANGLE");
		System.out.println("5. EXIT");
		System.out.print("ENTER YOUR CHOICE : ");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				Area s= new Area();
				System.out.print("ENTER YOUR SIDES VALUE : ");
				int side=sc.nextInt();				
				int a=s.square(side);
				System.out.println("AREA OF SQUARE IS : " +a);
			}
			break;
			
			case 2:
			{
				Area s=new Area();
				System.out.print("ENTER LENGTH : ");
				int l=sc.nextInt();
				System.out.print("ENTER BREADTH: ");
				int b=sc.nextInt();
				int a=s.rect(l,b);
				System.out.println("AREA OF RECTANGLE IS : "+a);

			}
			break;
			case 3:
			{
				Area s=new Area();
				System.out.println("ENTER RADIUS : ");
		        int r=sc.nextInt();
				float a=s.circle(r);
				System.out.println("AREA OF CIRCLE IS : "+a);				
			}
			break;
			case 4:
			{
				Area s=new Area();
				System.out.print("ENTER BASE : ");
				int b=sc.nextInt();
				System.out.print("ENTER HIGHT: ");
				int h=sc.nextInt();
				int a=s.rect(b,h);
				System.out.println("AREA OF TRIANGLE IS : "+a);
				
			}
			break;
			case 5:
			{
			    System.out.println("EXIT");

			}
			break;
			default :
				System.out.println("INVALID CHOICE");

			
		}}
	}
	int square(int s)
	{
		int area=s*s;
		return area;
	}
	int rect(int l,int b)
	{
		int area = l*b;
		return area;	
		
	}
	float circle(int r)
	{
		
		float area=(22/7)*r*r;
		return area;
		
	}
	int triangle(int b,int h)
	{
		int area=1/2*b*h;
		return area;
	}
	
}
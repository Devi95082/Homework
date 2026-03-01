import java.util.Scanner;
class Linear 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int l=sc.nextInt();
		System.out.println("Enter Array Elements");
		int ar[]= new int[l];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter Target Elements");
		int target=sc.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
				System.out.println("Index value is :"+i);
			}
			
		}
		
	}
}
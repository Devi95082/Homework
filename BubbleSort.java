import java.util.Scanner;
class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length :");
		int len=sc.nextInt();
		int ar[] = new int[len];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		for(int i = 0;i<ar.length-1;i++)
		{
			for(int j = 0; j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array is :");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		int pass=ar.length-1;
		System.out.println("Number of Passes : "+pass);
		
		
	}
}
import java.util.Scanner;
class Binary
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
		Binary bs=new Binary();
		int res=bs.bsearch(ar,target);
		System.out.println("Index value of"+ target +"is :"+res);
			
		
	}
	int bsearch(int ar[],int t)
	{
		int start=0;
		int end=ar.length-1;
		int mid=0;
		while(start<=end)
		{
			mid=(start+end)/2;
            if(ar[mid]==t)
			{
				int index=mid;
				
				return index;
			}
			else if(ar[mid]<t)
			{
				start=mid+1;
			}
			else if(ar[mid]>t)
			{
				end=mid-1;
			}		
		}
		return -1;
	}
}
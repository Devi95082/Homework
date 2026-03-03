import java.util.Scanner;
import java.util.Arrays;

class MergeSort
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
		MergeSort ms = new MergeSort();
		int res[] = ms.divide(ar);
		 System.out.println("Sorted Array is :");
		for(int i=0;i<ar.length;i++)
		{
	       
	        System.out.print(res[i]+" ");
		}
		 System.out.println();
		int start=0;
		int end=res.length;
		int mid=(start+end)/2;
		System.out.println("Middle Element of sorted Array is : "+res[mid]);
	}
	int[] divide(int ar[])
	{
		if(ar.length<=1)
		{
			return ar;
		}
		int mid = ar.length/2;
		int left[] = divide(Arrays.copyOfRange(ar,0,mid));
		int right[] = divide(Arrays.copyOfRange(ar,mid,ar.length));
		return conquer(left,right);
		
	}
	int[] conquer(int left[],int right[])
	{
		int i =0;
		int j =0;
		int k =0;
		int newArray[] = new int[left.length+right.length];
		
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				newArray[k]=left[i];
				i++;
				k++;
			}
			else
			{
				newArray[k]=right[j];
				j++;
				k++;
			}
				
		}
		while(i<left.length)
		{
			newArray[k]=left[i];
				i++;
				k++;
		}
		while(j<right.length)
		{
			newArray[k]=right[j];
				j++;
				k++;
		}
		return newArray;
	}
}
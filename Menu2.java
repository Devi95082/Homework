import java.util.Scanner;
class Menu2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER ARRAY LENGTH :");
		int len=sc.nextInt();
		
		int ar[]=new int[len];
		System.out.println("ENTER ARRAY ELEMENTS :");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("ENTER THE "+i+" INDEX VALUE : ");
			ar[i]=sc.nextInt();
		}
		
			System.out.println("********************************************");
		
			System.out.println("1. FIND MAXIMUM NUBER");
			System.out.println("2. FIND MINIMUM NUBER");
			System.out.println("3. FIND SECOND MAXIMUM NUBER");
			System.out.println("4. FIND SECOND MINIMUM NUBER");
			System.out.println("5. REVERSE THE ARRAY");
			System.out.print("ENTER YOUR OPTION : ");
			int option=sc.nextInt();
			
		switch(option)
		{		    
			
		  case 1:	
		    
		      int max=ar[0];
		      for(int i=1;i<ar.length;i++)
		     {
		    	if(ar[i]>max)
			    {
				   max=ar[i];
			    }
		     }
		        System.out.print("MAXIMUM NUMBER IS :"+ max);
				
				
				
		    
			break;
		  case 2:
		    
			  int min=ar[0];
		
		      for(int i=0;i<ar.length;i++)
		      {
			     if(ar[i]<min)
			     {
				    min=ar[i];
			     }
		      }
		           System.out.print("MINIMUM NUMBER IS :"+ min);
		    		  
 		    break;
		    case 3:
		    {
		          int maxvalue=0;
		          int secmax=0;
		
		          for(int i=0;i<ar.length;i++)
		          {
			          if(ar[i]>maxvalue)
			          {
				            secmax=maxvalue;
				            maxvalue=ar[i];
			          }
			          else if(ar[i]>secmax && ar[i]!=maxvalue)
			          {
				           secmax=ar[i];
			          }
		          }
		            System.out.println("Second Maximum Value is: "+secmax);
		    }
		  break;
		  case 4:
		  {
			 int minvalue=ar[0];
		     int secmin=ar[1];
		
		    for(int i=0;i<ar.length;i++)
		    {
			   if(ar[i]<minvalue)
			    {
				  secmin=minvalue;
				  minvalue=ar[i];
			    }
			    else if(ar[i]<secmin && ar[i]!=minvalue)
			    {
				     secmin=ar[i];
			    }    
		    }
		        System.out.println("Second Minimum Value is: "+secmin); 
		  }
		  break;
		  case 5:
		     
			for(int i=ar.length-1;i>=0;i--)
		    {
			         System.out.print(ar[i]+" ");
		    }
			break;
		  default:
		  System.out.println("INVALID OPTION");
		  
		  
		}	  
	}
}
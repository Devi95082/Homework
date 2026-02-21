import java.util.Scanner;
class ExamMark
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
		    System.out.print("Enter Number of Students : ");
		    int length=sc.nextInt();
		    int tm[] = new int [length];
			System.out.print("Enter choice : ");		    
			int c=1;
		
		    while(c<=5)
		    {
				System.out.println("1. Add Exam Score");
		        System.out.println("2. Display the Exam Score");
		        System.out.println("3. Count Pass Score");
		        System.out.println("4. Count the Fail Score");
		        System.out.println("5. EXIT");
				 System.out.println("*****************************************************************");

		        System.out.print("ENTER CHOICE : ");
		        int choice=sc.nextInt();
                Exam score=new Exam();
				switch(choice)
		        {
			        case 1:
			       {
				     
					  for(int i=0;i<tm.length;i++)
					  {
					    System.out.print("Enter index value : ");
		                int ivalue=sc.nextInt();
					    System.out.print("Enter mark : ");
					    int marks=sc.nextInt();
						tm=score.addscore(tm,ivalue,marks);  
					  }
		              	       	  				
				   }
			       break;
			       case 2:
			        {
				      score.display(tm);
			        }
			        break;
			        case 3:
			        {
				      score.pass(tm);				
			        }
			        break;
			        case 4:
			        {
				       score.fail(tm);
			        }
			        break;
			        case 5:
			        {
				       System.out.println("Exit");
			        }
			        break;
			        default:
			        System.out.println("Invaild Choice");
		        }
				c++;
			}
    	}
		
		
		//function1
		int[] addscore(int ar[],int i,int m)
	{
		
		ar[i]=m;
		m++;
		System.out.println("Exma Score Added Successfully");
		return ar;
	}
	
	//function2
	void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	//function3
	void pass(int ar[])
	{
		int pass=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>=35)
			{
				pass++;
			}
	
		}
		System.out.println("Pass Score Count is : "+pass);
		
	}
	//function4
	void fail(int ar[])
	{
		int fail=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<35)
		    {
			  fail++;
		    }
			
		}
		System.out.println("Fail Score Count is : "+fail);
		
    }
}
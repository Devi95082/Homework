import java.util.Scnner;
class Exam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Length : ");
		int length=sc.nextInt();
		int tm[] = new int [length];
		System.out.println("1. Add Exam Score");
		System.out.println("2. Display the Exam Score");
		System.out.println("3. Count Pass Score");
		System.out.println("4. Count the Fail Score");
		System.out.println("5. EXIT");
		System.out.print("ENTER CHOICE : ");
		int choice=sc.nextInt();
        Exam score=new Exam();		
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter index value : ");
		        int ivalue=sc.nextInt();
		        System.out.print("Enter mark : ");
		        int marks=sc.nextInt();
				int cr[]=score.addscore(tm,ivalue,marks);
				
			}
			break;
			case 2:
			{
				score.display(cr);
			}
			break;
			case 3:
			{
				score.pass(cr);				
			}
			break;
			case 4:
			{
				score.fail(cr);
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

				
	}
	int addscore(int ar[],int i,int m)
	{
		ar[i]=m;
		m++;
		System.out.println("Exma Score Added Successfully");
		return ar;
	}
	void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
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
	void fail(int ar[])
	{
		int fail=0;
		for(int i=0;i<ar.length;i++)
		{
			if(cr[i]<35)
		    {
			  fail++;
		    }
			
		}
		System.out.println("Fail Score Count is : "+fail);
		
	}
}
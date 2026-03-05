class Bank
{
	public static void main(String[] args)
	{
		int deposit(int b,int amt)
		{
			b=b+amt;
			return b;
		}
		int withdraw(int b,int amt)
		{
			if(b>amt)				
			{		
		        b=b-amt;
			}	
		    else 
			{
				System.out.println("Insufficient Balance");
			}
			return b;
		}
	
		
		
	}
	
}
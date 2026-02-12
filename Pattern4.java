class Pattern4
{
	public static void main(String[] args)
	{
		int r = 6;
		for(int i=1;i<=r;i++)
		{
			
			
				for(int k=r-1;k>=i;k--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++)			
			   {
				System.out.print("*");
			   }
			System.out.println();
		}D
		
		for(int i=r-1;i>=1;i--)
		{
			
			
				for(int k=1;k<=r-i;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++)			
			   {
				System.out.print("*");
			   }
			System.out.println();
		}
		
	}
	
}
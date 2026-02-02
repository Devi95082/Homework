class LeapYear
{
	public static void main(String[] args)
	{
		int year = 2024;
		int Leapyear = year%4;
		boolean Year = (Leapyear==0);
		
		System.out.println("Leap Year :" + Year);
	}

}
class Logical
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		boolean c = (a>b)&&(a==b);
		boolean d = (a>b)||(a==b);
		boolean e = !((a>b)||(a==b));
		System.out.println("Using AND :" + c);
		System.out.println("Using OR :" + d);
		System.out.println("Using NOT :" + e);
	}
}
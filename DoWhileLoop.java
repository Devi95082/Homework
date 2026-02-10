import java.util.Scanner;
class DoWhileLoop
{
      public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter The Number : ");
		  int n = sc.nextInt();
		  int i = 1;
		  do
		  {
			  System.out.println(i);
			  i++;
			  
		  }while(i<=n);
		  
	  }
}
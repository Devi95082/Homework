package exceptionhandling;

import java.util.Scanner;
public class ExceptionHandling
{

   static String name=null;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner sb=new Scanner(System.in);
        int a;
        int b;
        int choice;
        do
        {
            System.out.println("1. Arthimatic Exception Module");
            System.out.println("2. Null Pointer Exception Module");
            System.out.println("3. Array Index out of Bounds Module");
            System.out.println("4. Exit ");
            
            System.out.println("ENter Choice");
            choice=sc.nextInt();
             switch(choice)
             {
                 case 1 :
                 {
                     System.out.println("Enter the Numbers a and b :" );
                     a=sc.nextInt();
                     b=sc.nextInt();
                                     
                     try
                     {
                       int c=a/b;
                       System.out.println("Division Value is : "+c);
                     }
                     catch(ArithmeticException ex)
                     {
                         System.out.println("Don't Enter Zero,Enter any Integer Number "); 
                     }
                     finally
                     {
                         System.out.println("Thank You");
                     }
                 }
                 break;
                 case 2:
                 {
                      System.out.println("Enter the Name:" );
                      
                      System.out.println(name);
                      
                 }
                 break;
                 case 3:
                 {
                     int ar[]={10,20,30,40};
                     try
                     {
                          System.out.println(ar[5]);
                     }
                     catch(ArrayIndexOutOfBoundsException ex)
                     {
                         System.out.println("Enter Valid Index Number");
                     }
                     finally
                     {
                         System.out.println("Thank You");
                     }
                    
                 }
                 break;
                 case 4 :
                 {
                     System.out.println("Exit the Program....");
                 }
                 break;
                 default:
                 {
                      System.out.println("Invalid Choice...");
                 }
             }
            
        }while(choice<4);
    }
    
}

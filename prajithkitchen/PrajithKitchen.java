package prajithkitchen;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class PrajithKitchen
{
    public static void main(String[] args)
    {
        Queue order = new LinkedList();
        
        Scanner sc=new Scanner(System.in);
         Scanner sb=new Scanner(System.in);
        Stack st= new Stack();
        int choice;
        
      
        do
        {
            System.out.println("1. Add Order");
            System.out.println("2. Serve Order");
            System.out.println("3. View Next Order");
            System.out.println("4. Display All Orders");
            System.out.println("5. Exit");
            System.out.println("Enter Choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("Enter order");
                    String orderitem=sb.nextLine();
                    order.add(orderitem);
                    System.out.println("Order Added : "+orderitem);
                }
                break;
                case 2:
                {
                    if(order.isEmpty())
                    {
                        System.out.println("No order found");
                    }
                    else
                    {
                        String food= (String) order.poll();
                        System.out.println("Served Order : "+food);
                    }
                }
                break;
                case 3:
                {
                     if(order.isEmpty())
                    {
                        System.out.println("No order found");
                    }
                    else
                     {
                         System.out.println("Next Order : "+order.peek());
                     }                    
                }
                break;
                case 4:
                {
                     if(order.isEmpty())
                    {
                        System.out.println("No order pending");
                    }
                    else
                     {
                         System.out.println("Pending order : "+ order);
                         
                     }
                }
                break;
                case 5:
                {
                     System.out.println("Exit ");
                }
                break;
                default:
                {
                     System.out.println("Invalid Choice");
                }
                
            }
            
        }while(choice!=5);
        
    }
    
}

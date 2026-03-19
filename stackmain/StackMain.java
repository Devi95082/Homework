package stackmain;
import java.util.Stack;
import java.util.Scanner;
public class StackMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         Scanner sb=new Scanner(System.in);
        Stack st= new Stack();
        int choice;
        
      
        do
        {
            System.out.println("1. Add Item");
            System.out.println("2. Undo Last Item");
            System.out.println("3. View Last Scanned item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.println("Enter Choice");
            choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.print("Enter Item Name :  ");
                String name=sb.nextLine();
                st.push(name);
                System.out.println("Item Added : "+name);
            }
            break;
            case 2:
            {
                if(!st.isEmpty())
                {
                System.out.println("Remove Last Scanned Item : "+ st.peek());
                st.pop();
                }
                else
                {
                     System.out.println("NO Items Remove..... ");
                }
                //System.out.println("Last item removed Successfully...");
            }
            break;
            case 3:
            {
                 if(!st.isEmpty())
                {
                   System.out.print("Last Scanned Item : "+ st.peek());
                }
                 else
                 {
                        System.out.println("NO Items Available..... ");
                 }
                System.out.println();
            }
            break;
            case 4:
            {
                if(!st.isEmpty())
                {
                   System.out.println("scanned Items : "+ st);
                }
                else
                {
                      System.out.println("No items Scanned yet....");
                }
            }
            break;
            case 5:
            {
                 System.out.println("Exit");
            }
            break;
            default:
                 System.out.println("Invalid Choice");
        }
        }while(choice!=5);
        
        
    }
    
}

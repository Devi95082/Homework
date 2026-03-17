package onlinefoodorder1;

import java.util.Scanner;
public class OnlineFoodOrder1
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        FoodOrder order = null;
        int choice;
         do 
         {
            System.out.println("\n--- Online Food Order System ---");
            System.out.println("1. Place Order");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice)
            {

                case 1 -> {
                    System.out.print("Enter Customer Name: ");
                    String name = sb.nextLine();
                    System.out.print("Enter Food Item: ");
                    String fooditem = sb.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextInt();

                    order = new FoodOrder(name, fooditem, price);
                    order.placeorder();
                }

                case 2 -> {
                    if (order != null) 
                    {
                         
                        order.showbill();
                    } 
                    else
                    {
                        System.out.println("No order placed yet!");
                    }
                }

                case 3 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);

            
        
    }
    
}

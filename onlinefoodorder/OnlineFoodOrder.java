package onlinefoodorder;

import java.util.Scanner;
public class OnlineFoodOrder
{

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        FoodOrder order = null;
        int choice;
        String name;
        String fooditem;
        int price;
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

                case 1:
                    System.out.print("Enter Customer Name: ");
                     name = sc.nextLine();
                    System.out.print("Enter Food Item: ");
                    fooditem = sc.nextLine();
                    System.out.print("Enter Price: ");
                    price = sc.nextInt();

                    FoodOrder fo = new FoodOrder(name, fooditem, price);
                    fo.placeorder();
                    break;

                case 2:
                    if (order != null) 
                    {
                         
                        fo.showbill();
                    } 
                    else
                    {
                        System.out.println("No order placed yet!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;
                    default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

            
        
    }
    
}

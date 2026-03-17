package calculatedifferentshapes;
import java.util.Scanner;
public class CalculateArea
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        int choice;
        do
        {
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Cire");
            System.out.println("3. Exit");
            System.out.println("Enter Choice");
            choice=sc.nextInt();
           
            switch(choice)
            {
                case 1 -> {
                    
                    System.out.println("Enter the side measurement : ");
                    int a=sc.nextInt();
                    Square sq=new Square(a);
                    sq.calcarea();
                }
                case 2 -> {
                    
                    System.out.println("Enter the Radius : ");
                    int r=sc.nextInt();
                    Circle cc=new Circle(r);
                    cc.calcarea();
                }
                case 3 -> {
                    System.out.println("Exit");
                }
                default -> System.out.println("Invalid Choice");
            }
        }while(choice!=3);
    }
    
}

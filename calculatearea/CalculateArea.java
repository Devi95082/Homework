package calculatearea;
import java.util.Scanner;
public class CalculateArea
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
         
        System.out.println("1. Area of Square");
        System.out.println("2. Area of Cire");
        System.out.println("3. Exit");
        System.out.println("Enter Choice");
        int option=sc.nextInt();
        while(option<4)
        {
           
            switch(option)
            {
                case 1 :
                {
                    int b=sc.nextInt();
                    System.out.println("Enter the side measurement : ");
                    int a=sc.nextInt();
                    Square sq=new Square(b,a);
                    sq.calcarea();
                }
                break;
                case 2 :
                {
                    int b=sc.nextInt();
                    System.out.println("Enter the Radius : ");
                    int r=sc.nextInt();
                    Circle cc=new Circle(b,r);
                    cc.calcarea();
                }
                break;
                case 3:
                {
                    System.out.println("Exit");
                }
                break;
                default :
                    System.out.println("Invalid Choice");
            }
        }
    }
    
}

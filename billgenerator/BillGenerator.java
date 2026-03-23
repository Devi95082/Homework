package billgenerator;
import java.util.Scanner;
public class BillGenerator
{

    public static void main(String[] args)
    {        
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        
        System.out.println("Enter Product Id : ");
        int id=sc.nextInt();
        
        System.out.println(" Enter Product Name : ");
        String name = sb.nextLine();
        
        System.out.println("Enter Price : ");
        double pr=sc.nextDouble();
        
        System.out.println("Enter Quantity  : ");
        int q=sc.nextInt();
        ShoppingBill shop = new ShoppingBill(id,name,pr,q);
        
        System.out.println("Shop Name : "+ShoppingBill.Shopname);
       
        shop.display();
    }
    
}

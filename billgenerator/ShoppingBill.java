package billgenerator;

public class ShoppingBill 
{
   
    int productid;
    String productname;
    double price;
    int quantity;
    
    static String Shopname="Mano Fabric Online Store";
    static double gstprecent=18;
    
    final double deliverycharge=50;

    public ShoppingBill(int productid, String productname, double price,int quantity)
    {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        this.quantity=quantity;
    }
    double calculatesubtotal()
    {
        return price*quantity;
    }
    double calculateGST()
    {
        double subtotal=calculatesubtotal();
        return subtotal*gstprecent/100;
    }
    double calculateFinalBill()
    {
        double subtotal=calculatesubtotal();
        double gst=calculateGST();
        return subtotal+gst+deliverycharge;
    }
    void display()
    {
        System.out.println("Product Id : "+productid);
        System.out.println("Product Name : "+productname);
        System.out.println("Subtotal : "+calculatesubtotal());
        System.out.println("GST : "+calculateGST());
        System.out.println("Delivery Charge : "+deliverycharge);
        System.out.println("Final Bill : "+calculateFinalBill());
    }
    
}

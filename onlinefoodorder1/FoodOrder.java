package onlinefoodorder1;

public class FoodOrder extends Customer implements Order
{
     String fooditem;
     double price;
    
    public FoodOrder(String name, String fooditem, double price) 
    {
        super(name);
        this.fooditem=fooditem;
        this.price=price;
    }

    @Override
    public void placeorder() 
    {
        System.out.println("Order placed successfully!"); 
    }

    @Override
    public void showbill() 
    {
        
        System.out.println("Customer Name: " + name);
        System.out.println("Food Item: " + fooditem);
        System.out.println("Price: " + price);
    }
    
    
    
    
}

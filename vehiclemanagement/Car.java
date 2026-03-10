
package vehiclemanagement;

public class Car extends Vehicle
{
    int seat;
    
    public Car(String brand, int year,int seat)
    {
        super(brand, year);
        this.seat=seat;
        
    }
     void display()
    {
       System.out.println("Car : ");
       System.out.println(brand);
       System.out.println(year);
       System.out.println(seat);
                
    }
    
}

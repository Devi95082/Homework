
package vehiclemanagement;

public class Motor extends Vehicle
{
    String type;

    public Motor(String brand, int year,String type)
    {
        super(brand, year);
        this.type=type;
    }
    void display()
    {
       System.out.println("MotorCylce : ");
       System.out.println(brand);
       System.out.println(year);
       System.out.println(type);
                
    }
    
}

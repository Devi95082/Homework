package calculatedifferentshapes;

public class Circle extends Shape
{
    double r;

    public Circle(double r)
    {
        
        this.r=r;
    }

    @Override
    void calcarea()
    {
        double area=3.14*r*r;
        System.out.println("Area of Circle is : "+ area);
    }
    
    
}

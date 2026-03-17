package calculatedifferentshapes;

 public class Square extends Shape
{
     int side;

    public Square(int side)
    {
       
        this.side=side;
    }

    @Override
    void calcarea() 
    {
        int area = side*side;
        System.out.println("Area of Square is : "+area);      
                
    }
    
    
}

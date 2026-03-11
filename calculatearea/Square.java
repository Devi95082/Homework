package calculatearea;

 public class Square extends Shape
{
     int side;

    public Square(int a,int side)
    {
        super(a);
        this.side=side;
    }

    @Override
    void calcarea() 
    {
        int area = side*side;
        System.out.println("Area of Square is : "+area);      
                
    }
    
    
}

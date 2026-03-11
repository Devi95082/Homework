package calculatearea;

public class Circle extends Shape
{
    int r;

    public Circle(int a,int r)
    {
        super(a);
        this.r=r;
    }

    @Override
    void calcarea()
    {
        int area=(22/7)*r*r;
        System.out.println("Area of Circle is : "+ area);
    }
    
    
}

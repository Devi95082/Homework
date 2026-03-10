package employeemanagement;

public class Manager extends Employee
{
    String depart;
    
    public Manager(String name, double salary,String depart)
    {
        super(name, salary);
        this.depart=depart;
        
    }
    void display()
    {
        System.out.println("Employee Name :  "+name);
        System.out.println("Salary :Rs."+salary);
        System.out.println("Department:  "+depart);
        
    }
    
}

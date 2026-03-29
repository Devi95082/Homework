package employeepayroll;

public class EmployeeDetails
{
    int employeeID;
    String name;
    String department;
    double basicsalary;

    public EmployeeDetails(int employeeID, String name, String department, double basicsalary)
    {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.basicsalary = basicsalary;
    }
    void display()
    {
        System.out.println("Employee ID : "+employeeID);
        System.out.println("Employee Name : "+name);
        System.out.println("Department : "+department);
        System.out.println("Basic Salary : "+basicsalary);          
    }
    
}

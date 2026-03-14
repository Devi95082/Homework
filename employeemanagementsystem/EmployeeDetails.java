package employeemanagementsystem;

public class EmployeeDetails 
{
   private int empId;
   private String empName;
   private String designation;
   private double salary;

    public EmployeeDetails(int empId, String empName, String designation, double salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getEmpName() 
    {
        return empName;
    }

    public void setEmpName(String empName) 
    {
        this.empName = empName;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    void display()
    {
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
        
    }
    
    
    
   
    
}

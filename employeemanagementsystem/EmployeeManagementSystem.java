package employeemanagementsystem;

import java.util.Scanner;
public class EmployeeManagementSystem 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        System.out.println("Employee ID : ");
        int empid=sc.nextInt();
        System.out.println("Employee Name : ");
        String name=sb.nextLine();
        System.out.println("Designation : ");
        String desig=sb.nextLine();
        System.out.println("Salary : ");
        double salary=sc.nextDouble();
        EmployeeDetails emp=new EmployeeDetails(empid,name,desig,salary);
        emp.display();
    }
    
}

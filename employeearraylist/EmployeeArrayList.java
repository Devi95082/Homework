package employeearraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList
{
    static ArrayList<EmployeeDetails> Employee = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static double salary;
    
    public static void main(String[] args) 
    {
        
        int choice;
        do
        {
            System.out.println("1. Add Emplpoyee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by Using Employee ID");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Calculate NetSalary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.println("Enter Your Choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                    addEmployee();
                    break;
                case 2:
                   viewEmployee();
                   break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateBasicSalary();
                    break;
                case 5:
                    calculateNetSalary();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice....");                  
                    
                    
                    
            }
        }while(choice!=7);
        
    }
   public static void addEmployee()
    {
        System.out.print("Enter Employee ID : ");
        int id=sc.nextInt();
        sc.nextLine();
        
        for(EmployeeDetails e : Employee)
        {
            if(e.employeeID==id)
            {
                System.out.println("Employee ID already exists!");
                return;
            }
        }
        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Department : ");
        String depart = sc.nextLine();
        
        System.out.print("Enter Department : ");
        salary = sc.nextDouble();       
        
        EmployeeDetails ed = new EmployeeDetails(id,name,depart,salary);
        Employee.add(ed);
        System.out.println("EmployeeDetails added successfully!");
        
    }
     public static void viewEmployee()
     {
        if (Employee.isEmpty())
        {
            System.out.println("No students found!");
            return;
        }

        for (EmployeeDetails ee : Employee)
        {
            ee.display();
        }
     }
     public static void searchEmployee()
      {
        System.out.print("Enter Roll Number to search: ");
        int ID = sc.nextInt();
        
        for(EmployeeDetails ed : Employee)
        {
            if(ed.employeeID==ID)
            {
                ed.display();
                return;
            }
        }
         System.out.println("Employee not found!");
      }
      public static void updateBasicSalary()
      {
        System.out.print("Enter New Basic Salary : ");
        int newsalary = sc.nextInt();
        
        for(EmployeeDetails ed : Employee)
        {
            if(ed.employeeID==newsalary)
            {
                ed.basicsalary=newsalary;
                return;
            }
        }
         System.out.println("Employee not found!");
          
      }
       public static double calculateNetSalary()
      {
          double netsalary;
          double HRA = salary *20/100;
          double DA = salary *10/100;
          double PF = salary *5/100;
          netsalary=salary+HRA+DA-PF;
          return netsalary;
      }
    public static void deleteEmployee()
      {
        System.out.print("Enter EmployeeID to Delete : ");
        int ID = sc.nextInt();
        
        for(EmployeeDetails ed : Employee)
        {
            if(ed.employeeID==ID)
            {
                Employee.remove(ed);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
         System.out.println("Employee not found!");
          
        
    }
    
}

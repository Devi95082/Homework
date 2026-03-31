package schoolarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolArrayList 
{
     static Scanner sc = new Scanner(System.in);
     static ArrayList<StudentDetails> Studentlist=new ArrayList();

    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.println("*****Student Management System*****");
            System.out.println("1. Add Student ");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student by using Roll Number");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            
            System.out.println("Enter Your Choice : ");
            int choice=sc.nextInt();
            
            switch(choice)
            {
                 case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
                
            }
        }          
    }
    static void addStudent()
    {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

       
        for (StudentDetails s : Studentlist) 
        {
            if (s.rollnumber == roll)
            {
                System.out.println("Roll number already exists!");
                return;
            }
        }
          sc.nextLine(); 
          System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        StudentDetails st=new  StudentDetails(roll, name, age, course, marks);
        Studentlist.add(st);
        System.out.println("Student added successfully!");
    }
     static void viewStudents()
     {
        if (Studentlist.isEmpty())
        {
            System.out.println("No students found!");
            return;
        }

        for (StudentDetails s : Studentlist)
        {
            s.displayDetails();
        }
     }
      static void searchStudent() 
      {
        System.out.print("Enter Roll Number to search: ");
        int roll = sc.nextInt();

        for (StudentDetails s : Studentlist)
        {
            if (s.rollnumber == roll) 
            {
                s.displayDetails();
                return;
            }
        }

        System.out.println("Student not found!");
    }

 
    static void updateMarks()
    {
        System.out.print("Enter Roll Number to update: ");
        int roll = sc.nextInt();

        for (StudentDetails s : Studentlist)
        {
            if (s.rollnumber == roll)
            {
                System.out.print("Enter new marks: ");
                s.mark = sc.nextDouble();
                System.out.println("Marks updated successfully!");
                return;
            }
        }
    }
      static void deleteStudent() 
      {
        System.out.print("Enter Roll Number to delete: ");
        int roll = sc.nextInt();

        for (StudentDetails s : Studentlist) {
            if (s.rollnumber == roll) {
                Studentlist.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
   
}

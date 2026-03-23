package collegedetails;

import java.util.Scanner;

public class CollegeDetails
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        
        System.out.print("Enter Student 1 Enter ID : ");
        int id1=sc.nextInt();
        
        System.out.print("Enter Student 1 Name : ");
        String name1=sb.nextLine();
        
        System.out.print("Enter Tution Fee : ");
        double fee1=sc.nextDouble();
        
        System.out.print("Enter Student 2 Enter ID : ");
        int id2=sc.nextInt();
        
        System.out.print("Enter Student 2 Name : ");
        String name2=sb.nextLine();
        
        System.out.print("Enter Tution Fee : ");
        double fee2=sc.nextDouble();
        StudentDetails s1=new StudentDetails(id1,name1,fee1);
        StudentDetails s2=new StudentDetails(id2,name2,fee2);
        
        System.out.println("College Name : "+StudentDetails.collegename);
        
        s1.display();
        s2.display();
        StudentDetails.displaycount();
       System.out.println("Student count : "+StudentDetails.studentcount);
              
        
    }
    
}

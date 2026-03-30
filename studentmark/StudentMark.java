package studentmark;

import java.util.Scanner;

public class StudentMark 
{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Student Name : ");
       String name=sc.nextLine();
       sc.nextLine();
       
       System.out.println("Enter Student RollNumber : ");
       int r=sc.nextInt();
        
       System.out.println("Enter Student Mark in SUB1 : ");
       int m1=sc.nextInt();
       
       System.out.println("Enter Student Mark in SUB2 : ");
       int m2=sc.nextInt();
       
       System.out.println("Enter Student Mark in SUB3 : ");
       int m3=sc.nextInt();
       
       Student st=new Student(name,r);
       Student.Mark m =st.new Mark(m1,m2,m3);
       m.display();
    }
    
}

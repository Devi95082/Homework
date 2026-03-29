package studentmanagemanetarraylist;

public class StudentDetails 
{
    int rollnumber;
    String name;
    int age;
    String course;
    double mark;

    public StudentDetails(int rollnumber, String name, int age, String course, double mark) 
    {
        this.rollnumber = rollnumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.mark = mark;
    }
    
    void displayDetails()
    {
        System.out.println("Student Roll Number : "+rollnumber);
        System.out.println("Student Name : "+name);
        System.out.println("Student Age : "+age);
        System.out.println("Student Course : "+course);          
        System.out.println("Student Mark : "+mark);
    }
    
    
    
}

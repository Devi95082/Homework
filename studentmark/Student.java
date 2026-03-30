package studentmark;

public class Student 
{
     String name;
     int rollno;

    public Student(String name,int rollno)
    {
        this.name = name;
        this.rollno=rollno;
    }
    public class Mark
    {
       int mark1;
       int mark2;
       int mark3;

      
        public Mark(int mark1, int mark2, int mark3)
        {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }
      
         
        void display()
        {
            int total=mark1+mark2+mark3;
            double avg=total/3;
            System.out.println("Stundent Name : "+name);
            System.out.println("Stundent Mark is SUB1 : "+mark1);
            System.out.println("Stundent Mark is SUB2 : "+mark2);
            System.out.println("Stundent Mark is SUB3 : "+mark3);
            System.out.println("Student Total Mark : "+total);
            System.out.println("Stundent Average Mark : "+avg);
        }
       
    }
    
}

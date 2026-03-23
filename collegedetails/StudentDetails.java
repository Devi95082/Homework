package collegedetails;

public class StudentDetails
{
    static String collegename="";
    static int studentcount=0;
    final double admissionfee=5000;
    int studentid;
    String studentname;
    double tutionfee;
    

    public StudentDetails(int studentid, String studentname, double tutionfee)
    {
        this.studentid = studentid;
        this.studentname = studentname;
        this.tutionfee = tutionfee;
        studentcount++;
    }
   public double calculateTotalFee()
    {
        double totalfee=tutionfee+admissionfee;
        return totalfee;
    }
    void display()
    {
        System.out.println("College Name : "+collegename);
        System.out.println("Student ID : "+studentid);
        System.out.println("Student name : "+studentname);
        System.out.println("Total: "+calculateTotalFee());
        
    }
    static void displaycount()
    {
        System.out.println("Total Count : "+studentcount);
    }
    
    
}

package hospitalpatientrecord;

public class PatientDetails 
{
    String patientname;
    int age;
    String disease;
    String doctorname;
    String roomtype;
    double billamount;

    public PatientDetails()
    {
    }

    public PatientDetails(String patientname, int age, String disease, String doctorname, String roomtype, double billamount) 
    {
        this.patientname = patientname;
        this.age = age;
        this.disease = disease;
        this.doctorname = doctorname;
        this.roomtype = roomtype;
        this.billamount = billamount;
    }

    public void setPatientname(String patientname) 
    {
        this.patientname = patientname;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public void setDisease(String disease)
    {
        this.disease = disease;
    }

    public void setDoctorname(String doctorname) 
    {
        this.doctorname = doctorname;
    }

    public void setRoomtype(String roomtype) 
    {
        this.roomtype = roomtype;
    }

    public void setBillamount(double billamount) 
    {
        this.billamount = billamount;
    }

    public String getPatientname() 
    {
        return patientname;
    }

    public int getAge()
    {
        return age;
    }

    public String getDisease()
    {
        return disease;
    }

    public String getDoctorname() 
    {
        return doctorname;
    }

    public String getRoomtype()
    {
        return roomtype;
    }

    public double getBillamount() 
    {
        return billamount;
    }
    
    public void showdetails()
    {
        System.out.println("Patient Name : "+patientname);
        System.out.println("Age : "+age);
        System.out.println("Disease : "+disease);
        System.out.println("Doctor Name : "+doctorname);
        System.out.println("Room Type : "+roomtype);
        System.out.println("Bill Amount : "+billamount);
    }
    
    
     
    
    
}

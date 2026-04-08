package hospitalpatientrecord;

public class PatientBuilder
{
    private PatientDetails pd;

    public PatientBuilder()
    {
        pd=new PatientDetails();
    }
    
    public PatientBuilder setPatientname(String patientname) 
    {
        this.pd.setPatientname(patientname);
        return this;
    }

    public PatientBuilder setAge(int age) 
    {
        this.pd.setAge(age);
        return this;
    }

    public PatientBuilder setDisease(String disease)
    {
        this.pd.setDisease(disease);
        return this;
    }

    public PatientBuilder setDoctorname(String doctorname) 
    {
        this.pd.setDoctorname(doctorname);
        return this;
        
    }

    public PatientBuilder setRoomtype(String roomtype) 
    {
        this.pd.setRoomtype(roomtype);
        return this;
    }

    public PatientBuilder setBillamount(double billamount) 
    {
        this.pd.setBillamount(billamount);
        return this;
    }

     public PatientDetails build()
    {
        return pd;
    }      

    Object setPatientName(String patientname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

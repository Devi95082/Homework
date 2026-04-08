package hospitalpatientrecord;

import java.util.Scanner;
public class HospitalPatientRecord {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Patient Name : ");
        String patientname=sc.nextLine();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Doctorname : ");
        String doctorname=sc.nextLine();
        System.out.println("Enter Disease :");
        String disease=sc.nextLine();
        System.out.println("Enter Room Type :");
        String roomtype=sc.nextLine();
        System.out.println("Enter Bill Amount : ");
        double billamount=sc.nextDouble();
        PatientBuilder builder = new PatientBuilder();
        PatientDetails pd=builder.setAge(age).setPatientName(patientname).setDisease(disease).setDoctorName(doctorname).setRoomType(roomtype).setBillAmount(billamount).build();

        
        pd.showdetails();
    }
    
}

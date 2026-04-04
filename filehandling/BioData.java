package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioData 
{
     public static void main(String[] args) 
     {

        
        try (Scanner sc = new Scanner(System.in))
        {
            //  Personal Details
            System.out.println("Enter Personal Details:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Date of Birth: ");
            String dob = sc.nextLine();
            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();
            
            // Educational Details
            System.out.println("\nEnter Educational Details:");
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("College Name: ");
            String college = sc.nextLine();
            System.out.print("Percentage / CGPA: ");
            String cgpa = sc.nextLine();
            
            //  Professional Details
            System.out.println("\nEnter Professional Details:");
            System.out.print("Skills: ");
            String skills = sc.nextLine();
            System.out.print("Experience (in years): ");
            String experience = sc.nextLine();
            
            //  Contact Details
            System.out.println("\nEnter Contact Details:");
            System.out.print("Phone Number: ");
            String phone = sc.nextLine();
            System.out.print("Email ID: ");
            String email = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            
            //  Family Details
            System.out.println("\nEnter Family Details:");
            System.out.print("Father Name: ");
            String father = sc.nextLine();
            System.out.print("Mother Name: ");
            String mother = sc.nextLine();
            
            // Writing to file
            try
            {
                FileWriter fw = new FileWriter("biodata.txt");
                
                fw.write("=========== BIO DATA ===========\n");
                
                fw.write("\n👤 Personal Details\n");
                fw.write("Name : " + name + "\n");
                fw.write("Age : " + age + "\n");
                fw.write("Gender : " + gender + "\n");
                fw.write("DOB : " + dob + "\n");
                fw.write("Blood Group : " + bloodGroup + "\n");
                
                fw.write("\n🎓 Education\n");
                fw.write("Qualification : " + qualification + "\n");
                fw.write("College : " + college + "\n");
                fw.write("CGPA : " + cgpa + "\n");
                
                fw.write("\n💼 Skills\n");
                fw.write(skills + "\n");
                
                fw.write("\nExperience : " + experience + " Year(s)\n");
                
                fw.write("\n📞 Contact\n");
                fw.write("Phone : " + phone + "\n");
                fw.write("Email : " + email + "\n");
                fw.write("Address : " + address + "\n");
                
                fw.write("\n👨‍👩‍👧 Family\n");
                fw.write("Father Name : " + father + "\n");
                fw.write("Mother Name : " + mother + "\n");
                
                fw.write("\n================================\n");
                
                fw.close();
                
                System.out.println("\n Bio Data successfully written to biodata.txt");
                
            }
            catch (IOException e)
            {
                System.out.println("Error writing file.");
            }

        }  
     }
    
}

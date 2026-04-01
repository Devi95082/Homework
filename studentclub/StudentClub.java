package studentclub;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class StudentClub
{

   static  Scanner sc = new Scanner(System.in);
   static Set<String> st= new HashSet<>();
    
    public static void main(String[] args)
    {
     int choice;
      do
      {
        System.out.println("1. Add New Member");
        System.out.println("2. Remove Member");
        System.out.println("3. Search Member");
        System.out.println("4. Display All Member");
        System.out.println("5. Count Members");
        System.out.println("6. Exit");
        
        System.out.println("Enter Your choice : ");
        choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter New Member Name : ");
                String name = sc.nextLine();
                if (st.add(name))
                {
                   System.out.println("Member added successfully.");
                }
                else 
                {
                    System.out.println("Member already exists!");
                }
            }
            break;
            case 2 :
            {
                System.out.print("Enter member name to remove: ");
                String removeName = sc.nextLine();

                if (st.remove(removeName))
                {
                    System.out.println("Member removed successfully.");
                } 
                else
                {
                    System.out.println("Member not found!");
                }               
            }
            break;
            
                case 3:
                    System.out.print("Enter member name to search: ");
                    String searchName = sc.nextLine();

                    if (st.contains(searchName)) 
                    {
                        System.out.println("Member exists in the club.");
                    }
                    else
                    {
                        System.out.println("Member not found.");
                    }
                    break;

                case 4:
                    System.out.println("Club Members:");
                    if (st.isEmpty())
                    {
                        System.out.println("No members found.");
                    } 
                    else
                    {
                        for (String member : st)
                        {
                            System.out.println(member);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total members: " + st.size());
                    break;

                case 6:
                    System.out.println("Exiting program... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }        
          
      }while(choice<=6);
        
      
    }
    
}

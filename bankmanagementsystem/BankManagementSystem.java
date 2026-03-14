package bankmanagementsystem;

import java.util.Scanner;
public class BankManagementSystem 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         Scanner sb = new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        double ac=sc.nextDouble();
        System.out.print("Enter Account Holder Name : ");
        String name=sb.nextLine();
        System.out.print("Enter Initial Amount : ");
        double bal=sc.nextDouble();
        BankAccount ba=new BankAccount(ac,name,bal);
       for(int i=1;i<5;i++)
       {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw ");
        System.out.println("3. Display Account Details ");
        System.out.println("4. Exit");
        System.out.print("Enter Choice : ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter Deposit Amount");
                double depositamt=sc.nextInt();
                ba.deposit(depositamt);                
            }
            break;
            case 2:
            {
                System.out.println("Enter Withdraw Amount");
                double withdrawamt=sc.nextInt();
                ba.withdraw(withdrawamt);
            }
            break;
            case 3:
            {
                ba.display();
            }
            break;
            case 4:
            {
                System.out.println("Exit");
            }
            break;
            default:
            System.out.println("Invalid Choice");  
        }
       }
    }
}

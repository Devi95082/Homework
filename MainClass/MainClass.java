package MainClass;

import java.util.Scanner;

public class MainClass 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;

        do 
        {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice)
            {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(name, accNo, balance);
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    int accNoDep = sc.nextInt();

                    BankAccount accDep = bank.searchAccount(accNoDep);

                    if (accDep != null) 
                    {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();

                        BankAccount.Transaction t = accDep.new Transaction();
                        t.deposit(amt);
                    }
                    else
                    {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    int accNoWith = sc.nextInt();

                    BankAccount accWith = bank.searchAccount(accNoWith);

                    if (accWith != null)
                    {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();

                        BankAccount.Transaction t = accWith.new Transaction();
                        t.withdraw(amt);
                    }
                    else 
                    {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    int accNoCheck = sc.nextInt();

                    BankAccount accCheck = bank.searchAccount(accNoCheck);

                    if (accCheck != null) 
                    {
                        accCheck.display();
                    } 
                    else 
                    {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    bank.displayAll();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
    
}

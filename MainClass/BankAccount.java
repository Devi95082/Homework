package MainClass;
public class BankAccount 
{
    String name;
    int accNo;
    double balance;

    // Constructor
    BankAccount(String name, int accNo, double balance) 
    {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // 🔸 Inner Class for Transaction
    class Transaction
    {

        void deposit(double amount)
        
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount)
        {
            if (amount <= balance)
            {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else
            {
                System.out.println("Insufficient Balance!");
            }
        }
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
    
}

package MainClass;

public class Bank
{
      Node head = null;

    // Create Account
    void createAccount(String name, int accNo, double balance) 
    {
        BankAccount acc = new BankAccount(name, accNo, balance);
        Node newNode = new Node(acc);

        if (head == null)
        {
            head = newNode;
        }
        else 
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println("Account created!");
    }

    // Search Account
    BankAccount searchAccount(int accNo) 
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.data.accNo == accNo)
            {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Display All Accounts
    void displayAll() 
    {
        if (head == null) 
        {
            System.out.println("No accounts found.");
            return;
        }

        Node temp = head;
        while (temp != null)
        {
            temp.data.display();
            System.out.println("----------------------");
            temp = temp.next;
        }
    }
    
}

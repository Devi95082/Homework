package librarysystem;

import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem 
{

        
     static ArrayList<Book> library = new ArrayList<>();
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;

        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int id = sc.nextInt();
                    Book b = searchBook(id);
                    if (b != null)
                    {
                        b.displayBook();
                    } 
                    else 
                    {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice != 7);
        
    }
     public static void addBook() 
    {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        
        for (Book b : library)
        {
            if (b.bookId == id) 
            {
                System.out.println("Book ID already exists!");
                return;
            }
        }

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();
 
        Book bk=new Book(id, title, author); 
        library.add(bk);
        System.out.println("Book added successfully!");
    }

    // View All Books
    public static void viewBooks() 
    {
        if (library.isEmpty())
        {
            System.out.println("No books available.");
            return;
        }

        for (Book b : library) 
        {
            b.displayBook();
        }
    }

   
    public static Book searchBook(int id)
    {
        for (Book b : library) 
        {
            if (b.bookId == id) 
            {
                return b;
            }
        }
        return null;
    }

 
    public static void issueBook() 
    {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        Book b = searchBook(id);

        if (b == null)
        {
            System.out.println("Book not found!");
        } 
        else if (b.status.equals("Issued"))
        {
            System.out.println("Book is already issued!");
        }
        else 
        {
            b.status = "Issued";
            System.out.println("Book issued successfully!");
        }
    }

 
    public static void returnBook()
    {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        Book b = searchBook(id);

        if (b == null) 
        {
            System.out.println("Book not found!");
        } 
        else if (b.status.equals("Available")) 
        {
            System.out.println("Book is already available!");
        } 
        else 
        {
            b.status = "Available";
            System.out.println("Book returned successfully!");
        }
    }

  
    public static void deleteBook()
    {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();

        Book b = searchBook(id);

        if (b == null) 
        {
            System.out.println("Book not found!");
        } 
        else
        {
            library.remove(b);
            System.out.println("Book deleted successfully!");
        }
    }

   
    
}

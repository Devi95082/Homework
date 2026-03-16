package linkedlist2;

public class LinkedList2 
{

    public static void main(String[] args) 
    {
        Singly sll=new Singly();
        sll.insertBegin("Ravi");
        sll.insertBegin("Kumar");
        sll.insertBegin("Arun");
        sll.insertMiddle("Vijay", 3);
        sll.insertEnd("Ajay");
        sll.display();
        

    }
    
}

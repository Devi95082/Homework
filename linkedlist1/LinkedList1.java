package linkedlist1;

public class LinkedList1
{

    public static void main(String[] args)
    {
        Singly sll=new Singly();
        sll.insertBegin(2);
        sll.insertBegin(1);
        sll.insertEnd(5);sll.insertEnd(6);
        sll.insertEnd(7);
        sll.insertEnd(8);
        sll.insertMiddle(3, 2);
        sll.insertMiddle(4, 3);
        sll.display();
        
    }
    
}

package doublelylinkedlist;

public class DoublelyLinkedList 
{

    public static void main(String[] args)
    {
        Doublely dll = new Doublely();
        dll.insertEnd(2);
        dll.insertEnd(5);
        dll.insertEnd(6);
        dll.insertBegin(1);
        dll.insertMiddle(3, 2);
        dll.insertMiddle(4, 3);
        dll.displayForward();
        dll.displayReverse();
        dll.deleteBegin();
        dll.deleteEnd();
        dll.deleteMiddle(3);
        dll.displayForward();
    }
    
}

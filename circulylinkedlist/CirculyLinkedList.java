package circulylinkedlist;
public class CirculyLinkedList 
{

    public static void main(String[] args) 
    {
        CirculySingle cs=new CirculySingle();
        cs.insertEnd(2);
        cs.insertEnd(4);
        cs.insertEnd(8);
        cs.insertBegin(0);
        cs.deleteBegin();
        cs.deleteEnd();
        
        cs.display();
    }
    
}

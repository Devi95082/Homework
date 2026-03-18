package doublelylinkedlist;

public class Doublely 
{
    Node head;
    Node tail;
    void insertEnd(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=tail.next;
        }
    }
    void insertBegin(int data)
    {
         Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }        
    }
    void insertMiddle(int data,int positiondata)
    {
          Node newnode = new Node(data);
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==positiondata)
            {
                newnode.prev=temp;
                newnode.next=temp.next;
                temp.next.prev=newnode;
                temp.next=newnode;                
            }
            temp=temp.next;
        }        
    }
    void deleteBegin()
    {
        head=head.next;
        head.prev=null;
    }
    void deleteEnd()
    {
        tail=tail.prev;
        tail.next=null;
    }
     void displayForward()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
     void displayReverse()
     {
         Node temp=tail;
          if(tail==null)
        {
            System.out.println("List is Empty");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println();
     }
     void deleteMiddle(int data)
     {
         Node temp=head;
           
          if(tail==null)
        {
            System.out.println("List is Empty");
        }
         while(temp.next!=null)
         {
             if(temp.data==data)
             {
                 temp.prev.next=temp.next;
                 temp.next.prev=temp.prev;
             }
             temp=temp.next;
         }
     }
    
}

















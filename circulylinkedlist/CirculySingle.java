package circulylinkedlist;

public class CirculySingle 
{
    Node head;
    Node tail;
    void insertEnd(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            head.next=newnode;
        }
        else
        {
           tail.next=newnode;
           tail=newnode;
           tail.next=head;
        }
    }
    void insertBegin(int data)
    {
         Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            head.next=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
            tail.next=head;            
        }
    }
    void display()
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
            if(temp.data==head.data)
            {
                return;
            }
        }
        System.out.println();
    }
    void deleteEnd()
    {
        Node temp=head;
        while(temp.next.next!=head)
        {
            temp=temp.next;
        }
        temp.next=head;
    }
    void deleteBegin()
    {
        head=head.next;
        tail.next=head;
    }
    
}


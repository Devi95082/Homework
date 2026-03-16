package linkedlist1;

public class Singly 
{
    Node head;
    void insertBegin(int data)
    {
         Node newnode=new Node(data);
         if(head==null)
         {
             head=newnode;
         }
         else 
         {
             newnode.next=head;
             head=newnode;
         }
    }
    void insertEnd(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
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
        }
        
    }
    
    void insertMiddle(int data,int position)
    {
        Node temp=head;
        Node newnode=new Node(data);
        for(int i=1;i<position;i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;       
       
    }
    
}

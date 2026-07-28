import java.util.*;
class DNode
{
    public int value;
    public DNode next;
    public DNode prev;
}
class CirculardoublyLinked {
    public DNode head=null;
    public DNode tail=null;
    public int size=0;
    DNode createCircularDoublyLinkedList(int value)
    {
        DNode newNode=new DNode();
        newNode.value=value;
        newNode.next=newNode;
        newNode.prev=newNode;
        head=newNode;
        tail=newNode;
        size++;
        return newNode;
    }
    public void Insert(int value,int position)
    {
        if(head==null)
        {
            System.out.println("the linked list is empty");
            createCircularDoublyLinkedList(value);
            return;
        }
        else if(position==1)
        {
            DNode newNode=new DNode();
            newNode.value=value;
            newNode.prev=tail;
            newNode.next=head;
            head.prev=newNode;
            tail.next=newNode;
            head=newNode;
            size++;
        }
        else if(position==size+1)
        {
            DNode newNode=new DNode();
            newNode.value=value;
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
        else if(position<=size&&position>1)
        {
            DNode newNode=new DNode();
            newNode.value=value;
            DNode temp=head;
            for(int i=1;i<position-1;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            newNode.prev=temp;
            temp.next.prev=newNode;
            temp.next=newNode;
            size++;
        }
        else{
            System.out.println("invalid position");
        }
    }
    public void delete(int position)
    {
        if(position>size||head==null)
        {
            System.out.println("the linked list is empty");
            return;
        }
        else if(position == 1)
        {
            if(size == 1)
            {
                head = tail = null;
                size = 0;
                return;
            }
        
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
            return;
        }
        else if(position==size)
        {
            tail=tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
        }
        else if(position<size&&position>0)
        {
            DNode temp=head;
            for(int i=1;i<position-1;i++)
            {
                temp=temp.next;
            }
            DNode nodeToDelete = temp.next;
            temp.next = nodeToDelete.next;
            nodeToDelete.next.prev = temp;
            size--;
        }
        else{
            System.out.println("the position is invalid");
        }
    }
    public void display()
    {
        DNode tempNode=head;
        if(tempNode==null)
        {
            System.out.println("the linked list is empty");
            return;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(tempNode.value);
            tempNode=tempNode.next;
            
            if(i<size-1)
            {
                System.out.print("<->");
            }
        }
        System.err.println("");
    }
}
public class CircularDoublyLLMain
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            CirculardoublyLinked dll=new CirculardoublyLinked();
            dll.createCircularDoublyLinkedList(10);
            dll.Insert(13, 1);
            dll.Insert(11, 1);
            dll.Insert(12, 2);
            dll.Insert(15, 3);
            dll.Insert(16, 4);
            dll.display();
            dll.delete(1);
            dll.display();
            dll.delete(2);
            dll.display();
        }
    }
}
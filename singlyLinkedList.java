import java.util.*;
class Node
{
    public int value;
    public Node next;
}
class singlyLinked {
    public Node head=null;
    public Node tail=null;
    public int size=0;
    Node createSinglyLinkedList(int value)
    {
        Node newNode=new Node();
        newNode.value=value;
        newNode.next=null;
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
            createSinglyLinkedList(value);
            return;
        }
        else if(position==1)
        {
            Node newNode=new Node();
            newNode.value=value;
            newNode.next=head;
            head=newNode;
            size++;
        }
        else if(position==size+1)
        {
            Node newNode=new Node();
            newNode.value=value;
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
        else if(position<=size&&position>1)
        {
            Node newNode=new Node();
            newNode.value=value;
            Node temp=head;
            for(int i=1;i<position-1;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
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
        else if(position==1)
        {
            head=head.next;
            size--;
            return;
        }
        else if(position==size)
        {
            Node temp=head;
           for(int i=0;i<size-1;i++)
           {
            temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
        else if(position<size&&position>0)
        {
            Node temp=head;
            for(int i=1;i<position-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
        else{
            System.out.println("the position is invalid");
        }
    }
    public void display()
    {
        Node tempNode=head;
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
                System.out.print("->");
            }
        }
        System.err.println("");
    }
}
class singlyLinkedList
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            singlyLinked sll=new singlyLinked();
            sll.createSinglyLinkedList(10);
            sll.Insert(13, 1);
            sll.Insert(11, 1);
            sll.Insert(12, 2);
            sll.Insert(15, 3);
            sll.Insert(16, 4);
            sll.display();
            sll.delete(1);
            sll.display();
            sll.delete(2);
            sll.display();
        }
    }
}


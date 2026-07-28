class Node
{
    public int value;
    public Node next;
}
class CircularSinglyList
{
    public Node head=null;
    public Node tail= null;
    public int size=0;
    public Node createCircularSLL(int value)
    {
        Node node=new Node();
        node.value=value;
        node.next=node;
        head=node;
        tail=node;
        size++;
        return node;
    }
    public void insert(int value,int position)
    {
        if(position>size+1||position<1)
        {
            System.out.println("index out of bounds");
            return;
        }
        else if(position==1)
        {
            Node newNode=new Node();
            newNode.value=value;
            newNode.next=head;
            head=newNode;
            tail.next=newNode;
            size++;
        }
        else if(position==size+1)
        {
            Node newNode= new Node();
            newNode.value=value;
            newNode.next=head;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
        else if(position<=size&&position>1)
        {
            Node newNode= new Node();
            newNode.value=value;
            Node tempNode=head;
            for(int i=1;i<position-1;i++)
            {
                tempNode=tempNode.next;
            }
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            size++;
        }

    }
    public void delete(int position)
    {
        if(position>size+1||position<1)
        {
            System.out.println("index out of bounds");
            return;
        }
        else if(position==1)
        {
            head=head.next;
            tail.next=head;
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
            temp.next=head;
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
class CircularSinglyListMain
{
    public static void main(String[] args) {
       
            CircularSinglyList cll=new CircularSinglyList();
            cll.createCircularSLL(10);
            cll.insert(13, 1);
            cll.insert(11, 1);
            cll.insert(12, 2);
            cll.insert(15, 3);
            cll.insert(16, 4);
            cll.display();
            cll.delete(1);
            cll.display();
            cll.delete(2);
            cll.display();
        
    }
}


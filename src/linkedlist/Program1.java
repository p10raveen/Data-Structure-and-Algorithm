package linkedlist;

class Node
{
    int data;
    Node next;
}

public class Program1 {

    Node head;

    void insertFirst(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = head;
        head = n;
    }

    void insertLast(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = null;

        if(head==null) {
            head = n;
        }
        else {
            Node temp = head;
            while(temp.next !=null)
            {
                temp = temp.next;
            }
            temp.next = n;
        }
    }



    void deleteFirst()
    {
        if(head==null)
        {
            System.out.print("LL is Empty");
        }
        else
        {
            head = head.next;
        }
    }

    // Head = [ 20 | [ 10 | null ] ]

    void deleteLast()
    {
        if(head==null)
        {
            System.out.print("LL is Empty");
        }
        else
        {
            Node temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            temp.next=null;
        }
    }

    void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"\t"); // 30 20 10
            temp = temp.next;
        }
        System.out.println();
    }

    int searchElement(int value)
    {
        int result = -1;
        int i = 1;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Program1 p1 = new Program1();
        p1.insertFirst(10);
        p1.insertFirst(20);
        p1.insertFirst(30);
        p1.printList();
        p1.insertLast(40);
        System.out.println(p1.searchElement(10)); // 3
        System.out.println(p1.searchElement(70)); // -1
    }
}

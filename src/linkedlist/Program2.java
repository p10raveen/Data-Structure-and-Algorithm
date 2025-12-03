package linkedlist;

class Node1
{
    int data;
    Node1 next;
}

public class Program2 {

    Node1 head;
    Node1 tail;

    void insertFirst(int value)
    {
        Node1 n = new Node1();
        n.data = value;
        n.next = head;
        if(head==null)
        {
            head = n;
            tail = n;
        }
        else
        {
            head = n;
            tail.next = head;
        }
    }

    void printList()
    {
        Node1 temp = head;
        do {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        while(temp!=head);
        System.out.println();
    }

    void insertLast(int value)
    {
        Node1 n = new Node1();
        n.data = value;
        n.next = head;
        if(head==null)
        {
            head = tail = n;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
    }

    void deleteFirst()
    {
        if(head==null) // empty CLL
        {
            System.out.println("CLL is empty");
        }
        else
        {
            if(head == tail) // single node
            {
                head = tail = null;
            }
            else // more than one node
            {
                head = head.next;
                tail.next = head;
            }
        }
    }

    void deleteLast()
    {
        if(head==null) // empty CLL
        {
            System.out.println("CLL is empty");
        }
        else
        {
            Node1 temp = head;
            while(temp.next.next!=head) // find second last node
            {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
    }


    public static void main(String[] args) {
        Program2 p1 = new Program2();
        p1.insertFirst(10);
        p1.insertFirst(20);
        p1.insertFirst(30);
        p1.printList();
        p1.deleteLast();
        p1.printList();
    }
}

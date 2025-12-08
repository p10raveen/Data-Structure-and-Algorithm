package linkedlist;

class Node3
{
    int data;
    Node3 previous;
    Node3 next;
}
public class Program3 {
    Node3 head;
    Node3 tail;
    //         H                                                T
    // [ null | 30 | N2 ]         [ N3 | 20 | N1 ]      [ N2 | 10 | null ]
    //       N3                             N2                    N1

    void insertFirst(int value)
    {
        Node3 n = new Node3();
        n.data = value;
        n.next = head;
        n.previous = null;
        if(head!=null)
        {
            head.previous = n;
        }
        head = n;
        if(tail==null)
        {
            tail = n;
        }
    }
    //         H                                                                     T
    // [ null | 30 | N2 ]         [ N3 | 20 | N1 ]      [ N2 | 10 | N4 ]     [ N1 | 40 | null]
    //       N3                             N2                    N1                   N4
    void insertLast(int value)
    {
        Node3 n = new Node3();
        n.data = value;
        n.next = null;
        n.previous = tail;
        if(tail!=null)
        {
            tail.next = n;
        }
        tail = n;
        if(head==null)
        {
            head = n;
        }
    }

    void deleteFirst()
    {

    }

    void deleteLast()
    {

    }

    void displayFirst()
    {
        Node3 temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayLast()
    {
        Node3 temp = tail;
        while(temp!=null) {
            System.out.print(temp.data+"\t");
            temp = temp.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Program3 p1 = new Program3();
        p1.insertFirst(10);
        p1.insertFirst(20);
        p1.insertFirst(30);
        p1.insertLast(40);
        p1.displayFirst();
        p1.displayLast();

    }
}

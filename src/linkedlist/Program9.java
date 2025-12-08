package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Program9 {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("James");
        a1.add("Peter");
        a1.add("Albert");
        a1.add("Nicolas");
        a1.add("Maria");
        System.out.println(a1); // [James, Peter, Albert, Nicolas, Maria]

        Iterator itr = a1.descendingIterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }


    }
}

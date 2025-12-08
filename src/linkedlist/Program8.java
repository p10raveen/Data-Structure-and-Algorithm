package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Program8 {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("James");
        a1.add("Peter");
        a1.add("Albert");
        a1.add("Nicolas");
        a1.add("Maria");
        System.out.println(a1); // [James, Peter, Albert, Nicolas, Maria]

        ListIterator itr = a1.listIterator(); // IFM


        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        while(itr.hasPrevious())
        {
            System.out.print(itr.previous()+" ");
        }

    }
}

package linkedlist;

import java.util.LinkedList;

public class Program5 {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("James");
        a1.add("Peter");
        a1.add("Albert");
        a1.add("Nicolas");
        a1.add("Maria");

        System.out.println(a1);
        a1.remove(2);

        System.out.println(a1);
        a1.removeFirst();
        a1.removeLast();
        System.out.println(a1);
    }
}

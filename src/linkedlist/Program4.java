package linkedlist;

import java.util.LinkedList;

public class Program4 {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("James");
        a1.add("Peter");
        a1.add("Albert");
        a1.add("Nicolas");
        a1.add("Maria");
        System.out.println(a1);
        a1.addFirst("Roger");
        a1.addLast("Sofia");
        System.out.println(a1);

        System.out.println(a1.get(1)); // James
        System.out.println(a1.getFirst()); // Roger
        System.out.println(a1.getLast()); // Sofia

        System.out.println(a1.size()); // 7
        a1.clear();
        System.out.println(a1);// []
    }
}

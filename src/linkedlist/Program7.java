package linkedlist;

import java.util.LinkedList;

public class Program7 {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("James");
        a1.add("Peter");
        a1.add("Albert");
        a1.add("Nicolas");
        a1.add("Maria");
        System.out.println(a1); // [James, Peter, Albert, Nicolas, Maria]

        LinkedList<String> a2 = new LinkedList<>();
        a2.add("Roger");
        a2.add("Sofia");
        a2.addAll(a1);
        System.out.println(a2);// [Roger, Sofia, James, Peter, Albert, Nicolas, Maria]

        LinkedList a3 = (LinkedList) a2.clone();
        System.out.println(a3);
    }
}

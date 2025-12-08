package linkedlist;

import java.util.LinkedList;

public class Program6 {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("James");
        a1.add("Peter");
        a1.add("Albert");
        a1.add("Nicolas");
        a1.add("Maria");
        System.out.println(a1); // [James, Peter, Albert, Nicolas, Maria]

        a1.set(2,"Sofia"); // first, it removes existing value and insert a new value.
        System.out.println(a1); // [James, Peter, Sofia, Nicolas, Maria]

        System.out.println(a1.contains("Peter")); // true
        System.out.println(a1.contains("peter")); // false
    }
}

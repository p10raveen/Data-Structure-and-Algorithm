package queue;

import java.util.ArrayDeque;

public class Program3 {
    public static void main(String[] args) {
        ArrayDeque<String> a1 = new ArrayDeque<>();
        a1.add("James");
        a1.add("Peter");
        a1.add("Albert");
        a1.addFirst("Marry");
        a1.addLast("Pooja");
        System.out.println(a1);

    }
}

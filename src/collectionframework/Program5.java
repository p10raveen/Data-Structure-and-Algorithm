package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program5 {
    public static void main(String[] args) {
        TreeSet<String> a1 = new TreeSet<>();
        a1.add("Ajay");
        a1.add("Vijay");
        a1.add("Adam");
        a1.add("Sophia");
        a1.add("Adam");
        System.out.println(a1);
        a1.remove("Vijay");
        System.out.println(a1);

    }
}

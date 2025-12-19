package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;

public class Program3 {
    public static void main(String[] args) {
        HashSet<String> a1 = new HashSet<>();
        a1.add("Ajay");
        a1.add("Vijay");
        a1.add("Adam");
        a1.add("Sophia");
        a1.add("Adam");
        System.out.println(a1);
        a1.remove("Vijay");
        System.out.println(a1);

        HashSet a2 = (HashSet) a1.clone();
        System.out.println(a2);
    }
}

package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Program4 {
    public static void main(String[] args) {
        LinkedHashSet<String> a1 = new LinkedHashSet<>();
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

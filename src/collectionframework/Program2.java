package collectionframework;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Ajay");
        a1.add("Vijay");
        a1.add("Adam");
        a1.add("Sophia");
        System.out.println(a1);
        a1.remove(1);
        System.out.println(a1);
    }
}

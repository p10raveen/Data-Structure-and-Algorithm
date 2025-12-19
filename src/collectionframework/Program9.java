package collectionframework;

import java.util.HashMap;
import java.util.TreeMap;

public class Program9 {
    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(213,"Ajay");
        map.put(512,"Vijay");
        map.put(111,"Adam");
        map.put(99,"Maria");
        System.out.println(map);
        System.out.println(map.get(512)); // Vijay
        map.remove(111);
        System.out.println(map);

        TreeMap<Integer,String> map2 = new TreeMap<>();
        map2.putAll(map);
        System.out.println(map2);
    }
}

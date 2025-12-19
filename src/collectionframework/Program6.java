package collectionframework;

import java.util.HashMap;

public class Program6 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(213,"Ajay");
        map.put(512,"Vijay");
        map.put(111,"Adam");
        map.put(99,"Maria");
        System.out.println(map);
        System.out.println(map.get(512)); // Vijay
        map.remove(111);
        System.out.println(map);

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
    }
}

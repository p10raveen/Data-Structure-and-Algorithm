package collectionframework;

import java.util.HashMap;

public class Program7 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(213,"Ajay");
        map.put(512,"Vijay");
        map.put(111,"Adam");
        map.put(99,"Maria");
        System.out.println(map);

        System.out.println(map.containsKey(99)); // true
        System.out.println(map.containsKey(199)); // false

        System.out.println(map.containsValue("Pooja")); // false
        System.out.println(map.containsValue("Maria")); // true

        System.out.println(map.keySet()); // [512, 99, 213, 111]
        System.out.println(map.entrySet()); // [512=Vijay, 99=Maria, 213=Ajay, 111=Adam]
    }
}

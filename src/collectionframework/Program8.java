package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Program8 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(213,"Ajay");
        map.put(512,"Vijay");
        map.put(111,"Adam");
        map.put(99,"Maria");
        System.out.println(map.entrySet()); // [512=Vijay, 99=Maria, 213=Ajay, 111=Adam]

        for(Map.Entry e: map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}

package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableMap {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1, "one");
        ht.put(2, "Two");
        ht.put(3, "Three");
        System.out.println("Hashtable :");
        for(Map.Entry entry:ht.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(100, "hundred");
        hm.put(101, "hundredOne");
        for(Map.Entry entry:hm.entrySet()){
            System.err.println(entry.getKey()+ " "+entry.getValue());
        }
    }
}

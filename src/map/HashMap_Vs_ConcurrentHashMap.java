package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_Vs_ConcurrentHashMap {

    public static void main(String[] args){
        // Using HashMap
        Map<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("USA", "L.A");
        map.put("UAE", "Dubai");
        map.put("Australia", "Sydney");

        System.out.println("Using HashMap:");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(map.get(it.next()));
            // Uncommenting the line below will cause ConcurrentModificationException
            // map.remove("USA");
            // This will throw ConcurrentModificationException Exception because we cannot modify a hashmap while iterating it.
        }
        System.out.println("HashMap Size: " + map.size());

        // Using ConcurrentHashMap
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("India", "Delhi");
        concurrentHashMap.put("USA", "L.A");
        concurrentHashMap.put("UAE", "Dubai");
        concurrentHashMap.put("Australia", "Sydney");

        System.out.println("\nUsing ConcurrentHashMap:");
        Iterator<String> iterator = concurrentHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(concurrentHashMap.get(key));
            concurrentHashMap.remove("USA"); // This will NOT throw ConcurrentModificationException
            // We can modify a ConcurrentHashMap while iterating it. This is thread safe.
        }
        System.out.println("ConcurrentHashMap Size: " + concurrentHashMap.size());
    }
}

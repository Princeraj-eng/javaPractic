package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMap_Vs_IdentityHashMap {
    public static void main(String[] args) {

        String key1 =  new String("Ram");
        String key2 =  new String("Ram");
        Map<String , Integer> map = new HashMap<>();

        map.put(key1, 90);
        map.put(key2,92);
        System.out.println("HashMap : "+map);

        Map<String , Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, 90);
        identityHashMap.put(key2,92);
        identityHashMap.put("Ram",93);
        System.out.println("IdentityHashMap : "+identityHashMap);
        System.out.println(identityHashMap.get(key2));
    }
    /*
          1.  HashMap uses .equals() for key comparison → "Ram" (key1) and "Ram" (key2) are treated as the same key.
          2.  IdentityHashMap uses == (reference equality) → key1 and key2 are treated as different keys.
          3.  Retrieving a value with "Ram" in IdentityHashMap returns null because "Ram" is a new object and doesn’t match existing keys by reference.
     */

}

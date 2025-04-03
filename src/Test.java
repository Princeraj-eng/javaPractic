import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
    //        Find the most frequent word from a list using a custom collector.
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
//        List<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("jfjh");
        list.add("bxdhb");
        list.add("xcjxo");
        list.add("szjxpo");

        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        String mostFrequentWord = null;
        for (String s : words){
            int count = map.getOrDefault(s, 0) + 1;
            map.put(s, count);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = s;
            }
        }
        System.out.println(mostFrequentWord);



//        words.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
//                .entrySet().stream() // Convert to stream of entries
//                .filter(entry -> entry.getValue() > 1) // Keep only duplicates
//                .map(Map.Entry::getKey) // Extract the key (number)
//                .peek(System.out::println);





    }


}

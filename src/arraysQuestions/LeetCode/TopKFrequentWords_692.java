package arraysQuestions.LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class TopKFrequentWords_692 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("i","love","leetcode","i","love","coding");
        List<String> list2 = List.of("the","day","is","sunny","the","the","the","sunny","is","is");
        topKFrequent(list1,2);
    }

    public static void topKFrequent(List<String> words, int k) {
        Map<String, Integer> frequency = new TreeMap<>();
        int maxCount = 0;
        List<String> result = new ArrayList<>();
        for (String word : words){
            int count = frequency.getOrDefault(word,0)+1;
            frequency.put(word,count);
            if (count > maxCount) {
                maxCount = count;
                result.add(word);
            }
        }
        System.out.println(result+ "result");
        System.out.println(frequency);
    }
}

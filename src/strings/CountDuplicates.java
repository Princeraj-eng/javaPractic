package strings;

import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicates {
    /*
                Problem
            You need to identify and count duplicate characters in a string. For example, in the string "programming", the duplicates are:

            r appears 2 times.
            g appears 2 times.
            m appears 2 times.

            Expected Output :-
            A list or map of duplicate characters and their counts.
            Ignore non-duplicates (characters with a count of 1).
     */

    public static void main(String[] args) {
        Map<Character,Integer> result = duplicates("aannbbbgsjaak");
//        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
        result.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        findDuplicateCharacters("hhttredhff");



    }
    public static Map<Character,Integer> duplicates(String s){
        Map<Character,Integer> result = new HashMap<>();

//        return s.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(n -> n,  Collectors.counting())).entrySet()
//                .stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toMap());

        /*
        Mutable list use this :-
        List<Character> ch = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(ArrayList::new));
        */
        List<Character> ch =  s.chars().mapToObj(c -> (char) c).toList();
        for(Character ci : ch){
            Integer count = 0;
            for (Character c : ch){
                if (ci == c){
                    count++;
                }
            }
            if (count > 1)
               result.put(ci,count);
        }
        return result;
    }


    public static void findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print only duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}

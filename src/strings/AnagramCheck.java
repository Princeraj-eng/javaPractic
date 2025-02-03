package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class AnagramCheck {

    /*
      Two strings are said to be anagrams if they contain the exact same characters in the same frequency, but their order may differ. For example:

            "listen" and "silent" are anagrams.
            "triangle" and "integral" are anagrams.
            "apple" and "papel" are anagrams.
            "hello" and "world" are NOT anagrams.

        Expected Output
                Input: Two strings.
                Output: A boolean value (true or false) indicating whether the two strings are anagrams.
     */


    public static void main(String[] args) {

        isAnagram("apple","papel");
        System.out.println(isAnagramUsingMap("apple", "pape3l"));
    }

    public static void isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("The strings  are not Anagram");
            return;
        }
        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings is Anagram");
        } else
            System.out.println("The strings  are not Anagram");


    }


    public static boolean isAnagramUsingMap(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("The strings  are not Anagram");
            return false;
        }
        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : charArray1){
            frequency.put(c, frequency.getOrDefault(c, 0)+1);
        }

        for (char c : charArray2){
            if (!frequency.containsKey(c)){
                return false;
            }
            frequency.put(c, frequency.get(c) -1);
            if (frequency.get(c) == 0) {
                frequency.remove(c);
            }
        }

        return frequency.isEmpty();

    }


}

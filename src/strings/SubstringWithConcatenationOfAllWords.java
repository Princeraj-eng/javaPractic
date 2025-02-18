package strings;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
      String  s = "barfoothefoobarman";
       String [] words = {"foo","bar", "kkl", "ght"} ;
        List<Integer> result = findSubstring(s,words);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<String> concatenatedStrings = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length -1 ; i++){
            for (int j = i+1; j <  words.length; j++){
                concatenatedStrings.add(words[i]+words[j]);
            }
        }

        System.out.println(concatenatedStrings);

        return result;
    }
}

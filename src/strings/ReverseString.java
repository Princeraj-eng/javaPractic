package strings;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ReverseString {

    public static void main(String[] args) {
        String s = "wedrsf hello";
        char [] ch = s.toCharArray();

        int left = 0;
        int right = ch.length-1;

        while (left < right){

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        System.out.println(ch);
        reverse();
    }

    public static void reverse (){
//        String s = "abcdef ghijk";
////        char [] ch = s.toCharArray();
//        List<Character> charList = s.chars().mapToObj(c -> (char) c).toList();
//        Collections.reverse(charList);
//        charList.stream()
//                .map(String::valueOf) // Convert each character to a string
//                .collect(Collectors.joining());
//        System.out.println(charList);

//        unable to do it in streams


    }
}

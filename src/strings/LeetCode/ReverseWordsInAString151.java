package strings.LeetCode;

import org.xml.sax.SAXNotRecognizedException;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordsInAString151 {
    public static void main(String[] args) {


        System.out.println(reverseWords("  hello world  "));

        System.out.println(reverseWordsUsingStack("the sky is blue"));
    }

    public static String reverseWords(String s) {

        String [] sarr = s.split("\\s+");
//        for (String ss : sarr){
//            System.out.println(ss+"  "+ sarr.length);
//        }
        reverseArray(sarr);

        String kk = Arrays.toString(sarr).replace(",","").replace("[", "").replace("]","");
//        System.out.println(kk+"1111");
        return kk;
    }

    public static void reverseArray(String[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap arr[left] and arr[right]
            String  temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    public static String reverseWordsUsingStack(String s) {
        Stack<String> stack = new Stack<>();
        int i ;
        String str = "";

        for ( i = 0; i< s.length(); i++ ){
            if(s.charAt(i) == ' '){
                stack.push(str);
                str = "";
            }
            else
                str += s.charAt(i);
        }
        String ans = "";
        while (stack.size() != 1)
        {
            ans += stack.peek() + " ";
            stack.pop();

        }ans += stack.peek();

        return ans;

    }
}

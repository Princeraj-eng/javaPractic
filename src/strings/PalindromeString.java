package strings;

public class PalindromeString {

    public static void main(String[] args) {

        System.out.println(isPalindrome(" "));
//        It's returning false if the string is blank which is wrong. I have to implement it in the future.
    }

    public static boolean isPalindrome(String str){

        char [] ch = str.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        if (str.isBlank()){

        }

        int left = 0;
        int right = ch.length-1;
        boolean b = false;
        while (left < right){
            if (ch[left] == ch[right]) {
                b = true;
            }else {
                b = false;
                break;
            }
            left++;
            right --;
        }
        return b;
    }
}

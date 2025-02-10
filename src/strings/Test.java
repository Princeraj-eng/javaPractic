package strings;

public class Test {
    public static void main(String[] args) {
        String s = "Wesdt lP";


    }

    public static void reverse(String s ){
        char [] ch = s.toCharArray();
        int left = 0 ;
        int right = ch.length -1 ;


        while (left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }
        System.out.println(ch);
    }

    public static void palindrome(String s ){
        char [] ch = s.toCharArray();
        int left = 0;
        int right = ch.length -1 ;
        boolean b = false;
        while (left < right){
            if (ch[left] == ch[right]){
                b = true;
            }else {
                b = false;
                break;
            }
            left ++;
            right --;
        }
        System.out.println("String is : "+ b);
    }
}

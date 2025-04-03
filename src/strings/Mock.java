package strings;

public class Mock {


//    Example 1:
//    Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
//    Result: YES (for 1st variant)
//       [1, 3] (for 2nd variant)
//    Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.
//
//    Example 2:
//    Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
//    Result: NO (for 1st variant)
//	[-1, -1] (for 2nd variant)
//    Explanation: There exist no such two numbers whose sum is equal to the target.


    public static void main(String[] args) {
        int ss [] = {2,6,5,8,11};
        int target = 14;
        result(ss, target);
    }

    public static void result(int [] arr, int target){
        int re [] = new  int[2];
        for(int i = 0; i< arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("YES");
                    re[0] = i;
                    re[1] = j;
                    break;
                }
            }
        }
        for (int k : re){
            System.out.println(k);
        }
    }
}

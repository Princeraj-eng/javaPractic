package arraysQuestions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class SingleElementInASortedArray540 {

    /*
    You are given a sorted array consisting of only integers where every element appears exactly twice,
    except for one element which appears exactly once.

        Return the single element that appears only once.

        Your solution must run in O(log n) time and O(1) space.

        Example 1:

            Input: nums = [1,1,2,3,3,4,4,8,8]
            Output: 2
        Example 2:

            Input: nums = [3,3,7,7,10,11,11]
            Output: 10
     */
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int[] a = {1};
        int[] b = {1,1,2,2,3};
        System.out.println(sol(b));
    }

    public static int sol(int[] arr){
        int res = -1;
        if(arr.length == 1){
            return arr[0];
        }
        for (int i = 0; i<arr.length-1; ){
            int j = i+1;
            if(arr[i] == arr[j] || i == arr.length-2){
                i = i+2;
            }else{
                res = arr[i];
            break;}
        }
        return res;
    }







}

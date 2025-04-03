package arraysQuestions.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ThreeSumClosest_16 {
    public static void main(String[] args) {
//        int [] arr = {-1,0,1,2,-1,-4};
        int [] arr = {10,20,30,40,50,60,70,80,90};
        int [] arr3 = {0,1,2};
        System.out.println(bruteForce(arr3,3)+"  llll");
    }

    public static int  bruteForce(int[] arr, int target){
        Arrays.sort(arr);
        int closest = Integer.MAX_VALUE;
        int res = 0;
        for(int i =0; i < arr.length -2; i++){
            int left = i+1;
            int right = arr.length-1;
            while (left < right){
                int sum = arr[i] + arr[left] + arr[right];
//                int diff= 0;
                if(sum == target)
                    return target;
                if(sum < target){
                    left++;
                } else {

                    right--;
                }
                int diff = Math.abs(sum-target);
                if (diff<closest){
                    closest = diff;
                    res = sum;
                }
            }
        }
        return res;
    }
}

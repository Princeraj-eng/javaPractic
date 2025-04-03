package arraysQuestions.LeetCode;

import java.util.*;

public class Three_Sum_15 {

    public static void main(String[] args) {
        System.out.println("hello");

        int [] arr = {-1,0,1,2,-1,-4};
        Set<List<Integer>> res1 = bruteForce(arr);
        Set<List<Integer>> res2 = usingTowPointers(arr);
//        res.stream().flatMap(set -> set.stream().peek(System.out::println)).collect(Collectors.toList());
        for (List<Integer> s : res2){
            System.out.println(s);
        }
    }
    public static Set<List<Integer>> bruteForce(int[] arr){
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0; i< arr.length;i++){
            for(int j = i+1; j< arr.length; j++){
                for (int k= j+1; k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> it = new ArrayList<>();
                        it.add(arr[i]);
                        it.add(arr[j]);
                        it.add(arr[k]);
                        it.sort(Integer::compareTo);
                        res.add(it);
                    }
                }
            }
        }
        return res;
    }


    public static Set<List<Integer>> usingTowPointers(int[] arr){
        if (arr == null || arr.length<3 ) return new HashSet<>();
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length -2; i++){
            int left = i+ 1;
            int right = arr.length -1;

            while (left< right){
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0){
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                }
                else
                    right --;
            }
        }
        return result;

    }
}

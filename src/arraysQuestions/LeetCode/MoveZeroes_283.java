package arraysQuestions.LeetCode;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes(arr);
    }
        public static void moveZeroes(int[] nums) {
            int index = 0;

            for (int i = 0; i< nums.length; i++){
                if (nums[i] !=0){
                    nums[index] = nums[i];
                    index++;
                }
            }
            while(index<nums.length){
                nums[index] =0;
                index++;
            }
            for (int i: nums){
                System.out.print(i+",");
            }

        }

}

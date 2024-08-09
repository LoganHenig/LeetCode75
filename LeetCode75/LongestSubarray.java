package LeetCode.LeetCode75;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                leftArr[i] = count;
            }
            else{
                count = 0;
            }
        }
        count = 0;
        for (int i = nums.length-1; i >= 0; i--){
            if(nums[i] == 1){
                count++;
                rightArr[i] = count;
            }
            else{
                count = 0;
            }
        }
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            if(i > 0){
                count += leftArr[i-1];
            }
            if(i < nums.length -1){
                count += rightArr[i+1];
            }
            if(count > max){
                max = count;
            }
        }
        //return max;
        System.out.println(max);
    }
}

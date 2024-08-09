package LeetCode.LeetCode75;

public class MaximumAveragySubArray {
    public static double findMaxAverage(int[] nums, int k) {

        double sum = 0.0;
        double highest = -Double.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(i<k){
                sum+= nums[i];
                if(i == k-1 && sum/k > highest){
                    highest = sum/k;
                }
            }
            else{
                sum -=nums[i-k];
                sum += nums[i];
                if(sum/k > highest){
                    highest = sum/k;
                }
            }
        }
        return highest;
    }
    public static void main(String[] args) {
        System.out.println(findMaxAverage( new int[]{-1}, 1));
    }



}

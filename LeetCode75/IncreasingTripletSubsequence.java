package LeetCode75;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
     
        int[] nums = new int[] {1,5,0,4,1,3};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= first){
                first = nums[i];
            }
            else if(nums[i] <= second){
                second = nums[i];
            }
            else{
                //return true
                System.out.println(true);
            }

        }
        //return false;
        System.out.println(false);



    }
}

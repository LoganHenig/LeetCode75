package LeetCode75;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int insertIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[insertIndex] = nums[i];
                
                if(i != insertIndex){
                    nums[i] = 0;
                }
                insertIndex++;
            }
        }
        System.out.println(nums);
    }
}

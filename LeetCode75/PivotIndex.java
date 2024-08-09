package LeetCode75;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++){
                count += nums[i];
                leftArr[i] = count;
        }
        count = 0;
        for (int i = nums.length-1; i >= 0; i--){
            count += nums[i];
                rightArr[i] = count;
        }
        int l = 0;
        int r = 0;
        for(int i = 0; i < nums.length; i++){
            //Left Edge Case
            if(i == 0){
                l = 0;
            }
            else{
                l = leftArr[i-1];
            }
            //Right Edge Case
            if(i == nums.length-1){
                r = 0;
            }
            else{
                r = rightArr[i+1];
            }
            if( l == r ){
                // return i;
                System.out.println(i);
            }
        }
        //return -1;
        System.out.println(-1);
    }
}

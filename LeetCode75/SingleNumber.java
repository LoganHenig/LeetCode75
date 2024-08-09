package LeetCode75;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {1,4,7,4,6,6,1};
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }
        System.out.println(xor);
        //return xor;
    }
}

package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumberKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> ar = new ArrayList<>();
        int pairs = 0;
        for(int i = 0; i < nums.length;i++){
            ar.add(nums[i]);
        }
        int l = 0;
        int r = ar.size()-1;
        while(l < r){
            if(ar.get(l) + ar.get(r) == k){
                pairs++;
                r--;
                l++;
            }
            else if(ar.get(l) + ar.get(r) > k){
                r--;
            }
            else{
                l++;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 5));
    }
}

package LeetCode75;

import java.util.ArrayList;
import java.util.Stack;
public class MaxConsecutiveOnes3 {
 
    public static int LongestOnes(int[] nums, int k){
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        if(nums[0] == 1){
            newNums.add(1);
        }
        else{
            newNums.add(-1);
        }
        int currentSize = 0;
        for(int i = 1; i < nums.length; i++){
            currentSize = newNums.size()-1;
            if(nums[i] == 1){
                if(newNums.get(currentSize) > 0){
                    newNums.set(currentSize, newNums.get(currentSize)+1);
                }
                else{
                    newNums.add(1);
                }
            }
            else{
                if(newNums.get(currentSize) < 0){
                    newNums.set(currentSize, newNums.get(currentSize)-1);
                }
                else{
                    newNums.add(-1);
                }

            }
        }
        int currentOnes = 0;
        int max = 0;
        int tempK = 0;
        for (int i = 0; i < newNums.size(); i++){
            tempK = k;
            currentOnes = 0;
            for (int j = i; j < newNums.size(); j++){
                if(newNums.get(j) > 0){
                    currentOnes += newNums.get(j);
                }
                else{
                    tempK += newNums.get(j);
                }
                //check if all the K's have been used up
                if(tempK < 0){
                    if(max < currentOnes){
                        max = currentOnes;
                    }
                    break;
                }
            }
            //if all K's were not used but max value is found
            if(max < currentOnes){
                max = currentOnes;
            }
        }
        max += k;
        if(max > nums.length){
            max = nums.length;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(LongestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    
    }
}
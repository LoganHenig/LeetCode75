package LeetCode.LeetCode75;

import java.util.ArrayList;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,8,9,1,2,2};
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int [nums.length];
        
        int multiplyer = 1;
        for(int i = 0; i< nums.length; i++){
            multiplyer *= nums[i];
            leftProduct[i] = multiplyer;
        }
        multiplyer = 1;
        for(int i = nums.length-1; i >= 0; i--){
            multiplyer *= nums[i];
            rightProduct[i] = multiplyer;
        }
        
        int[] productArray = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++){
            if(i > 0){
                product *= leftProduct[i-1];
            }
            if(i < nums.length-1){
                product *= rightProduct[i+1];
            }
            productArray[i] = product;
            product = 1;
        }
        //return productArray;
        for(int i = 0; i < nums.length; i++){
            System.out.println(productArray[i]);
        }
    }

}

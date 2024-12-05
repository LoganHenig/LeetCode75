package LeetCode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for( int num : nums1){
            set1.add(num);
        }
        for( int num : nums2){
            set2.add(num);
        }
        List<List<Integer>> output  = new ArrayList<>();
        output.add(new ArrayList<>());
        output.add(new ArrayList<>());

        for (int num : set1){
            if(!set2.contains(num)){
                output.get(0).add(num);
            }
        }
        for (int num : set2){
            if(!set1.contains(num)){
                output.get(1).add(num);
            }
        }
        return output;
    }
    
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,3,5,7,7},new int[]{2,4,5,7}));
        
    }
}

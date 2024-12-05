package LeetCode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> set1 = new HashMap<>();
        for (int nums : arr){
            set1.put(nums, set1.getOrDefault(nums, 0)+1);
        }
        HashSet<Integer> checkUnique = new HashSet<>(set1.values());
        if(checkUnique.size() == set1.size()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{2,2,1,1,3}));
        
    }
}

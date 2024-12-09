package LeetCode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoStringsAreClose {

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        Map<Character, Integer> w1 = new HashMap<>();
        Map<Character, Integer> w2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++){
            w1.put(word1.charAt(i),w1.getOrDefault(word1.charAt(i), 0)+1 );
        }
        for (int i = 0; i < word2.length(); i++){
            w2.put(word2.charAt(i),w2.getOrDefault(word2.charAt(i), 0)+1 );
        }
        //Check if they use the same letter set
        System.out.println(w1);
        System.out.println(w2);
        for (Character key : w1.keySet()){
            if(!w2.keySet().contains(key)){
               return false;
            }
        }
        for (Character letter : w2.keySet()){
            if(!w1.keySet().contains(letter)){
               return false;
               
            }
        }
        ArrayList<Integer> w1Values = new ArrayList<>();
        ArrayList<Integer> w2Values = new ArrayList<>();
        for(int nums : w1.values()){
            w1Values.add(nums);
        }
        for(int nums : w2.values()){
            w2Values.add(nums);
        }
        w1Values.sort(null);
        w2Values.sort(null);
        System.out.println(w1Values);
        System.out.println(w2Values);
        for(int i = 0; i < w1Values.size(); i++){
            if(w2Values.get(i).intValue() != w1Values.get(i).intValue()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(closeStrings("cabbba", "abbccc"));
    }
}

package LeetCode75;

import java.util.ArrayList;

public class MaximumNumberOfVowels {

    public static int maxVowels(String s, int k){
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i = 0; i < k; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels.add(s.charAt(i));
            }
        }
        int maxVowels = vowels.size();
        for(int i = k; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels.add(s.charAt(i));
            }
            if(s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e' || s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' || s.charAt(i-k) == 'u'){
                vowels.remove(0);
            }
            if(maxVowels < vowels.size()){
                maxVowels = vowels.size();
            }
        }
        return maxVowels;
    }
    public static void main(String[] args) {

        System.out.println(maxVowels("testtestiihghgfhghiiii", 5));
        
    }
}

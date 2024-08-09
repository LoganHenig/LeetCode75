package LeetCode.LeetCode75;
import java.util.Arrays;

public class CombineWords {
    public static void main(String[] args){
        String word1 = "abc";
        String word2 = "pqr";
        String newWord = "";

        int w1 = 0;
        int w2 = 0;
        boolean turn = true;
        while(w1< word1.length() || w2 < word2.length()){
            if(turn){
                if(w1< word1.length()){
                    newWord += word1.charAt(w1);
                    w1++;
                }
                else{
                    newWord += word2.charAt(w2);
                    w2++; 
                }
            }
            else {
                if(w2< word2.length()){
                    newWord += word2.charAt(w2);
                    w2++;
                }
                else{
                    newWord += word1.charAt(w1);
                    w1++; 
                }
            }
            turn = !turn;
            System.out.println(newWord);
        }
        //return newWord;
    }
}
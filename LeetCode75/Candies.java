package LeetCode75;
import java.util.ArrayList;

public class Candies {
    public static void main(String[] args){
        int[] candies = new int[] {2,3,5,1,3};
        int extraCandies = 3;
        int maxCandies = 0;
        ArrayList<Boolean> answer = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++){
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxCandies){
                answer.add(true);
            }
            else{
                answer.add(false);
            }
        }
        //return answer;
    }
}
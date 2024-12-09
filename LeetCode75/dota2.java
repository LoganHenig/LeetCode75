package LeetCode75;

import java.util.LinkedList;
import java.util.Queue;

public class dota2 {

    public static String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        //create QUEUES
        for ( int i = 0; i < senate.length(); i++){
            if (senate.charAt(i) == 'R'){
                r.add(i);
            }
            else {
                d.add(i);
            }
        }
        int tempR = 0;
        int tempD = 0;
        while (!r.isEmpty() && !d.isEmpty()){
            tempR = r.poll();
            tempD = d.poll();
            if(tempR < tempD){
                r.add(tempR + senate.length());
            }
            else{
                d.add(tempD + senate.length());
            }
        }
        if(!r.isEmpty()){
            return "Radiant";
        }
        else {
            return "Dire";
        }
    }
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }
    
}

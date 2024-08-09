package LeetCode.LeetCode75;

import java.util.ArrayList;

public class NumberOfRecentCalls {
    ArrayList<Integer> calls = new ArrayList<Integer>();
    public NumberOfRecentCalls(){

    }
    public int ping(int t){
        //removes calls older than 3000
        for(int i = 0; i < calls.size(); i++){
            System.out.println(t - calls.get(i));
            if(t - calls.get(i) > 3000){
                calls.remove(i);
                i--;
            }
            else{
                break;
            }
        }

        calls.add(t);
        return calls.size();
    }

    public static void main(String[] args) {
        NumberOfRecentCalls norc = new NumberOfRecentCalls();
        System.out.println(norc.ping(1));
        System.out.println(norc.ping(500));
        System.out.println(norc.ping(3005));
        System.out.println(norc.ping(9000));
    }

}

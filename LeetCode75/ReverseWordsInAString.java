package LeetCode75;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String newS = "";
        ArrayList<String> sList = new ArrayList<String>(Arrays.asList(s.split("\\s+")));
        Collections.reverse(sList);
        for (int i = 0; i < sList.size(); i++){
            if(sList.get(i).isEmpty()){
                //do nothing
            }
            else if(i == 0){
                newS = sList.get(i);
            }
            else{
                newS += " " + sList.get(i);
            }
        }
        //return newS;
        System.out.println(newS);
    }
}

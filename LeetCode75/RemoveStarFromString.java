package LeetCode75;

public class RemoveStarFromString {
    public static String removeStars(String s) {
        String newS = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*' ){
                newS = newS.substring(0, newS.length() - 1);
            }
            else{
                
                newS += s.charAt(i);
            }
        }
        return newS;
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
    
}

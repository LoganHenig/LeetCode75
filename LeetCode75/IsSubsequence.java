package LeetCode75;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        if(t == "" || s.length() > t.length()){
            return false;
        }
        for(int i = 0; i < t.length(); i++){
            if( s.charAt(0) == t.charAt(i)){
                s = s.substring(1);
                if(s.length() == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("","ahbgdc"));
    }
}

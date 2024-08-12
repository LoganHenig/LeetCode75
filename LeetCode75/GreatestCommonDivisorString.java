package LeetCode75;

public class GreatestCommonDivisorString {

    private static String GCD(String str1,String str2) {
        if(str2.length() > str1.length()){
           return GCD(str2, str1);
        }
        if(str2.equals(str1)){
            return str2;
        }
        if(str1.startsWith(str2)){
            return GCD(str1.substring(str2.length()),str2);
        }
        return "";
    }
    public static void main(String[] args) {
        String str1 = "ABAB";
        String str2 = "ABABAB";
        
        System.out.println(GCD(str1,str2));
        
        
        

    }
}

package LeetCode.LeetCode75;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "Hello there i reverse vowels";
        String vowels = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
               s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' )
            {
                vowels = s.charAt(i) + vowels;
                s = s.substring(0,i) + '*' + s.substring(i+1);
            }
        }
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '*'){
                s = s.substring(0,i) + vowels.charAt(0) + s.substring(i+1);
                vowels = vowels.substring(1);
            }
        }
        System.out.println(s);
    }
}

package LeetCode75;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> strings = new Stack<>();

        String currentString = "";
        int i = 0;
        int count = 0;

        while (i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                count = 0;
                while(Character.isDigit(s.charAt(i))){
                    count = 10 * count + (s.charAt(i) -'0');
                    i++;
                }
                numbers.push(count);
            }
            else if(s.charAt(i) == '['){
                strings.push(currentString);
                currentString = "";
                i++;
            }
            else if(s.charAt(i) == ']'){
                String tempString = strings.pop();
                count = numbers.pop();
                for (int j = 0; j < count; j++){
                    tempString += currentString;
                }
                currentString = tempString;
                i++;
            }
            else{
                currentString += s.charAt(i);
                i++;
            }
        }
        
    
        return currentString;
    }
    public static void main(String[] args) {
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }
}

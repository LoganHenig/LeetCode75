package LeetCode.LeetCode75;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        String output = "";
        int count = 0;
        char currentChar = ' ';
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == currentChar){
                count++;
            }
            else{
                if(count > 1){
                    output+= count;
                }
                count = 1;
                output += chars[i];
                currentChar = chars[i];
                
            }
        }
        if(count > 1){
            output+= count;
        }

        for(int i = 0; i<output.length();i++){
            chars[i] = output.charAt(i);
        }

        System.out.println(chars);
        System.out.println(output.length());
    }

}

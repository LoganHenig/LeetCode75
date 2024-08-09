package LeetCode75;

public class CountingBits {

    public static void main(String[] args) {
        int n = 5;
        int[] bitArray = new int[n+1];
        int count = 0;
        for(int i = 0; i <= n; i++){
            count = 0;
            String bits = Integer.toString(i, 2);



            for(int j = 0; j < bits.length(); j++){
                if(bits.charAt(j) == '1'){
                    count +=1;
                }
            }
            bitArray[i] = count;
        }
        System.out.println("pause");

    }


}

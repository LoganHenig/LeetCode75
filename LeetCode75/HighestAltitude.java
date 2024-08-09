package LeetCode.LeetCode75;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int altitude = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++){
            altitude += gain[i];
            if(altitude > max){
                max = altitude;
            }
        }
        //return max;
        System.out.println(max);
    }
}

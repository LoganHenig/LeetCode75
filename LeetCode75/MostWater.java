package LeetCode75;
public class MostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        int leftI = 0;
        int rightI = height.length-1;
        int currentHeight = 0;
        while (leftI < rightI){
            currentHeight = Math.min(height[leftI], height[rightI]);
            currentHeight = currentHeight * (rightI-leftI);
            if(maxArea < currentHeight){
                maxArea = currentHeight;
            }
            if(height[leftI] > height[rightI]){
                rightI--;
            }
            else{
                leftI++;
            }
        }
        //return maxArea;
        System.out.println(maxArea);    
    }
}

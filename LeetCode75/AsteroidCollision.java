package LeetCode75;

import java.util.Stack;
public class AsteroidCollision {
 
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i<asteroids.length; i++){
            int tempAstreroid = asteroids[i];
            //positive asteroid
            if(asteroids[i] > 0){
                stack.add(tempAstreroid);
            }
            //negative asteroid
            else{
                //asteroid can automatially be added 
                if(stack.size() > 0 && stack.peek() < 0){
                    stack.add(asteroids[i]);
                }
                else{
                    while(stack.size() > 0 && stack.peek() > 0 && tempAstreroid != 0){
                        if(stack.peek() > -tempAstreroid){
                            tempAstreroid = 0;
                        }
                        else if(stack.peek() == -tempAstreroid){
                            tempAstreroid = 0;
                            stack.pop();
                        }
                        else{
                            stack.pop();
                            
                        }
                    }
                    if(tempAstreroid != 0){
                        stack.add(tempAstreroid);
                    }
                }
            }
        }
        int[] returnArray = new int[stack.size()];
        for ( int i = 0; i < stack.size(); i++){
            returnArray[i] = stack.elementAt(i);
        }
        return returnArray;
    }
    
    public static void main(String[] args) {
        asteroidCollision(new int[]{-2,-1,1,2});
    
    }

}

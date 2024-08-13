package LeetCode75;

public class BinarayGuessNumber {

    private static int guess(int n){
        if(n == 1702766719){
            return 0;
        }
        else if(n < 1702766719){
            return -1;
        }
        else {
            return 1;
        }
    }

    public static int guessNumber(int n){
        long lowestNum = 0;
        long guess = 0;
        
        long input = 0;
        do{
            guess = (n+lowestNum+1) /2;
            input = guess((int)guess);
            if(input == 1){
                n = (int)guess;
            }
            else if(input == -1){
                lowestNum = guess;
            }

        } while(input != 0);
        return (int)guess;
    }
    public static void main(String[] args) {
        guessNumber(2126753390);
    }
}

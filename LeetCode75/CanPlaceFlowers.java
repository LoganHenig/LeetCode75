package LeetCode.LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;

public class CanPlaceFlowers {

    private static int checkIndex(int i, ArrayList<Integer> flowerBed){
        int validSpot = 1;
        if(i > 0){
            if(flowerBed.get(i-1) == 1 ){
                validSpot = 0;
            }
        } 
        if(i <flowerBed.size() -1){
            if(flowerBed.get(i +1) == 1 ){
                validSpot = 0;
            }
        }
        return validSpot;
    }
    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> flowerBed = new ArrayList<Integer>(Arrays.asList(1,0,0,0,0,0,1));

        int openSpots = 0;
        for (int i = 0; i < flowerBed.size(); i++){
            if(flowerBed.get(i) == 0){
                if(checkIndex(i,flowerBed) == 1){
                    flowerBed.set(i,1);
                    openSpots +=1;
                }
            }
        }
        if( n <= openSpots){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        for (int i = 0; i< flowerBed.size(); i++ ) {
            System.out.println(flowerBed.get(i));
        }

    }
}

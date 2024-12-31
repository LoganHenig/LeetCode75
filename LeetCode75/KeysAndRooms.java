package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {

    public static void logic(HashSet<Integer> set, List<List<Integer>> rooms, int currentRoom ){
        if(!set.contains(currentRoom)){
            set.add(currentRoom);
            for(int key : rooms.get(currentRoom)){
                if(!set.contains(key)){
                    logic(set, rooms, key);
                }
            }
        }
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> hs = new HashSet<>(); 
        logic(hs, rooms, 0);
        if(hs.size() == rooms.size()) return true;
        return false;
    }
    public static void main(String[] args) {
        List<Integer> innerList = Arrays.asList(1,3);
        List<List<Integer>> list = new ArrayList<>();
        list.add(innerList);
        innerList = Arrays.asList(3,0,1);
        list.add(innerList);
        innerList = Arrays.asList(2);
        list.add(innerList);
        innerList = Arrays.asList(0);
        list.add(innerList);
        System.out.println(canVisitAllRooms(list));

    }
}

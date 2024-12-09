package LeetCode75;

import java.util.HashMap;

public class equalPairs {
    public static int equalPairs(int[][] grid) {
        
        HashMap<String,Integer> row = new HashMap<>();
        HashMap<String,Integer> col = new HashMap<>();
        //set Rows
        String values = "";
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                values += grid[i][j] + ",";
            }
            row.put(values, row.getOrDefault(values,0) + 1);
            values = "";
        }
        //set Cols
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                values += grid[j][i] + ",";
            }
            col.put(values, col.getOrDefault(values,0) + 1);
            values = "";
        }
        int equalRows = 0;
        //check for matches
        for(String c : col.keySet()){
            if(row.containsKey(c)){
                equalRows += col.get(c) * row.get(c);
            }
        }
        return equalRows;
    }
    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }
        
}

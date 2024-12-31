package LeetCode75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxLevelSumBT {

    public static List<Integer> logic(TreeNode root, int currentLayer, List<Integer> list){
        
        if(root == null) return list;



        if(list.size() < currentLayer){
            list.add(root.val);
        }
        else{
            list.set(currentLayer-1, list.get(currentLayer-1) + root. val);
        }
        
        logic(root.left, currentLayer + 1, list);
        logic(root.right, currentLayer + 1, list);
        System.out.println(list);
        return list;
    }

    public static int maxLevelSum(TreeNode root) {


        List<Integer> ar = new LinkedList<>();
        ar =  logic(root, 1, ar);
        int max = -Integer.MAX_VALUE;
        int layer = -1;
        for( int i = 0; i < ar.size(); i++){
            if(max < ar.get(i)) {
                max = ar.get(i);
                layer = i;
            }
        }
        return layer+1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(new Integer[] {989,null,10250,98693,-89388,null,null,null,-32127});
        System.out.println(maxLevelSum(root));
    }
    
}

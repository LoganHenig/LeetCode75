package LeetCode75;
import java.util.HashMap;
import java.util.HashSet;

import LeetCode75.TreeNode;
public class PathSum3 {

    private static int pathSumLogic(TreeNode root, int targetSum,HashMap<Long, Long> hs, int matches){
        if(root == null) return 0;
        HashMap<Long,Long> newHsRight = new HashMap<>();
        HashMap<Long,Long> newHsLeft = new HashMap<>();
        for (Long i : hs.keySet()){
                newHsRight.put(i + root.val, hs.get(i));
                newHsLeft.put(i + root.val , hs.get(i));
            }
        newHsRight.put((long)root.val, newHsRight.getOrDefault((long)root.val, (long) 0) +1);
        newHsLeft.put((long)root.val, newHsLeft.getOrDefault((long)root.val, (long)0) +1);
        
        //searchLeft
        matches = pathSumLogic(root.left, targetSum, newHsLeft, matches);
        //searchRight
        matches += pathSumLogic(root.right, targetSum, newHsLeft, matches);
        if(newHsLeft.keySet().contains((long)targetSum))
            matches += newHsLeft.get((long)targetSum);

        return matches;
    }
    public static int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Long> hs = new HashMap<>();
        System.out.println(hs.keySet());
        return pathSumLogic(root, targetSum, hs, 0);
    }

    public static void main(String[] args) {
        // TreeNode root = new TreeNode(1,
        // new TreeNode(-2,new TreeNode(1, new TreeNode(-1), null), new TreeNode(3)), 
        // new TreeNode(-3, new TreeNode(-2),null));

        
        TreeNode root = new TreeNode(0,
        new TreeNode(1), 
        new TreeNode(1));

        System.out.println(pathSum(root, 1));
    }
}

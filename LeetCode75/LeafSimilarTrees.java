package LeetCode75;

import java.util.ArrayList;

public class LeafSimilarTrees {
    int val;
    LeafSimilarTrees left;
    LeafSimilarTrees right;
    LeafSimilarTrees() {}
    LeafSimilarTrees(int val) { this.val = val; }
    LeafSimilarTrees(int val, LeafSimilarTrees left, LeafSimilarTrees right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }

    public static ArrayList<Integer> checkTreeLeaves(LeafSimilarTrees t, ArrayList<Integer> leaves){
        if(t == null){
            return leaves;
        }
        if(t.left != null){
            leaves = checkTreeLeaves(t.left, leaves);
        }
        if(t.right != null){
            leaves = checkTreeLeaves(t.right, leaves);
        }
        if(t.right == null && t.left == null){
            leaves.add(t.val);
        }
        return leaves;
    }

    public static boolean leafSimilar(LeafSimilarTrees t1, LeafSimilarTrees t2){
        ArrayList<Integer> t1Leaves = new ArrayList<Integer>();
        ArrayList<Integer> t2Leaves = new ArrayList<Integer>();
        t1Leaves = checkTreeLeaves(t1, t1Leaves);
        t2Leaves = checkTreeLeaves(t2, t2Leaves);
        System.out.println(t1Leaves);
        System.out.println(t2Leaves);
        
        if(t1Leaves.size() == t2Leaves.size()){
            for (int i = 0; i < t1Leaves.size(); i++){
                if(!t1Leaves.get(i).equals(t2Leaves.get(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        // leaves should be 1 4 7
        // LeafSimilarTrees root1 = new LeafSimilarTrees(3, new LeafSimilarTrees(1), new LeafSimilarTrees(2, new LeafSimilarTrees(4), new LeafSimilarTrees(7)));
        // LeafSimilarTrees root2 = new LeafSimilarTrees(3, new LeafSimilarTrees(2, new LeafSimilarTrees(1), new LeafSimilarTrees(4) ), new LeafSimilarTrees(7));
        
        LeafSimilarTrees root1 = new LeafSimilarTrees(1, new LeafSimilarTrees(2), new LeafSimilarTrees(200));
        LeafSimilarTrees root2 = new LeafSimilarTrees(1, new LeafSimilarTrees(2), new LeafSimilarTrees(200));

        System.out.println(leafSimilar(root1, root2));


    }

}

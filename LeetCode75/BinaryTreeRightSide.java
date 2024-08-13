package LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSide {
    int val;
    BinaryTreeRightSide left;
    BinaryTreeRightSide right;
    BinaryTreeRightSide() {}
    BinaryTreeRightSide(int val) { this.val = val; }
    BinaryTreeRightSide(int val, BinaryTreeRightSide left, BinaryTreeRightSide right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static List<Integer> rfs(BinaryTreeRightSide node, List<Integer> rightSide, int layer){
        if(node == null){
            return rightSide;
        }
        layer++;
        if(rightSide.size() < layer){
            rightSide.add(node.val);
        }
        if(node.right != null){
            rightSide = rfs(node.right, rightSide, layer);
        }
        if(node.left != null){
            rightSide = rfs(node.left, rightSide, layer);
        }

        return rightSide;

    }
    
    public static List<Integer> rightSideView(BinaryTreeRightSide root) {
        List<Integer> rightSide = new ArrayList<Integer>();
        rfs(root, rightSide, 0);
        
        
        return rightSide;
    }
    public static void main(String[] args) {
        BinaryTreeRightSide right = new BinaryTreeRightSide(3, new BinaryTreeRightSide(6), null);
        BinaryTreeRightSide left = new BinaryTreeRightSide(2, new BinaryTreeRightSide(5, new BinaryTreeRightSide(4), null), null);
        BinaryTreeRightSide head = new BinaryTreeRightSide(1, left, right);
        System.out.println(rightSideView(head));
    }
}

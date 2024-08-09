package LeetCode.LeetCode75;

import java.lang.runtime.TemplateRuntime;

public class MaxDepthBinaryTree {
     int val;
     MaxDepthBinaryTree left;
     MaxDepthBinaryTree right;
     MaxDepthBinaryTree() {}
     MaxDepthBinaryTree(int val) { this.val = val; }
     MaxDepthBinaryTree(int val, MaxDepthBinaryTree left, MaxDepthBinaryTree right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

    public static int checkDepth(MaxDepthBinaryTree node, int currentDepth){
        int l = 0; 
        int r = 0;
        if(node.left != null){
            l = checkDepth(node.left, currentDepth+1);
        }
        if(node.right != null){
            r = checkDepth(node.right, currentDepth+1);
        }
        if(node.right == null && node.left == null){
            return currentDepth;
        }
        if(l > r){
            return l; 
        }
        else{
            return r;
        }
    }

    public static void main(String[] args) {
        MaxDepthBinaryTree root = new MaxDepthBinaryTree(3, new MaxDepthBinaryTree(9), new MaxDepthBinaryTree(20, new MaxDepthBinaryTree(15), new MaxDepthBinaryTree(7, new MaxDepthBinaryTree(5),new MaxDepthBinaryTree(6))));
        System.out.println("test");
        int depth = 1;
        System.out.println(checkDepth(root, depth));
    }
}

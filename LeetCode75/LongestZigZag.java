package LeetCode75;

public class LongestZigZag {

    private static int zigZagLogic(TreeNode node, int depth,boolean lastWasLeft, int max){
        if(node == null) return depth;
        else if(lastWasLeft){
            depth = Math.max(
            zigZagLogic(node.left, 0, true, max),
            zigZagLogic(node.right, depth+1, false, max));
        }
        else if(!lastWasLeft){
            depth = Math.max(
            zigZagLogic(node.left, depth+1, true, max),
            zigZagLogic(node.right, 0, false, max));
        }
        return depth;
    }

    public static int longestZigZag(TreeNode root) {
        return Math.max(zigZagLogic(root.left, 0, true, 0),zigZagLogic(root.right, 0, false, 0));
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1, null, new TreeNode(1, new TreeNode(1), new TreeNode(1,new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1))),new TreeNode(1))));
        System.out.println(longestZigZag(head));
    }
}

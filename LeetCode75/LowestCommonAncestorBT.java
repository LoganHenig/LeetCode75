package LeetCode75;

public class LowestCommonAncestorBT {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        TreeNode right = new TreeNode();
        TreeNode left = new TreeNode();

        left = lowestCommonAncestor(root.left, p, q);
        right = lowestCommonAncestor(root.right, p, q);
        if(right != null && left != null){
            return root;
        }
        else if(right != null){
            if(root == p || root == q){
                return root;
            }
            return right;
        }
        else if(left != null){
            if(root == p || root == q){
                return root;
            }
            return left;
        }
        else if (root == p || root == q){
            return root;
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
        TreeNode p = root.left;
        TreeNode q = root.right;
        System.out.println(lowestCommonAncestor(root, p, q));
    }
}

package LeetCode75;

public class GoodNodesInTree {
    int val;
    GoodNodesInTree left;
    GoodNodesInTree right;
    GoodNodesInTree() {}
    GoodNodesInTree(int val) { this.val = val; }
    GoodNodesInTree(int val, GoodNodesInTree left, GoodNodesInTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static int checkNode( GoodNodesInTree node, int prevMax){
        int sum = 0;
        if(node.val >= prevMax){
            sum++;
            prevMax = node.val;
        }
        if(node.left != null){
            sum += checkNode(node.left, prevMax);
        }
        if(node.right != null){
            sum += checkNode(node.right, prevMax);
        }
        return sum;
    }

    public static int goodNodes(GoodNodesInTree root){
        return checkNode(root, -Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        GoodNodesInTree tree = new GoodNodesInTree(0, new GoodNodesInTree(1, new GoodNodesInTree(3), new GoodNodesInTree(7)), new GoodNodesInTree(9));
        System.out.println(goodNodes(tree));
    }

}

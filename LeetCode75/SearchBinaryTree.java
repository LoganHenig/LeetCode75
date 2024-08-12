package LeetCode75;


public class SearchBinaryTree {
    int val;
    SearchBinaryTree left;
    SearchBinaryTree right;
    SearchBinaryTree() {}
    SearchBinaryTree(int val) { this.val = val; }
    SearchBinaryTree(int val, SearchBinaryTree left, SearchBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right; 
    }
    public static SearchBinaryTree searchBST(SearchBinaryTree root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(val > root.val){
            return searchBST(root.right, val);
        }
        else{
            return searchBST(root.left, val);
        }
    }

    public static void main(String[] args) {
        SearchBinaryTree root = new SearchBinaryTree(4, new SearchBinaryTree(2, new SearchBinaryTree(1), new SearchBinaryTree(3)), new SearchBinaryTree(7));
        System.out.println(searchBST(root,7));
    }
}

package LeetCode75;

public class DeleteMiddleNode {
    int val;
    DeleteMiddleNode next;
    DeleteMiddleNode() {}
    DeleteMiddleNode(int val) { this.val = val; }
    DeleteMiddleNode(int val, DeleteMiddleNode next) { this.val = val; this.next = next; }

    public static DeleteMiddleNode deleteMiddle(DeleteMiddleNode head){
        DeleteMiddleNode node = head;
        int length = 1;
        while(node.next != null){
            length++;
            node = node.next;
        }
        int middleNodeIndex = (length/2);
        node = head;
        int index = 1;
        while (node.next != null){
            if(index == middleNodeIndex){
                node.next = node.next.next;
                return head;
            }
            else{
                index++;
                node = node.next;
            }
        }

        //Should not reach this point
        return null;
    }
    public static void main(String[] args) {
        DeleteMiddleNode head = new DeleteMiddleNode(2, new DeleteMiddleNode(7, new DeleteMiddleNode(12, new DeleteMiddleNode(4,new DeleteMiddleNode(2)))));
        deleteMiddle(head);
    }

}

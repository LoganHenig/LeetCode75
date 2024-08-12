package LeetCode75;

public class OddEvenLinkedList {
    int val;
    OddEvenLinkedList next;
    OddEvenLinkedList() {}
    OddEvenLinkedList(int val) { this.val = val; }
    OddEvenLinkedList(int val, OddEvenLinkedList next) { this.val = val; this.next = next; }

    public static OddEvenLinkedList oddEvenList(OddEvenLinkedList head) {
        if(head == null || head.next == null){
            return head;
        }
        OddEvenLinkedList node = head.next;
        OddEvenLinkedList oddListHead = head;
        OddEvenLinkedList evenListHead = head.next;
        OddEvenLinkedList tempNode = null;
        while (node != null && node.next != null){
            tempNode = node.next;
            oddListHead.next = tempNode;
            oddListHead = oddListHead.next;
            node.next = node.next.next;  
            node = node.next; 

        }

        oddListHead.next = evenListHead;

        return head;
    }
    public static void main(String[] args) {
        OddEvenLinkedList head = new OddEvenLinkedList(1, new OddEvenLinkedList(2, new OddEvenLinkedList(3, new OddEvenLinkedList(4,new OddEvenLinkedList(5)))));
        head = oddEvenList(head);
        System.out.println("check");
    }
}

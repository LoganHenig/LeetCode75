package LeetCode75;

public class ReverseList {
    int val;
    ReverseList next;
    ReverseList() {}
    ReverseList(int val) { this.val = val; }
    ReverseList(int val, ReverseList next) { this.val = val; this.next = next; }

    public static ReverseList reverseList(ReverseList head){

        ReverseList prev = null;
        ReverseList nextNode = null;
        // 1 -> 2 -> 3 -> 4 ->
        while (head != null){
            nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
    public static void main(String[] args) {
        ReverseList r = new ReverseList(1, new ReverseList(2, new ReverseList(3, new ReverseList(4))));
        r = reverseList(r);
        System.out.println('t');;

    }
}

package LeetCode75;

public class MaxTwinSum {
    int val;
    MaxTwinSum next;
    MaxTwinSum() {}
    MaxTwinSum(int val) { this.val = val; }
    MaxTwinSum(int val, MaxTwinSum next) { this.val = val; this.next = next; }

    private static MaxTwinSum reverseList( MaxTwinSum head){        
        MaxTwinSum prev = null;
        MaxTwinSum nextNode = null;
        // 1 -> 2 -> 3 -> 4 ->
        while (head != null){
            nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
    
    private static MaxTwinSum reverseHalfList( MaxTwinSum head){
        int count = 1;
        MaxTwinSum countList = head;
        while(countList.next != null){
            countList = countList.next;
            count++;
        }
        countList = head;
        for(int i = 0; i< count/2; i++){
            countList = countList.next;
        }
        countList = reverseList(countList);
        return countList;
    }

    public static int pairSum(MaxTwinSum head) {
        int max = -Integer.MAX_VALUE;
        MaxTwinSum SecondHalf = reverseHalfList(head);
        while(SecondHalf != null){
            if(head.val + SecondHalf.val > max){
                max = head.val + SecondHalf.val;
            }
            head = head.next;
            SecondHalf = SecondHalf.next;
        }


        return max;
    }
    public static void main(String[] args) {
        MaxTwinSum r = new MaxTwinSum(4, new MaxTwinSum(2, new MaxTwinSum(2, new MaxTwinSum(3))));
        System.out.println(pairSum(r));

    }
}

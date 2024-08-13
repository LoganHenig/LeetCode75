package LeetCode75;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestNumber {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        for(int i = 0; i< k -1; i++){
            pq.poll();
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{1,4,6,7,9,3,2,2,4},3));

    }
}

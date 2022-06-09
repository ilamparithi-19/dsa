package Heap;

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        for(int ele: nums) {
            pq.add(ele);
        }
        int n = k -1;
        while(n > 0) {
            pq.remove();
            n--;
        }
        return pq.peek();
    }
}
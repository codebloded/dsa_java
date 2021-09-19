package array;

import java.util.*;
import java.lang.*;
import java.io.*;

public class kth {
    static void findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, Collections.reverseOrder()); // (k,//
                                                                                               // Collections.reverseOrder())
                                                                                               // /mix heap

        for (int i = 0; i < k; i++)
            pq.add(nums[i]);

        for (int i = k; i < nums.length; i++) {
            if (pq.peek() > nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        System.out.println(pq.peek());
    }

    public static void main(String[] args) {

        int[] vec = { 5, 20, 10, 7, 1 };

        int K = 2;

        kth.findKthLargest(vec, K);
    }
}

package searchingSorting;

import java.io.*;
import java.util.*;

public class inplacemergesort {
    // Calculating next gap
    private static int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (int) Math.ceil(gap / 2.0);
    }

    // Function for swapping
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Merging the subarrays using shell sorting
    // Time Complexity: O(nlog n)
    // Space Complexity: O(1)
    private static void inPlaceMerge(int[] nums, int start, int end) {
        int gap = end - start + 1;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            for (int i = start; i + gap <= end; i++) {
                int j = i + gap;
                if (nums[i] > nums[j])
                    swap(nums, i, j);
            }
        }
    }

    // merge sort makes log n recursive calls
    // and each time calls merge()
    // which takes nlog n steps
    // Time Complexity: O(n*log n + 2((n/2)*log(n/2)) +
    // 4((n/4)*log(n/4)) +.....+ 1)
    // Time Complexity: O(logn*(n*log n))
    // i.e. O(n*(logn)^2)
    // Space Complexity: O(1)
    private static void mergeSort(int[] nums, int s, int e) {
        if (s == e)
            return;

        // Calculating mid to slice the
        // array in two halves
        int mid = (s + e) / 2;

        // Recursive calls to sort left
        // and right subarrays
        mergeSort(nums, s, mid);
        mergeSort(nums, mid + 1, e);
        inPlaceMerge(nums, s, e);
    }

    // Driver Code
    public static void main(String[] args) {
        int[] nums = new int[] { 12, 11, 13, 5, 6, 7 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}

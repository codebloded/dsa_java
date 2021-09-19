package searchingSorting;

import java.io.*;

public class kthtwoarray {
    public static int find(int A[], int B[], int m, int n, int k_req) {
        int k = 0, i = 0, j = 0;

        // Keep taking smaller of the current
        // elements of two sorted arrays and
        // keep incrementing k
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                k++;
                if (k == k_req)
                    return A[i];
                i++;
            } else {
                k++;
                if (k == k_req)
                    return B[j];
                j++;
            }
        }

        // If array B[] is completely traversed
        while (i < m) {
            k++;
            if (k == k_req)
                return A[i];
            i++;
        }

        // If array A[] is completely traversed
        while (j < n) {
            k++;
            if (k == k_req)
                return B[j];
            j++;
        }
        return -1;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] A = { 2, 3, 6, 7, 9 };
        int[] B = { 1, 4, 8, 10 };
        int k = 5;

        System.out.println(find(A, B, 5, 4, k));
    }
}

package matrix;

import java.util.*;

public class kth {
    static public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;

        int lower = matrix[0][0];
        int upper = matrix[m - 1][m - 1];

        while (lower < upper) {
            int mid = lower + ((upper - lower) >> 1);
            int count = count(matrix, mid);
            if (count < k) {
                lower = mid + 1;
            } else {
                upper = mid;
            }
        }

        return upper;
    }

    static private int count(int[][] matrix, int target) {
        int m = matrix.length;
        int i = m - 1;
        int j = 0;
        int count = 0;

        while (i >= 0 && j < m) {
            if (matrix[i][j] <= target) {
                count += i + 1;
                j++;
            } else {
                i--;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 25, 29, 37, 48 }, { 32, 33, 39, 50 } };

        int res = kthSmallest(mat, 7);

        System.out.print("7th smallest element is " + res);
    }
}

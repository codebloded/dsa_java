package array;

import java.util.Arrays;

public class chocolate {
    static void chocolate(int[] arr, int n, int k) {
        Arrays.sort(arr);
        long min = Integer.MAX_VALUE;
        for (int i = 0; i <= (n - k); i++) {
            if ((arr[k - 1 + i] - arr[i]) < min)
                min = arr[k - 1 + i] - arr[i];
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };

        int k = 7; // Number of students

        int n = arr.length;
        chocolate(arr, n, k);
    }
}

package array;

import java.util.Scanner;

public class subarray {

    static void solution(int[] arr) {
        int csum = arr[0];
        int osum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (csum >= 0) {
                csum += arr[i];
            } else {
                csum = arr[i];
            }

            if (csum > osum) {
                osum = csum;
            }
        }
        System.out.println(osum);

    }

    public static void main(String args[]) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        solution(a);
    }
}

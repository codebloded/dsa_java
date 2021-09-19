package array;

import java.util.Arrays;
import java.util.Collections;

class mergetwoarr {

    static int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
    static int arr2[] = new int[] { 2, 3, 8, 13 };

    static void merge(int n, int m) {
        int i = 0;
        int temp = 0;

        // While loop till last element
        // of array 1(sorted)
        // is greater than first element
        // of array 2(sorted)
        while (arr1[n - 1] > arr2[0]) {
            if (arr1[i] > arr2[0]) {

                // Swap arr1[i] with first element
                // of arr2 and sorting the updated
                // arr2(arr1 is already sorted)
                // swap(arr1[i],arr2[0]);
                temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
            i++;
        }
    }

    // Driver code
    public static void main(String[] args) {
        merge(arr1.length, arr2.length);

        System.out.print("After Merging \nFirst Array: ");
        System.out.println(Arrays.toString(arr1));

        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }
}
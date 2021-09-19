package array;

import java.lang.Math;

public class duplicates {

    static void printrepet(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0) {
                arr[j] = -arr[j];
            } else {
                System.out.print(j);
            }
        }
    }

    public static void main(String[] args) {
        duplicates duplicate = new duplicates();
        int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
        int arr_size = arr.length;

        duplicate.printrepet(arr, arr_size);
    }
}
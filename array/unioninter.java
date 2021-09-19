package array;

import java.util.HashSet;
import java.util.Set;

public class unioninter {

    static void union(int a[], int b[]) {
        Set<Integer> un = new HashSet<>();
        int n = a.length;
        for (int i = 0; i < n; i++)
            un.add(a[i]);
        int m = b.length;
        for (int i = 0; i < m; i++)
            un.add(b[i]);
        System.out.print(un + " ");
    }

    static void intersection(int a[], int b[]) {
        int i, j;
        i = j = 0;
        int n = a.length;
        int m = b.length;

        Set<Integer> in = new HashSet<>();
        while (i < n && j < m) {
            if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
                j++;
            else {
                in.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.print(in);
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 4, 5, 6, 7 };
        int arr2[] = { 2, 3, 5, 7 };
        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}

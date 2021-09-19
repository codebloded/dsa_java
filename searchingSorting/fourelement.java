package searchingSorting;

import java.util.HashMap;

public class fourelement {
    static class pair {
        int first, second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // The function finds four elements
    // with given sum X
    static void findFourElements(int arr[], int n, int X) {
        // Store sums of all pairs in a hash table
        HashMap<Integer, pair> mp = new HashMap<Integer, pair>();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                mp.put(arr[i] + arr[j], new pair(i, j));

        // Traverse through all pairs and search
        // for X - (current pair sum).
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];

                // If X - sum is present in hash table,
                if (mp.containsKey(X - sum)) {

                    // Making sure that all elements are
                    // distinct array elements and an
                    // element is not considered more than
                    // once.
                    pair p = mp.get(X - sum);
                    if (p.first != i && p.first != j && p.second != i && p.second != j) {
                        System.out.print(arr[i] + ", " + arr[j] + ", " + arr[p.first] + ", " + arr[p.second]);
                        return;
                    }
                }
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 1, 2 };
        int n = arr.length;
        int X = 91;

        // Function call
        findFourElements(arr, n, X);
    }
}

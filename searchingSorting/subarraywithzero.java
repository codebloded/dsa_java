package searchingSorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class subarraywithzero {
    private static <K, V> void insert(Map<K, List<V>> hashMap, K key, V value) {
        // if the key is seen for the first time, initialize the list
        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(value);
    }

    // Function to print all subarrays with a zero-sum in a given array
    public static void printAllSubarrays(int[] A) {
        // create an empty multimap to store the ending index of all
        // subarrays having the same sum
        Map<Integer, List<Integer>> hashMap = new HashMap<>();

        // insert `(0, -1)` pair into the map to handle the case when
        // subarray with zero-sum starts from index 0
        insert(hashMap, 0, -1);

        int sum = 0;

        // traverse the given array
        for (int i = 0; i < A.length; i++) {
            // sum of elements so far
            sum += A[i];

            // if the sum is seen before, there exists at least one
            // subarray with zero-sum
            if (hashMap.containsKey(sum)) {
                List<Integer> list = hashMap.get(sum);

                // find all subarrays with the same sum
                for (Integer value : list) {
                    System.out.println("Subarray [" + (value + 1) + "…" + i + "]");
                }
            }

            // insert (sum so far, current index) pair into the multimap
            insert(hashMap, sum, i);
        }
    }

    public static void main(String[] args) {
        int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        printAllSubarrays(A);
    }
}

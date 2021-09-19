package searchingSorting;

import java.util.*;

public class bishusoldiers {
    // Helper function which returns the sum
    // of series (1^2 + 2^2 +...+ n^2)
    static long squareSeries(long n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    // maxPeople function which returns
    // appropriate value using Binary Search
    // in O(logn)
    static long maxPeople(long n) {

        // Set the lower and higher values
        long low = 0;
        long high = 1000000L;
        long ans = 0L;

        while (low <= high) {

            // Calculate the mid using
            // low and high
            long mid = low + ((high - low) / 2);
            long value = squareSeries(mid);

            // Compare value with n
            if (value <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Return the ans
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        long p = 14;

        System.out.println(maxPeople(p));
    }
}

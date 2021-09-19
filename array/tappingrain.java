package array;

public class tappingrain {
    static int findWater(int arr[], int n) {

        int result = 0;
        int left_max = 0, right_max = 0;
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            if (arr[lo] < arr[hi]) {
                if (arr[lo] > left_max)

                    left_max = arr[lo];
                else
                    result += left_max - arr[lo];
                lo++;
            } else {
                if (arr[hi] > right_max)
                    right_max = arr[hi];

                else
                    result += right_max - arr[hi];
                hi--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;

        System.out.println("Maximum water that " + "can be accumulated is " + findWater(arr, n));
    }
}

// class Test {
// static int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

// // Method for maximum amount of water
// static int findWater(int n) {
// // left[i] contains height of tallest bar to the
// // left of i'th bar including itself
// int left[] = new int[n];

// // Right [i] contains height of tallest bar to
// // the right of ith bar including itself
// int right[] = new int[n];

// // Initialize result
// int water = 0;

// // Fill left array
// left[0] = arr[0];
// for (int i = 1; i < n; i++)
// left[i] = Math.max(left[i - 1], arr[i]);

// // Fill right array
// right[n - 1] = arr[n - 1];
// for (int i = n - 2; i >= 0; i--)
// right[i] = Math.max(right[i + 1], arr[i]);

// // Calculate the accumulated water element by element
// // consider the amount of water on i'th bar, the
// // amount of water accumulated on this particular
// // bar will be equal to min(left[i], right[i]) - arr[i] .
// for (int i = 0; i < n; i++)
// water += Math.min(left[i], right[i]) - arr[i];

// return water;
// }

// // Driver method to test the above function
// public static void main(String[] args) {

// System.out.println("Maximum water that can be accumulated is " +
// findWater(arr.length));
// }
// }
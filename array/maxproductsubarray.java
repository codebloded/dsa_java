package array;

public class maxproductsubarray {
    static long maxproduct(int[] arr, int n) {
        if (n == 0)
            return 0;
        long res = 1;
        long max = 1;
        long min = 1;
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                max *= arr[i];
                min = Math.min(arr[i] * min, 1);
            } else if (arr[i] == 0) {
                max = min = 1;
            } else {
                min += max - (max = min);
                min *= arr[i];
                max = Math.max(1, arr[i] * max);
            }
            res = Math.max(max, res);
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println("Maximum Sub array product is " + maxproduct(arr, arr.length));
    }
}

package array;

import java.util.HashMap;
import java.util.Map;

public class subarrayzero {

    static boolean findsum(int arr[], int n) {
        Map<Integer, Boolean> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0 || map.containsKey(sum))
                return true;
            map.put(sum, true);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 2, -1, 1, 6 };

        System.out.println(findsum(arr, arr.length));
    }

}

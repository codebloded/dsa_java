package array;

public class zeorone {
    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static void sort(int[] arr, int n) {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        printArr(arr, n);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 0, 0, 1, 1, 2, 2 };
        int size = arr.length;
        sort(arr, size);
    }
}

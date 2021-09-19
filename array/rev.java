package array;

public class rev {

    static void revArray(int arr[], int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printarr(int arr[], int arr_size) {
        for (int i = 0; i < arr_size; i++)
            System.out.print(arr[i]);

        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        printarr(arr, 6);
        revArray(arr, 0, 5);
        printarr(arr, 6);

    }
}

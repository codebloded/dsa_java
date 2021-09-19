package array;

public class stocks {
    static int maxprofit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 5, 6, 4 };
        System.out.println(maxprofit(arr));
    }
}

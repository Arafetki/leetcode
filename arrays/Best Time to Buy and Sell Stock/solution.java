class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int k = 0;

        for (int x = 0; x < prices.length; x++) {
            if (prices[x] < prices[k]) {
                k = x;
            } else {
                profit = max(profit, prices[x] - prices[k]);
            }
        }
        return profit;

    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
}
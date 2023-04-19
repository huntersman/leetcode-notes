public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        // benefit
        int[][] dp = new int[prices.length][2];
        // buy
        dp[0][0] = -prices[0];
        // sell
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] - prices[i], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i], dp[i - 1][1]);
        }
        return dp[prices.length - 1][1];
    }
}

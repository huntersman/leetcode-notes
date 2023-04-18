public class IntegerBreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        if (n == 2) {
            return 1;
        }
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, dp[i - j] * j));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        new IntegerBreak().integerBreak(10);
    }
}

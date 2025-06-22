import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1; // More than any possible answer
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        // Fill DP table
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}

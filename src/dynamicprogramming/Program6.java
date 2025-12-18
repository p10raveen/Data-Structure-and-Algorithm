package dynamicprogramming;

public class Program6 {

    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int amount = 4;

        System.out.println(countWays(coins,amount));
    }

    private static int countWays(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 1;

        for(int coin: coins) // coin = 3
        {
            for(int i=coin;i<=amount;i++) // i=4
            {
                dp[i] = dp[i]+dp[i-coin];
            }
        }
        return dp[amount];
    }
}

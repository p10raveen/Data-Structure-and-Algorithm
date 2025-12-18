package dynamicprogramming;

import java.util.Arrays;

public class Program7 {

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println(countWays(coins,amount));
    }

    private static int countWays(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=1;i<=amount;i++) // i=1
        {
            for(int coin:coins) // coin=1
            {
                if(i-coin>=0 && dp[i-coin]!=Integer.MAX_VALUE)
                {
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }

        return dp[amount];
    }
}

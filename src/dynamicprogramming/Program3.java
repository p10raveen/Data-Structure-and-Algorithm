package dynamicprogramming;

public class Program3 {

    static int fib(int num)
    {
        int[] dp = new int[num+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=num;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[num];
    }
    // dp = 0   1   1   2   3   5   8
    //      --------------------------
    //      0   1   2   3   4   5   6

    public static void main(String[] args) {

        System.out.println(fib(6));
    }


}

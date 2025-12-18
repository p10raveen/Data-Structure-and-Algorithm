package dynamicprogramming;

import java.util.Arrays;

public class Program2 {

    int[] dp = new int[100];

    Program2()
    {
        Arrays.fill(dp, -1);
    }

    int fib(int num)
    {
        if(num<=1)
            return dp[num]=num;

        if(dp[num] != -1)
            return  dp[num];

        dp[num] = fib(num-1)+fib(num-2);

        return dp[num];
    }
    // dp =  0  1   1   2   3   5   8
    //      -------------------------------
    //       0  1   2   3   4   5   6
    public static void main(String[] args) {
        Program2 p1 = new Program2();
        System.out.println(p1.fib(6)); // 8
    }
}

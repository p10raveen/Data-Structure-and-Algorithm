package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int[] coins = {1,5,10};
        int amount = 27;
        findMinCoins(coins,amount);
    }

    private static void findMinCoins(int[] coins, int amount) {
        //1. Sort coins
        for(int i=0;i<coins.length-1;i++)
        {
            for(int j=i+1;j<coins.length;j++)
            {
                if(coins[i]<coins[j])
                {
                    int temp = coins[i];
                    coins[i] = coins[j];
                    coins[j] = temp;
                }
            }
        }
        //2. Greedy approach
        ArrayList<Integer> selectedCoins = new ArrayList<>();
        int totalCoins = 0;
        for(int coin:coins)
        {
            while(amount>=coin)
            {
                amount = amount-coin;
                selectedCoins.add(coin);
                totalCoins++;
            }
        }
        // Step-3 Display
        System.out.println("total coins: "+selectedCoins.size());
        System.out.println("Coin used: "+ selectedCoins);

    }
}

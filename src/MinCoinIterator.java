/*
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class MinCoinIterator {
    static int minCoins(int coins[], int m, int V) {
        List<Integer> coinList = Arrays.stream(coins).boxed().collect(Collectors.toList());
        Collections.reverse(coinList);
        int coinUsed = 0;
        int remainingValue = V;
        for (int coin : coinList) {
            for (; remainingValue >= coin; remainingValue -= coin) {
                coinUsed++;
            }
        }
        return coinUsed;
    }


    public static void main(String args[]) {
        int coins[] = {1, 5, 10, 25};
        int m = coins.length;

        System.out.println("Minimum coins required is " + minCoins(coins, m, 11)); // Should be 2
        System.out.println("Minimum coins required is " + minCoins(coins, m, 30)); // Should be 2
        System.out.println("Minimum coins required is " + minCoins(coins, m, 87)); // Should be 6
        System.out.println("Minimum coins required is " + minCoins(coins, m, 98)); // Should be 8
    }
}

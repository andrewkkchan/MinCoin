/*
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
*/

class MinCoinFor {
    static int minCoins(int coins[], int m, int V) {

        int coinUsed = 0;
        int remainingValue = V;
        for (int usingCoin = m - 1; usingCoin >= 0; usingCoin--) {
            for (; remainingValue >= coins[usingCoin]; remainingValue -= coins[usingCoin]) {
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

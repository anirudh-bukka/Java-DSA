package arrays;

/*
Suppose you have been keeping an eye on the stock market for a while, and you have been tracking the daily prices of a particular stock. You want to make a profit
by buying and selling the stock at the right time. Given the array of prices of the stock on each day, you need to figure out the best strategy to maximize your profit.
However, if the stock prices are constantly decreasing, there is no way for you to make a profit.
 */

public class MaximizingStockProfits {
    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        System.out.print(maxProfit(price, 0, n - 1));
    }
    static int maxProfit(int price[], int start, int end)
    {

        // If the stocks can't be bought
        if (end <= start)
            return 0;

        // Initialise the profit
        int profit = 0;

        // The day at which the stock
        // must be bought
        for (int i = start; i < end; i++) {

            // The day at which the
            // stock must be sold
            for (int j = i + 1; j <= end; j++) {

                // If buying the stock at ith day and
                // selling it at jth day is profitable
                if (price[j] > price[i]) {

                    // Update the current profit
                    int curr_profit
                            = price[j] - price[i]
                            + maxProfit(price, start, i - 1)
                            + maxProfit(price, j + 1, end);

                    // Update the maximum profit so far
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
}

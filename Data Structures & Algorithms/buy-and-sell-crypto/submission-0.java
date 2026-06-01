class Solution {
    public int maxProfit(int[] prices) {
        int sellIndex = 1;
        int buyIndex = 0;
        // Profit calculated by: prices[buyIndex] - prices[sellIndex]
        int profit = 0;
        while (buyIndex < sellIndex && sellIndex < prices.length) {
            if (prices[sellIndex] - prices[buyIndex] > profit) {
                profit = prices[sellIndex] - prices[buyIndex];
                System.out.println(profit);
            }
            // sell price is greater, dont do anyting
            if (prices[buyIndex] < prices[sellIndex]) {
            }
            // sell price is less than buy, this becomes the new buy price
            else {
                buyIndex = sellIndex;
                sellIndex = buyIndex;
            }

            sellIndex++;

        }
        return profit;
    }
}

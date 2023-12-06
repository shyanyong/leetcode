public class BestTimeToBuyAndSellStockII {
    static class Solution {
        public static int maxProfit(int[] prices) {
            int profit = 0;
            int left = 0;
            int right = 1;

            while (right < prices.length) {
                if (prices[left] < prices[right]) {
                    profit += prices[right] - prices[left];
                    left++;
                    right++;
                } else {
                    left = right;
                    right++;
                }
            }

            return profit;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println(BestTimeToBuyAndSellStockII.Solution.maxProfit(arr));
    }
}

public class BestTimeToBuyAndSellStock {
    static class Solution {
        public static int maxProfit(int[] prices) {
            int left = 0;
            int right = 1;
            int profit = 0;

            while (right < prices.length) {
                if (prices[left] < prices[right]) {
                    System.out.println(left);
                    System.out.println(right);
                    int curr = prices[right] - prices[left];

                    if (curr > profit) {
                        profit = curr;
                    }

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
        int[] arr = {1,2,4,2,5,7,2,4,9,0,9};

        System.out.println(Solution.maxProfit(arr));
    }
}
